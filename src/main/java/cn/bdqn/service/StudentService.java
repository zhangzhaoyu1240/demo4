package cn.bdqn.service;

import cn.bdqn.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getList();
    int  delId(int id);
    int addStu(Student student);
    int updStu(Student student,int id);
    Student getOne(int id);
}
