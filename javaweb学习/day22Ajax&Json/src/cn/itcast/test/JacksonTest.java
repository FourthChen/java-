package cn.itcast.test;

import cn.itcast.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class JacksonTest {


    //java对象转为JSON对象
    @Test
    public void test1() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");


        //2.创建Jackson的核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换
        /*
        1. 转换方法：
						* writeValue(参数1，obj):
		                    参数1：
		                        File：将obj对象转换为JSON字符串，并保存到指定的文件中
		                        Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
		                        OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
		                * writeValueAsString(obj):将对象转为json字符串

					2. 注解：
						1. @JsonIgnore：排除属性。
						2. @JsonFormat：属性值得格式化
							* @JsonFormat(pattern = "yyyy-MM-dd")

					3. 复杂java对象转换
						1. List：数组
						2. Map：对象格式一致
         */
        String json = mapper.writeValueAsString(p);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男"}

//        //writeValue，将数据写入d://a.txt 文件中
//        mapper.writeValue(new File("d://a.txt"),p);

        //writeValue.将数据关联到Writer中
        mapper.writeValue(new FileWriter("d://b.txt"),p);
    }

    @Test
    public void test2() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());


        //2.创建Jackson的核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换

        String json = mapper.writeValueAsString(p);
        System.out.println(json);

    }

    @Test
    public void test3() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());

        //创建List集合
        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        people.add(p1);
        people.add(p2);


        //2.创建Jackson的核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换

        String json = mapper.writeValueAsString(people);
        System.out.println(json);

    }

    @Test
    public void test4() throws Exception {
        //1.创建Map对象
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","李四");
        map.put("age",12);


        //2.创建Jackson的核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换

        String json = mapper.writeValueAsString(map);
        System.out.println(json);

    }
    //Json字符串转为Java对象
    @Test
    public void test5() throws Exception {
       //1.初始化Json字符串
        String json="{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";
        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        //3.调用mapper方法
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}

