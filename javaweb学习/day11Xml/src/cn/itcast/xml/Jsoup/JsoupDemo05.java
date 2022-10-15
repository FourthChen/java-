package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.io.File;
/*
Jsoup快速入门
 */
public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象，根据xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
        //2.1解析xml文档，加载文档进内存，获取dom树---> Document
        Document document = Jsoup.parse(new File(path), "utf-8");

        //3.查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("===========");
        //4.查询id值为itcast的元素
        Elements select = document.select("#itcast");
        System.out.println(select);
        System.out.println("================");
        //5.获取student标签并且number值为heima_00001的age子标签
        //5.1
        Elements select2 = document.select("student[number=\"heima_0001\"] >age");
        System.out.println(select2);
        
    }
}
