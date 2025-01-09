package com.test;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    
    	Arithmetic ar=new Arithmetic();
    	int res=ar.sum(15,15);
    	
        System.out.println(res);
    }
}
