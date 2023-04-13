package mybatis.mapper;

import mybatis.pojo.c_course;
import mybatis.pojo.s_school;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {

    //2. 查询出所有计算机学院开设的课程信息 ；
    List<c_course> CheckCourseBySdept(@Param("name") String name);
    //5. 输出所有的学院开设的课程信息。
     List<s_school> ShowAllDept();
}
