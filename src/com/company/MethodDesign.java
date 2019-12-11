package com.company;

import java.util.Arrays;

public class MethodDesign {


//    public void jump(){}
//
//   // void public jump2(){} // compile error
//
//    void jump3(){} //default access modifier
//
//    public final void jump4(){}
//
//    public static final void jump5(){}
//
//    public final static void jump6(){}
//
//    //public modifier void jump7(){} // compile error
//
////    public String void jump(){} // compile error 2 return types
//
////    public String int float double jump89(){}// too many return types compile error
//
//   //public void final jump9(){} // can't add modifier after return type
//
//    final static public void jump10(){}
//
//    //String int public void jump11(){}//compile error

//    public void jump(){}
//    public void jump2(){ // return type void
//        return;
//    }
//
//    public String jump3(){//return empty string
//        return "";
//    }

   // public String jump4(){} //compile error no return statement

    //public jump5(){} // no return compile error

//    String jump6(int a){// if statement could be false, then will not reach the return
//        if(a==5){
//            return "";
//        }
//   }

//
//    int getInt(){
//        return 9;
//    }
//
//    int getLong(){ // return type is long compile error if no cast to int
//        return (int)9L;
//    }
//
//    int expanded(){
//        int temp = 10;
//        return 10;
//    }
//
//    boolean inTrue(){ // can return boolean expression
//    //    return 5 < 10;
//        return 5 == 5;
//    }
//
//    public void test(){}
//    //public void 2test(){} // method can't start with digit
//    public void $test(){} //valid identifier
//    public void _test(){}// valid too
//
//  int getZero(){ // nidadic is what a method is called with no arugments
//        return 0;
//  }
//
//  int increment(int number){ // method with one argument is called monadic
//        return number++;
//  }
//
//  int sum(int a, int b){//2 argument methods are called dyadic
//        return a + b;
//  }
//
//  int plusMinus(int a , int b, int c){// 3 arguments are called (triadic)
//        return a + b - c;
//  }
//
//  double average(double a, double b, double c, double d){// 4 argument method is called (polyadic)
//        return (a + b + c + d) / 4.0;
//  }

  //void test{}//compile error no brackets for arguments

    //void test(int a; int b)(){} //won't compile
//
//    void test(int a, int b){}
//    //void test2(int a);// missing method body will not compile
//
//
//    public void jump1(int... numbers){}
//
//    public void jump2(int start, int... numbers){}

    //public void jump3(int... numbers, int start){} // var args must be last arg compile error

    //public void  jump4(int... start, int... numbers){} // compile error, only one var arg allowed

//    public void jump5(int[] start, int[] numbers){}
//
//    public static void jump(int start, int... numbers){
//        System.out.println("start = "+ start + " numbers.length = " + numbers.length);
//    }
//
//    public static void main(String[] args) {
//        jump(1);
//        jump(2,3);
//        jump(4, 5,6,7);
//        jump(1, new int[]{4,5,6});// redundant array creation
//        //jump(1, null);
//
//        run();
//        run(11,22,33,44,55,66,77,88,99);
//    }
//
//    public static void run(int... numbers){
//        for (int number : numbers
//             ) {
//            System.out.println("number= "+ number);
//        }
//
//        System.out.println(Arrays.toString(numbers));
//    }





}
