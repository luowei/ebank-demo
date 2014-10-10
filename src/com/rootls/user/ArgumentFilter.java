package com.rootls.user;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 14-3-19
 * Time: 上午10:44
 * To change this template use File | Settings | File Templates.
 */
public class ArgumentFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(new RequestWrapper( (HttpServletRequest)servletRequest ), servletResponse);
        return;
    }

    @Override
    public void destroy() {
    }

    public class RequestWrapper extends HttpServletRequestWrapper {
        public RequestWrapper(HttpServletRequest request) {
            super(request);
        }

        public String[] getParameterValues(String parameter) {

//        System.out.println("Trimming parameters...");
            String[] results = super.getParameterValues(parameter);

            if (results == null) {
                return null;
            }

            int count = results.length;

            String[] trimResults = new String[count];

            for (int i = 0; i < count; i++) {
                trimResults[i] = results[i].trim();
                trimResults[i] = trimResults[i].replace("<", "");
                trimResults[i] = trimResults[i].replace(">", "");
                trimResults[i] = trimResults[i].replace("'", "");
                trimResults[i] = trimResults[i].replace("\"", "");
                trimResults[i] = trimResults[i].replace("%3E", "");
                trimResults[i] = trimResults[i].replace("%3C", "");
            }


            return trimResults;
        }

        public Object getAttribute(String name) {
            Object val = super.getAttribute(name);
            if(val!=null && val instanceof String ){
                String value = String.valueOf(val).trim().replace("'","");
                return value;
            }
            return super.getAttribute(name);
        }
    }

}
