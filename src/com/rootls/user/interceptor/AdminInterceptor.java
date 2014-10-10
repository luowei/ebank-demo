package com.rootls.user.interceptor;

import com.rootls.common.NeedLogin;
import com.rootls.user.Admin;
import com.rootls.user.AdminRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-4-12
 * Time: 上午9:50
 * To change this template use File | Settings | File Templates.
 */
public class AdminInterceptor extends HandlerInterceptorAdapter {

    private static Log log = LogFactory.getLog(AdminInterceptor.class);

    private AdminRepository adminRepository;
    private String loginUrl = "/login.jsp";

    @Resource
    public void setAdminRepository(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public AdminInterceptor() {
        super();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (true)
            return true;

        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        Method method = ((HandlerMethod) handler).getMethod();
        boolean needLogin = hasLoginAnotation(method.getDeclaringClass(), method);
        //是否需要登录
        if (!needLogin) {
            return true;
        }

        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (admin == null) {
            admin = getUserFormCookies(request);
            if (admin == null || admin.getUserId() == null) {

                response.sendRedirect(loginUrl);
                return false;
            }
            admin = adminRepository.findAdminByAdmin(admin);
            if (admin == null) {
                response.sendRedirect(loginUrl);
                return false;
            }
            request.getSession().setAttribute("admin", admin);
        }

//        System.out.println(admin.getTruename());

        return super.preHandle(request, response, handler);
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    private Admin getUserFormCookies(HttpServletRequest request) {
        Cookie[] cookie = request.getCookies();
        String userid = null;
        String username = null;
        String password = null;    // 临时密码
        if (cookie != null) {

            for (int n = 0; n < cookie.length; n++) {
                Cookie newCookie = cookie[n];
                if (newCookie.getName().equals("exp%5Fadmin%5Fuserid")) {
                    userid = cookie[n].getValue();
                    userid = transactSQLInjection(userid);
                }

                if (newCookie.getName().equals("exp%5Fadmin%5Fusername")) {
                    username = cookie[n].getValue();
                    username = transactSQLInjection(username);
                }

                if (newCookie.getName().equals("exp%5Fadmin%5Fpassword")) {
                    password = cookie[n].getValue();
                    password = transactSQLInjection(password);
                }
            }
        }
        if (userid == null || !isNumeric(userid)) {
            return null;
        }
        return new Admin(Integer.valueOf(userid), username, password);
    }

    public String transactSQLInjection(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return str.replaceAll(".*([';]+|(--)+).*", " ");
    }

    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 没有NeedLogin注释，返回true；有NeedLogin注释，返回注释的值
     *
     * @param clazz
     * @param method
     * @return
     */
    private boolean hasLoginAnotation(Class clazz, Method method) {

        NeedLogin methodAnnotation = method.getAnnotation(NeedLogin.class);
        if (method.isAnnotationPresent(NeedLogin.class)) {
            return methodAnnotation.value();
        }

        Annotation clazzAnnotation = clazz.getAnnotation(NeedLogin.class);
        if (clazz.isAnnotationPresent(NeedLogin.class)) {
            return ((NeedLogin) clazzAnnotation).value();
        } else {
            return true;
        }
    }

}
