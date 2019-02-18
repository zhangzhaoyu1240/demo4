package cn.bdqn.controller;

import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;

import jdk.nashorn.internal.ir.RuntimeNode;

import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.security.auth.message.callback.SecretKeyCallback;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
   @Resource(name = "userService")
    private UserService userService;
   @RequestMapping("/logindo")
   public String logindo(){

       return "index";
   }
    @RequestMapping("/login")
    public String login(User user,HttpSession session){
        System.out.print( user.getName()+" "+user.getPassword());
        User u=userService.login(user.getName(),user.getPassword());
        if(u!=null){
            session.setAttribute("user",u);
            return "redirect:/getAll";

        }else{
            return "redirect:/logindo";
        }

    }



}
