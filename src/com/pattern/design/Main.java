package com.pattern.design;

public class Main {
    public static void main(String[] args){
        String[] arr = new String[2];
        Object[] objarr = arr;
        arr[0] = "string";
        objarr[1] = Integer.valueOf(5);
        System.out.println(arr);
    }
}
