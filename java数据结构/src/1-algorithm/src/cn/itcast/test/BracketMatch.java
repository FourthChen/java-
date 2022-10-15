package cn.itcast.test;

import cn.itcast.linear.Stack;

//括号匹配的问题
public class BracketMatch {
    public static void main(String[] args) {
        String str = "(上海(长安)())";
        boolean match = isMatch(str);
        System.out.println("‘"+str+"'"+"中的括号是否匹配："+match);
    }
    /**
     * 判断str中的括号是否匹配
     * @param str 括号组成的字符串
     * @return 如果匹配，返回true，如果不匹配，返回false
     */
    public static boolean isMatch(String str){
        /*
        1.创建一个栈用来存储左括号
        2.从左往右遍历字符串，拿到每一个字符
        3.判断该字符是不是左括号，如果是，放入栈中存储
        4.判断该字符是不是右括号，如果不是，继续下一次循环
        5.如果该字符是右括号，则从栈中弹出一个元素t；
        6.判断元素t是否为null，如果不是，则证明有对应的左括号，如果不是，则证明没有对应的左括号
        7.循环结束后，判断栈中还有没有剩余的左括号，如果有，则不匹配，如果没有，则匹配
         */
        //1.创建一个栈用来存储左括号
        Stack<String> chars = new Stack<>();
        //2.从左往右遍历字符串，拿到每一个字符
        for (int i = 0; i < str.length(); i++) {
            String currChar=str.charAt(i)+ "";
            // 3.判断该字符是不是左括号，如果是，放入栈中存储
            if (currChar.equals("(")){
                chars.push(currChar);
            }
            //4.判断该字符是不是右括号，如果不是，继续下一次循环
            else if (currChar.equals(")")){
                //5.如果该字符是右括号，则从栈中弹出一个元素t；
                String popChar = chars.pop();
                //6.判断元素t是否为null，如果不是，则证明有对应的左括号，如果不是，则证明没有对应的左括号
                if (popChar==null){
                    return false;
                }
            }
        }
        //7.循环结束后，判断栈中还有没有剩余的左括号，如果有，则不匹配，如果没有，则匹配
        if (chars.size()==0){
            return true;
        }else {
            return false;
        }
    }

}
