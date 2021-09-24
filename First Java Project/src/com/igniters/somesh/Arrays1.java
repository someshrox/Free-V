package com.igniters.somesh;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Arrays1 {
   public static void main(String args[]) {
//int i = 20;
//System.out.println("20/3 = "+(double)i/3);
//	   BigDecimal dec1 = BigDecimal.valueOf(20).setScale(2);
//	   BigDecimal devfac = BigDecimal.valueOf(3);
//	   BigDecimal app = dec1.divide(devfac, RoundingMode.HALF_UP);
//	   System.out.println(app);
	   byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b + b;
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c;

		long longExpressionType = i + l;

		float floatExpressionType = l + f;

		double doubleExpressionType = f + d;

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		System.out.println("Hello " + 1); // Hello 1
		System.out.println("Hello " + null); // Hello null
   }
   

}
