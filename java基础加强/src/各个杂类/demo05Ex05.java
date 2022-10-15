package 各个杂类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 */
public class demo05Ex05 {
    public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormate类，并指定格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //调用df1的parse(String str)方法传入2018-03-04,得到对应日期类型
        Date parse = dateFormat.parse("2018-03-04");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = df2.format(parse);
        System.out.println(format);
    }
}
