package com.likzn.design.pattern.structural.adapter;

/**
 * @auther: Li jx
 * @date: 2019/3/28 16:17
 * @description:
 */
public class Adapter implements DC5 {
    AC220 ac220 = new AC220();
    @Override
    public int outputDC5() {
        int input = ac220.inPutDC220();
        int output = input / 44;
        System.out.println("输出" + output + "V" );
        return output;
    }
}
