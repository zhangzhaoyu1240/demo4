package cn.bdqn.service.impl;

import cn.bdqn.dao.StudentMapper;
import cn.bdqn.pojo.Student;
import cn.bdqn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getList() {
        return studentMapper.getList();
    }

    @Override
    public int delId(int id) {
        return studentMapper.delId(id);
    }

    @Override
    public int addStu(Student student) {
        return studentMapper.addStu(student);
    }

    @Override
    public int updStu(Student student,int id) {
        return studentMapper.updStu(student,id);
    }

    @Override
    public Student getOne(int id) {
        return studentMapper.getOne(id);
    }
}
