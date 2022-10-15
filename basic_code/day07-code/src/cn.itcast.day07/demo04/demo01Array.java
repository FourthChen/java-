package cn.itcast.day07.demo04;

//定义一个数组，用来存储三个person对象
public class demo01Array {

    public static void main(String[] args) {
        //先创建一个长度为3的数组

        person [] array=new person[3];


        person one=new person("迪丽热巴",18);
        person teo=new person("古力娜扎",28);
        person three=new person("马儿扎哈",38);

        array[0]=one;
        array[1]=teo;
        array[2]=three;

        person per=array[1];
        System.out.println(per.getName());

    }


}
