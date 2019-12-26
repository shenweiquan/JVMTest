package com.swq;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Child1.str);
    }


}
class Parent1{

    public   static String  str = "Hello World for Parent";

    static{

        System.out.println("parent static block");

    }

}
class Child1 extends  Parent1
{
    public   static String  str = "Hello World for Child";

    static{

        System.out.println("child static block");

    }
}
