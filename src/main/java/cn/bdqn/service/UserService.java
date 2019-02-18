package cn.bdqn.service;

import cn.bdqn.pojo.User;

public interface UserService {
    User login(String name,String pwd);
}
