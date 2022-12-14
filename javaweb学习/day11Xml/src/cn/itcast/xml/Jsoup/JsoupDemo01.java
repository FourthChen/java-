package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


/*
Jsoup快速入门
 */
public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象，根据xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //2.1解析xml文档，加载文档进内存，获取dom树---> Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素 对象
        Elements elements = document.getElementsByTag("name");
        //3.1获取第一个name的Element对象
        Element element = elements.get(0);
        //3.2获取数据
        String name = element.text();
        System.out.println(name);
    }
}
