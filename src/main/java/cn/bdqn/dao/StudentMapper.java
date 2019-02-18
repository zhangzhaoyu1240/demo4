package cn.bdqn.dao;

import cn.bdqn.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    /**
     * 查询
     * @return
     */
    List<Student> getList();

    /**
     * 删除
     * @param id
     * @return
     */
    int  delId(@Param("id") int id);

    /**
     * 添加
     * @param student
     * @return
     */
    int addStu(@Param("stu") Student student);

    /**
     * 修改
     * @param student
     * @param id
     * @return
     */
    int updStu(@Param("stu") Student student,@Param("id")int id);

    /**
     * 单个查
     * @param id
     * @return
     */
    Student getOne(@Param("id") int id);
}
