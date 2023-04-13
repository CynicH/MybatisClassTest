package mybatis.mapper;

import mybatis.pojo.c_course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    //1. 查询 id=2 的课程信息；
    List<c_course> CheckCourseById(c_course course);
    //3. 将 id=4 这⻔课程的课时数修改为 32+8=40；
    void ChangeById(@Param("id") Integer id, @Param("number") Integer number);
    //4. 插⼊⼀条新的课程记录： names=”⼤数据存储“，hours=32，schools =1；
    void InsertNew(@Param("id") Integer id,@Param("name") String name,@Param("hours") Integer hours,@Param("school") Integer school);
}
