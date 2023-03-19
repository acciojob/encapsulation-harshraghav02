package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        // rwOnly.name = "harsh";
        // System.out.println(rwOnly.name);
        // 'name' has private access in 'com.driver.RWOnly'

        rwOnly.setName("harsh");
        String name = rwOnly.getName();
        System.out.println(name);
    }
}