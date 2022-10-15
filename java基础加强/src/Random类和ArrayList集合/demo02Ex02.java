package Random类和ArrayList集合;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 键盘录入学生信息，保存到集合中。
 * 循环录入的方式，1：表示继续录入，0：表示结束录入。
 * 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
 * 使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
 */
public class demo02Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true){
            System.out.println("1.录入信息 0.退出");
            System.out.println("请输入你需要的操作编号：");
            int i = scanner.nextInt();
            if (i==1){
                inputStu(list,scanner);
                System.out.println("录入完毕！");
            }
            if (i==0){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.show();
        }
    }
    private static void inputStu(ArrayList<Student> list,Scanner sc){
        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        Student student = new Student(name, age);
        list.add(student);
    }
}
