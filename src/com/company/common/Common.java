package com.company.common;

public class Common {

    public int publicNUmber =  10;
    protected int protectedNumber = 20;
    int defaultNumber = 30;
    private int privateNumber = 40;

    public void publicPrint(){
        System.out.println("public");
    }

    protected  void protectedPrint(){
        System.out.println("protected");
    }

    void defaultPrint(){
        System.out.println("default");
    }

    private void privatePrint(){
        System.out.println("private");
    }

    public static void main(String[] args) {

        Common common = new Common();
        common.defaultPrint();
        common.publicPrint();
        common.protectedPrint();
        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNUmber);
        System.out.println("protectedNumber= " + common.protectedNumber);
        System.out.println("defaultNumber= " + common.defaultNumber);
        System.out.println("privateNumber= " + common.privateNumber);

    }
}
