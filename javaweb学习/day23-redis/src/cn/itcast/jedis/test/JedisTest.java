package cn.itcast.jedis.test;

import cn.itcast.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Jedis的测试类
public class JedisTest {
    /*
    快速入门
     */
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        jedis.set("usename1","zhangsan");
        //3.关闭连接
        jedis.close();
    }
    /*
    String 数据结构操作
     */
    @Test
    public void test2(){
        //1.获取连接
        Jedis jedis=new Jedis();//如果使用空参构造，默认值是localhost和6379端口
        //2.操作
        //存储
        jedis.set("usename2","zhangsan");
        //获取
        String usename1 = jedis.get("usename2");
        System.out.println(usename1);

        //可以使用setex()方法存储可以指定过期时间的key value
        jedis.setex("activecode",20,"hehe");//将 activecode：hehe键值对存入redis，并且20秒后自动删除

        //3.关闭连接
        jedis.close();
    }
    /*
    hash数据结构操作
     */
    @Test
    public void test3(){
        //1.获取连接
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        //存储
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");
        //获取hash
        String age = jedis.hget("user", "age");
        System.out.println(age);
        //获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");
        System.out.println(user);
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            String value = user.get(key);
            System.out.println(value);
        }
        //3.关闭连接
        jedis.close();
    }

    /*
   List 数据结构操作
    */
    @Test
    public void test4(){
        //1.获取连接
        Jedis jedis=new Jedis();//如果使用空参构造，默认值是localhost和6379端口
        //2.操作
        //存储
        jedis.lpush("mylist","a","b","c");//从左边存
        jedis.rpush("mylist","a","b","c");//从右边存
        //list范围获取
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        //list弹出
        String mylist1 = jedis.lpop("mylist");
        System.out.println(mylist1);
        String mylist2 = jedis.rpop("mylist");
        System.out.println(mylist2);
        //3.关闭连接
        jedis.close();
    }

    /*
  Set 数据结构操作
   */
    @Test
    public void test5(){
        //1.获取连接
        Jedis jedis=new Jedis();//如果使用空参构造，默认值是localhost和6379端口
        //2.操作
        //存储
        jedis.sadd("myset","java","c++","php");
        //获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        //3.关闭连接
        jedis.close();
    }
    /*
    sortedet 数据结构操作
    */
    @Test
    public void test6(){
        //1.获取连接
        Jedis jedis=new Jedis();//如果使用空参构造，默认值是localhost和6379端口
        //2.操作
        //存储
        jedis.zadd("myset1",3,"php");
        jedis.zadd("myset1",2,"c++");
        //获取
        Set<String> myset = jedis.zrange("myset1",0,-1);
        System.out.println(myset);
        //3.关闭连接
        jedis.close();
    }
    /*
    jedis连接池使用
     */
    @Test
    public void test7(){
        //0.创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.创建jedis连接池对象
        JedisPool jedisPool = new JedisPool();
        //2.获取连接
        Jedis jedis = jedisPool.getResource();
        //3.使用
        jedis.set("hehe","hhhh");

        //4.关闭，归还到连接池中
        jedis.close();
    }

    /*
   jedis连接池工具类使用
    */
    @Test
    public void test8(){
        //通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();
        //3.使用
        jedis.set("halou","hhhh");

        //4.关闭，归还到连接池中
        jedis.close();
    }
}
