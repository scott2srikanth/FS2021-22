package com.app.test;

public class Exception1 {
    int area(int l,int b) throws Exception{
        if(l<0){
            throw new Exception("message");
        }
        int a = l*b;
        return a;
    }
    void method1(){
        try{
            int a = area(-13,4);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Exception1 r =new Exception1();
        r.method1();
    }
}
