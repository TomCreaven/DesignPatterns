package com.pluralsight.builder;

public class LunchOrderBeanDemo {

//This is an example of the bean antipattern, in which all the getters and setters are exposed.
// This isn't immutable, there is no contract as to what is a "valid order", and there's no real idea of that our oder should be.
    public static void main(String[] args) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();


        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
