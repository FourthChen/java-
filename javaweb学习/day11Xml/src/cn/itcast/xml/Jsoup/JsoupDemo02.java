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
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象，根据xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        //2.1解析xml文档，加载文档进内存，获取dom树---> Document
//        Document document = Jsoup.parse(new File(path), "utf-8");
        String str="<students>\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name id=\"itcast\">\n" +
                "\t\t\t<xing>张</xing>\n" +
                "\t\t\t<ming>三</ming>\n" +
                "\t\t</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>jack</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);
    }
}
