package com.rootls.user;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by luowei on 2014/8/15.
 */
@Component
public class AdminRepository extends JdbcDaoSupport {

    @Resource(name = "expertDataSource")
    private DataSource dataSource;

    @PostConstruct
    void init() {
        setDataSource(dataSource);
    }

    public Admin findAdminByAdmin(final Admin admin){

        final String sql = "select TOP 1 a.id,a.truename,a.mastergrade,a.temppwd ,b.name  from VIEW_Lz_Admin_list a " +
                "inner join pcdb.dbo.guestbook b on a.id=b.id  where a.id=? and temppwd=? ";

        return getJdbcTemplate().query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1,admin.getUserId());
                ps.setString(2,admin.getPassword());
                return ps;
            }
        },new ResultSetExtractor<Admin>() {
            @Override
            public Admin extractData(ResultSet rs) throws SQLException, DataAccessException {
                Admin admin1 = null;
                if(rs.next()){
                    admin1 = new Admin(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("temppwd"),
                            rs.getString("truename"),
                            rs.getInt("mastergrade")
                    );
                }
                return admin1;
            }
        });
    }

}
