package cn.itcast.JDBCTemplate;

import cn.itcast.JDBCUtils.JDBCUtils;
import cn.itcast.demain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
1.修改1号数据的salary为10000
2.添加一条记录
3.删除一条记录
4.查询id为1的记录，将其封装为Map集合
5.查询所有记录，将其封装为List
6.查询所有记录，将其封装为Emp对象的List对象
7.查询总记录数
 */
public class JDBCTemplateDemo02 {
    //Junit单元测试，可以让方法独立执行

    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    //2.定义sql
    /**
     * 1.修改1号数据的salary为10000
     */
    @Test
    public void test1(){

        //2.定义sql
        String sql="update emp set salary= 10000 where id=1001";
        //3.执行sql
        int update = template.update(sql);
        System.out.println(update);
    }
    /**
     * 2.添加一条记录
     */
    @Test
    public void test2(){

        //2.定义sql
        String sql="insert into emp(id,ename,dept_id) values(?,?,?)";
        int update = template.update(sql, 1015, "郭靖", 10);
        System.out.println(update);
    }
    /**
     * 3.删除一条记录
     */
    @Test
    public void test3(){
        String sql=" delete from emp where id=?";
        int update = template.update(sql, 1015);
        System.out.println(update);
    }
    /**
     * 4.查询id为1001的记录，将其封装为Map集合
     * 注意：查询的结果集只能是一条记录
     */
    @Test
    public void test4(){
        String sql="select * from emp where id=?";
        Map<String, Object> map = template.queryForMap(sql,1001);
        System.out.println(map);//{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}

    }
    /**
     * 5.查询所有记录，将其封装为List
     */
    @Test
    public void test5(){
        String sql="select * from emp";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
    /**
     * 6.查询所有记录，将其封装为Emp对象的List对象
     */
    @Test
    public void test6_1(){
        String sql="select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void test6_2(){
        String sql="select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
    /**
     * 7.查询总记录数
     */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
