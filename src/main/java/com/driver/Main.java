package com.driver;

import java.sql.SQLOutput;
import java.util.spi.AbstractResourceBundleProvider;

public class Main
{
  public static class A{
       public A(){}

       public String meth()
       {
           return "Invoking method from class A";
       }
   }

   public static  class B extends A
   {

       public String meth()
       {

           return "Method is overridden in Extendend class B";
       }
   }

   public static void main(String[]args)
   {
       B obj=new B();
       obj.meth();

       B obj1=new B();
       obj1.meth();

   }
}