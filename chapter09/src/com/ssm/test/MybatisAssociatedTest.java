package com.ssm.test;

import com.ssm.po.Student;
import com.ssm.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

public class MybatisAssociatedTest {
    /*嵌套查询*/
    @Test
    public void findStudentByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSession();

        Student student = sqlSession.selectOne("com.ssm.mapper.StudentMapper.findStudentById",1);
        System.out.println(student.toString());
        sqlSession.close();
    }
}
