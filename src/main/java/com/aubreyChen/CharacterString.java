package com.aubreyChen;

import java.util.Arrays;

public class CharacterString {
    public static void main(String[] args) {
        // Java里的String是只读变量，是不可变的；C++里的string是可以变长的，里面的元素是可以修改的。
        // Java里的String不可变长。如果在其后加一个新的字符串的话，不是在当前字符串后面加，而是创造出了一个新串。
//        String a = "Hello ";
//        System.out.println(a.hashCode());
//        a += "World";
//        System.out.println(a.hashCode());  // 会发现拼接后a变量的地址发生变化了

//        String b = "My name is ";
//        // Java里所以对象的赋值都是传引用，内容是不变的。
//        String x = b;
//        // ❌原：b.hashCode()返回的是每一个变量指向物理地址的哈希值。
          //🔺更正：默认是返回物理地址的哈希值，但是String里面把hashCode()重载了，故String里的hashCode()函数返回的是字符串的哈希值。
//        System.out.println(b.hashCode());
//        System.out.println(x.hashCode());

        // String可以通过加号实现两个字符串的拼接
//        String c = b + "Aubrey Chen";
//        System.out.println(c);

        // 如果将一个字符串String与其他类型的变量拼接在一起的话，会默认将其他类型的变量转换为String
//        String d = "My age is " + 18;  // int会被隐式转化成字符串“18”

        // 格式化字符串：将其他类型的变量转化为String。
        // 类似于C++中的sprintf，和Python中的"My age is %d" % (18)
        String str = String.format("My age is %d", 18);
        System.out.println(str);

        // 将String类型的变量转化为其他类型的变量
        String pi_str = "3.14159265358979";
        // 大写首字母Double是这个double基本类型的对象类型
        double pi = Double.parseDouble(pi_str);  // 将一个字符串转化为double类型
//        Integer.parseInt();  // 将一个整数从字符串中提取出来
//        Float.parseFloat();
//        Long.parseLong();
        System.out.println(pi);

        String s = "Hello World\n";
        // Java里字符串的长度length()是要加小括号的，它是一个方法；数组的长度length是不要加小括号的，它是一个属性。
        for (int i = 0; i < s.length(); i ++ )
            System.out.print(s.charAt(i));  // 等价于s[i]

        //   常用API：
        // · length()：返回长度
        // · split(String regex)：分割字符串
        // · indexOf(char c)、indexOf(String str)：查找，找不到返回-1
        // · equals()：判断两个字符串是否相等，注意不能直接用==
        // · compareTo()：判断两个字符串的字典序大小，负数表示小于，0表示相等，正数表示大于
        // · startsWith()：判断是否以某个前缀开头
        // · endsWith()：判断是否以某个后缀结尾
        // · trim()：去掉首尾的空白字符
        // · toLowerCase()：全部用小写字符
        // · toUpperCase()：全部用大写字符
        // · replace(char oldChar, char newChar)：替换字符
        // · replace(String oldRegex, String newRegex)：替换字符串
        // · substring(int beginIndex, int endIndex)：返回[beginIndex, endIndex)中的子串

//        String a = "Hello World";
//        String[] strs = a.split("\\s+");  // split()可以支持正则表达式
//        System.out.println(Arrays.toString(strs));
//        System.out.println(a.indexOf('o'));
//        System.out.println(a.indexOf("Wo"));

        String a ="abcabc", b = "aaa";
//        System.out.println(a.equals(b));
        // 负数——小于，0——相等，正数——大于
        System.out.println(a.compareTo(b));
        // 判断字符串是否以某个字符串开头/结尾
        System.out.println(a.startsWith("abc"));
        System.out.println(a.endsWith("def"));

        // 去掉字符串中的前后的空白字符
        String c = "   ace   ";
        System.out.println(c.trim());

        // 将字符串里的字母全部变成大/小写
        System.out.println(a.toUpperCase());
        // 将字符串里的所有字母'a'变成字母'x'
        System.out.println(a.replace('a', 'x'));
        // 将字符串里的所有字符串'ab'变成字母'x'
        System.out.println(a.replace("ab", "x"));


        // C++里的substr(, )第一个参数是起点，第二个参数是长度。而Java里的substring(, )第一个参数是起点，第二个参数是终点的下一位。
        System.out.println(a.substring(2, 4));  // 左闭右开的区间：[2, 4)，截取的字符串为原字符串下标为2, 3的两个字符

        // String不能被修改，如果打算修改字符串，可以使用StringBuilder和StringBuffer来实现String的动态变长。
        // StringBuffer线程安全，速度较慢（多线程时使用）；StringBuilder线程不安全，速度较快。（单线程时使用）
        StringBuffer sb = new StringBuffer("Hello ");  // 初始化
        sb.append("World");  // 拼接字符串
        sb.reverse();  // sb是可以修改的，是在自己本身reverse翻转字符串，不会返回一个新的。
        System.out.println(sb);

        // 读取字符chatAt();  写入字符setChatAt()。
        for (int i = 0; i < sb.length(); i ++ )
            sb.setCharAt(i, (char) (sb.charAt(i) + 1));  // 相当于C++里的sb[i] ++ ;
        System.out.println(sb);

//        for (int i = 0; i < 30000; i ++ )
//            sb.append("a");  // 拼接字符串
//        System.out.println(sb);

    }
}
