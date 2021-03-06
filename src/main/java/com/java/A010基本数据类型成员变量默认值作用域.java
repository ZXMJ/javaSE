package com.java;

public class A010基本数据类型成员变量默认值作用域 {

    /**
     * 基本数据类型的变量的生命周期是由它的作用域决定的,它的生命周期可以确定,它存放在堆栈中;
     * 对象引用的生命周期也是由它的作用域决定的,它的生命周期也可以确定,它也存放在堆栈中,
     * 但是java对象的生命周期并不是由它的作用域决定的,当不再有引用指向一个对象时,这个对象就成为了一个垃圾, 会在垃圾回收器执行时,被清理,
     * 对象的生命周期并不确定,它存放在堆中。
     */
    // 基本数据类型
    boolean b;
    char c;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;
    // 对象类型String
    String str;

    public static void main(String[] args) {
        A010基本数据类型成员变量默认值作用域 demo = new A010基本数据类型成员变量默认值作用域();
        // boolean默认false
        System.out.println(demo.b);
        /**
         * char 类型的值可以表示为十六进制值,其范围从Unicode编码的\u0000到\uffff(不区分大小写;中文范围4E00-9FA5)
         * Unicode码扩展自ASCII字元集
         */
        // Unicode转义序列\ u还可以出现在加引号的字符常量或字符串之外(而其他所有转义序列不可以)
        // Unicode转义序列如下( Unicode 转义序列会在解析代码之前得到处理)
        // \b 退格 \u0008
        // \" 双引号 \u0022
        // \t 制表 \u0009
        // \' 单引号 \u0027
        // \n 换行 \u000a
        // \\ 反斜杠 \u005c
        // \r 回车 \u000d
        // char默认\u0000
        System.out.println(demo.c);
        // byte默认0(byte)
        System.out.println(demo.by);
        // short默认0(short)
        System.out.println(demo.s);
        // int默认0
        System.out.println(demo.i);
        // long默认0L
        System.out.println(demo.l);
        // float默认0.0f
        System.out.println(demo.f);
        // double默认0.0d
        System.out.println(demo.d);
        // 对象默认null
        System.out.println(demo.str);
    }

    // 局部变量必须在赋值之后才能调用,没有初始化默认值
    public void myPrint() {
        int i = 0;
        String s = null;
        System.out.println(i);
        System.out.println(s);
    }

}
