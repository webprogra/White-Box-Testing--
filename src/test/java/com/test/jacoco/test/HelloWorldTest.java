package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);//1,ttt
    	int b = hw.Method3(6, -1, -1);//1,ttf
    	int c = hw.Method3(4, -1, 1);//1,ftt
    	int d = hw.Method3(4, 1, 1);//1,tft
    	int e = hw.Method3(4, -1, -3);//2,tt
    	int f = hw.Method3(4, 1, -1);//3,tf
    	int g = hw.Method3(6, 1, -3);//3,ft
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    
    @Test
    public void testMethod4() {
    	HelloWorld hw = new HelloWorld();
    	try {
    		int a = hw.Method4(0, 1, 2, 3, 4);//1
	    	
    	}
    	catch(Exception err) {
    		
    	}
    	try {
    		int b = hw.Method4(1, 1, 2, 3, 4);//2,TFF
	    	
    	}
    	catch(Exception err) {
    		
    	}
    	try {
	    	int c = hw.Method4(1, 2, 2, 2, 4);//3,ftF
	    	
    	}
    	catch(Exception err) {
    		
    	}
    	try {
    		int d = hw.Method4(5, 4, 2, 3, 4);//3,fft
    	}
    	catch(Exception err) {
    		
    	}
    	try {
    		int e = hw.Method4(1, 1, 1, 1, 4);//2,ttf
	    	
    	}
    	catch(Exception err) {
    		
    	}
    	try {
    		int f = hw.Method4(5, 1, 2, 2, 4);//2,ftt
	    	
    	}
    	catch(Exception err) {
    		
    	}
    	try {
	    	int g = hw.Method4(1, 2, 3, 4, 4);//3,fff
    	}
    	catch(Exception err) {
    		
    	}
    	try {
	    	int h = hw.Method4(5, 5, 2, 3, 4);//3,tft
    	}
    	catch(Exception err) {
    		
    	}
    	try {
    		int i = hw.Method4(5, 5, 2, 2, 4);//2,ttt 
	    	
    	}
    	catch(Exception err) {
    		
    	}
    }
    @Test
    public void testIsTriangle() {
    	HelloWorld hw = new HelloWorld();
    	boolean e = hw.isTriangle(1, 1, 2);
    	boolean f = hw.isTriangle(1, 2, 1);
    	boolean g = hw.isTriangle(2, 1, 1);
    	boolean j = hw.isTriangle(1, 1, 1);
    	boolean h = hw.isTriangle(-1, -1, -1);
    	boolean i = hw.isTriangle(-1, 1, 1);
    	boolean a = hw.isTriangle(1, -1, 1);
    	boolean b = hw.isTriangle(1, 1, -1);
    }
    @Test
    public void testIsBirthday() {
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.isBirthday(1900, -1, -1);//t
    	boolean b = hw.isBirthday(2020, 13, 32);//ft
    	boolean c = hw.isBirthday(2018, -1, 21);//fft
    	boolean d = hw.isBirthday(2018, 13, 21);//ffft
    	boolean e = hw.isBirthday(2018, 12, 0);//fffft
    	boolean f = hw.isBirthday(2018, 12, 32);//fffft
    	boolean g = hw.isBirthday(2018, 2, 29);//fffff
    	boolean i = hw.isBirthday(2018, 2, 2);//fffff
    	boolean j = hw.isBirthday(2018, 4, 31);//fffff
    	boolean h = hw.isBirthday(2019, 10, 2);//fffff
    	boolean k = hw.isBirthday(2019, 11, 29);//fffff
    	boolean l = hw.isBirthday(2018, 10, 1);//fffff
    	boolean m = hw.isBirthday(2016, 2, 29);//fffff
    	boolean n = hw.isBirthday(2016, 2, 30);//fffff
    	boolean o = hw.isBirthday(2019, 2, 3);//fffff
    	boolean p = hw.isBirthday(2019, 10, 1);//fffff
    }
    @Test
    public void testMiniCalculator() {
    	HelloWorld hw = new HelloWorld();
    	double a = hw.miniCalculator(1.0, 1.0, '^');
    	double b = hw.miniCalculator(1.0, 1.0, '+');
    	double c = hw.miniCalculator(1.0, 1.0, '-');
    	double e = hw.miniCalculator(1.0, 1.0, '*');
    	double f = hw.miniCalculator(1.0, 1.0, '/');
    	double g = hw.miniCalculator(1.0, 0.0, '/');
    }
}
