package mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
public static SqlSession getSqlSession(){
    SqlSession sqlSession=null;
    try {
        //获取配置文件的核心输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//获取SqlSessionBuilder对象
        SqlSessionFactoryBuilder sql=new SqlSessionFactoryBuilder();
//获取SqlSessionFactory对象
        SqlSessionFactory sqlf=sql.build(is);
/**
 //获取sql的会话对象SqlSession，是Mybatis提供的操作数据库的对象(但这个会话对象不会自动提交事务)
 //    SqlSession sqlSession= sqlf.openSession();
 */
//这个会自动提交事务
        sqlSession= sqlf.openSession(true);

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return sqlSession;
}


}
