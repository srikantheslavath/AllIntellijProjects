package com.Strings;

public class Arraymin {
    public static void main(String[] args) {
        int[] a = {100,40,32,64};
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];

            }
            System.out.println(min);
        }
    }
}
