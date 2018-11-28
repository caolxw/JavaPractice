# 目录
## 1，AbstractDemo
抽象类的相关知识以及两道面试题。  
## 2，ArrayTool 
由*取最大值*，*打印数组*，*倒置数组*三个静态方法构成。类的构造方法被私有，只能通过类名调用类中的方法。  
*java说明书的制作*
```
javacdoc -d +路径 -version -author
```
## 3，ArraysDemo 
*Arrays相关方法*  

+ toString(array)    数组转字符串
+ sort(array)        排序
+ binarySearch(array,index) 查找（要求数组已排序）

int -> String 和 String -> int 的方法
## 4，Demo1
*静态代码块* 相关知识  
注意运行顺序，运行结果如下：
```
我是主方法中的静态代码块！
Student中的静态代码块！
学生在学习...
null 0
学生在学习...
有参构造：张三 20
张三 20

```
## 5，Demo2
*继承*关系介绍，重写和重载的区别。  
成员方法，成员变量，静态方法的编译和运行  

+ 成员变量：编译看左边，运行看左边
+ 成员方法：编译看左边，运行看右边
+ 静态方法：编译看左边，运行看左边

## 6，FinalDemo 
*final*修饰相关知识。
## 7，GuessNum 
猜数游戏的练习
## 8，InnerDemo 
*内部类*相关知识以及*匿名内部类*相关知识。  
内部类对象的创建方法：
```
//外部类名.内部类名 对象名 = 外部类名.内部类对象
Outer.Inner1 inner1 = new Outer().Inner1();
```
## 9，InterfaceDemo 
*接口*相关知识。  

+ 成员变量：    只能是常量	并且是静态公共的（public static final)
+ 构造方法：    接口没有构造方法
+ 成员方法：    只能是抽象方法	(public abstract)

接口和接口之间的继承关系，接口与类之间的实现关系。
## 10，ScannerDemo 
*Scanner*的基本用法。注意 nextInt() 和 nextLine() 连续输入的问题。
## 11，SortDemo 
*排序*算法的介绍：

+ 冒泡排序
+ 选择排序
+ 二分查找

## 12，StaticDemo 
*static*修饰相关知识。
## 13，StringBufferDemo 
*StringBuffer*相关使用，StringBuffer和StringBuilder区别，String和StringBuffer区别。  

+ *String -> StringBuffer* ：构造函数和append()  
+ *StringBuffer -> String* ：构造函数，toString()和subString()  

## 14，StringDemo 
*String* 相关知识：

+ 构造函数的使用和其截取功能
+ == 和 equals 方法
+ 判断功能
+ 获取功能
+ 转换功能
+ 替换功能，比较功能（忽略大小写），去除字符串首的空格


## 15，ToStringDemo 
equals() 和 toString() 方法的重写。