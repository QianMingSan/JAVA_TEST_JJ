package com.itheima01_复习;

/*
类的定义
    定义格式
        修饰符 public  class 类名{
            //类中的五大成分。
            1.成员变量（属性）
            2.构造器 （初始化类的对象数据的）
            3.成员方法 (行为)
            4.内部类
            5.代码块
        }

类的使用
    1.创建对象
        类名 对象名 = new 类名(形参);
    2.使用对象
        对象名.成员变量名;//成员变量非私有，私有成员变量需要通过对应的get/set方法操作成员变量。
        对象名.成员方法名

封装的原则
    1.封装: 被认为是一个保护屏障，对外隐藏具体的实现细节，防止该类的代码和数据被其他类随意访问。
    2.封装的原则
    	使用 private 关键字来修饰成员变量。
    	使用public修饰getter和setter方法。
    	属性的封装只是封装的一种表现形式，方法、类等都时封装的表现形式。

构造方法
    1.作用:
        创建对象
        对象初始化
    2.定义格式
    	修饰符 类名(形参列表) {
    		// 构造体代码，执行代码
    	}
    3.分类:无参构造、有参构造、满参构造

this的使用
    1.作用:this代表所在类的当前对象的引用（地址值）;
    2.应用
        区分成员变量与局部变量。

示例:按照如下学生类，演示以上内容。
    学生类
        属性：姓名，年龄
        行为：吃饭，睡觉


快捷键:
    Shift+F6 重命名，把所有关联的地方全部修改。
*/
public class Test {
    public static void main(String[] args) {
        //无参构造创建对象并使用
        //Ctrl+alt+V 快速生产等于号前面的内容
        Student s = new Student();
        //私有的内容，不能直接使用
        //System.out.println(s.name+","+s.age);//null,0
        //s.name="张三";
        //s.age=18;
        //System.out.println(s.name+","+s.age);//张三,18
        System.out.println(s.getName()+","+s.getAge());//null,0
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getName()+","+s.getAge());//null,0
        s.study();
        System.out.println("--------");
        //满参构造创建对象并使用
        //用于在创建一个对象的时候，就给这个对象赋值。
        Student s2 = new Student("李四", 20);
        System.out.println(s2.getName()+","+s2.getAge());//null,0
    }
}
