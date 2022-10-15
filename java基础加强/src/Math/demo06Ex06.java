package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class demo06Ex06 {
    static ArrayList<User> list=new ArrayList<>();
    static {
        list.add(new User("jack","1234"));
        list.add(new User("jack","2345"));
        list.add(new User("jack","3456"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        User  u = new User(username,password);
        String login = login(u);
        System.out.println("登录结果:"+login);
    }
    public static String login(User user){
        String msg="";
        String username = user.getUsername();
        String pwd = user.getPwd();
        for (int i = 0; i < list.size(); i++) {
            User user1 = list.get(i);
            String username1 = user1.getUsername();
            String pwd1 = user1.getPwd();
            if (username.equals(username1)){
                if (pwd1.equals(pwd)){
                    return "登录成功";
                }else {
                    return "密码错误";
                }
            }else {
                msg="用户名不存在";
            }
        }
        return msg;
    }
}
