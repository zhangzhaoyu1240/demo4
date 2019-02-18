package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    User login(@Param("name") String name, @Param("pwd") String pwd);
}
