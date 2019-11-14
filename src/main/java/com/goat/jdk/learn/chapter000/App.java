package com.goat.jdk.learn.chapter000;


import org.junit.Test;

public class App {


  @Test
  public void test1() {
//    String str = "2019年10月31日日日日日日日日日日日日日日日";
//    String str = "2019年10月31日日日";
    String str = "2019年10月31日日日日";
//    String str = "2019年10月31日日日日1111";
//    String str = "2019年10月31日日";
    String s = dateTool(str);
    System.out.println(s+ "----");
  }


  public static String dateTool(String param) {
    String in = param.substring(param.length()-1);
    param = param.substring(0,param.lastIndexOf(in));
    System.out.println(param);
    if(param.contains(in)) {
      return dateTool(param);
    }else {
      param = param + in;
    }
    return param;
  }


//  public static String dateTool(String param) {
//    String in = param.substring(param.length()-1);
//    param = param.substring(0,param.lastIndexOf(in));
//    if(param.contains(in)) {
//      return dateTool(param);
//    }else {
//      return param + in;
//    }
//  }

}
