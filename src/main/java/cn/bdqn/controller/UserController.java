package cn.bdqn.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.bdqn.pojo.Student;
import cn.bdqn.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource(name="studentService")
    private StudentService studentService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
       List<Student> getAl= studentService.getList();
       model.addAttribute("getAll",getAl);
       return "show";
    }

    @RequestMapping("/del")
    public String del(int  id){
        System.out.print("1111111");
        //if(id==0) {
            int sid = studentService.delId(id);
            return "redirect:/getAll";
       // }else {
           // return  "redirect:/logindo";
      //  }
    }

    @RequestMapping("/addStudo")
    public  String addStudo(){
        return  "add";
    }

    @RequestMapping("/addStu")
    public  String addStu(Student student){
            if(student.getName()==""&&student.getName().equals("")&&student.getName()==null)
            {
                int i= studentService.addStu(student);
                if(i>0){
                    return "redirect:/getAll";
                }else{
                    return "add";
                }

            }else{
                return  "redirect:/logindo";
            }

    }
    @RequestMapping("/updStudo")
    public String updStudo(int id, Model model){
        Student s= studentService.getOne(id);
        model.addAttribute("s",s);
        return "upd";
    }
    @RequestMapping("/updStu")
    public String updStu(Student student,int id) {
        System.out.print(student.getName());
        if (student.getName() == "" && student.getName().equals("") && student.getName() == null){
            int i = studentService.updStu(student, id);
            if (i > 0) {
                return "redirect:/getAll";
            } else {
                return "upd";
            }
        }else{
            return  "redirect:/logindo";
        }
    }
}
