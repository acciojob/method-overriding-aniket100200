package com.driver;

import java.sql.SQLOutput;
import java.util.spi.AbstractResourceBundleProvider;

public class Main
{
   static class A{
       public A(){}

       public String meth()
       {
           return "Invoking method from class A";
       }
   }

   static  class B extends A{
       @Override
       public String meth()
       {
           super.meth();
           return "Method is overridden in Extendend class B";
       }
   }

   public static void main(String[]args)
   {
       B obj=new B();
       obj.meth();

   }
}