import mybatis.mapper.CourseMapper;
import mybatis.mapper.SchoolMapper;
import mybatis.pojo.c_course;
import mybatis.pojo.s_school;
import mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CourseDesignTest {
    //1. 查询 id=2 的课程信息；
    @Test
    public void CheckCourseById(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
        c_course course=new c_course(2,null,null,null);
        List<c_course> list=mapper.CheckCourseById(course);
        list.forEach(System.out::println);
    }

    // 2. 查询出所有计算机学院开设的课程信息 ；
    @Test
    public void CheckCourseBySdept(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        SchoolMapper mapper=sqlSession.getMapper(SchoolMapper.class);
        List<c_course> courses = mapper.CheckCourseBySdept("计算机学院");
        courses.forEach(System.out::println);
    }
    //checkAll
    //3. 将 id=4 这⻔课程的课时数修改为 32+8=40；
    @Test
    public void ChangeById(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
        mapper.ChangeById(4,40);
        CourseMapper mapper1=sqlSession.getMapper(CourseMapper.class);
        c_course course=new c_course(4,null,null,null);
        List<c_course> list=mapper1.CheckCourseById(course);
        list.forEach(System.out::println);
    }
    //4. 插⼊⼀条新的课程记录： names=”⼤数据存储“，hours=32，schools =1；
    @Test
    public void InsertNew(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
       mapper.InsertNew(null,"大数据存储",32,1);
       ShowAll();
    }
    //5. 输出所有的学院开设的课程信息。
    @Test
    public void ShowAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
      SchoolMapper mapper=sqlSession.getMapper(SchoolMapper.class);
        List<s_school> list= mapper.ShowAllDept();
        list.forEach(System.out::println);
//             SqlSession sqlSession= SqlSessionUtil.getSqlSession();
//        DeptMapper mapper=sqlSession.getMapper(DeptMapper.class);
//Dept dept=mapper.getDeptAndEmpByDeptId(1);
//        System.out.println(dept);
//        sqlSession.close();
    }

}
