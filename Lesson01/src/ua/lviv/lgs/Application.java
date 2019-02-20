package ua.lviv.lgs;

public class Application {
	public static void main(String [] args) {
		/*
		int a = 2;
		long b = 3;
		
		
		System.out.println(a);
		System.out.println(b);
*/
		
		// Exercise1
		/*
		int d = 1 ;
		int e = 2;
		int res1 = d + e;
		int res2 = d - e;
		int res3 = d*e;
		int res4 = d/e;
		
		System.out.println("res1 = "+res1);
		System.out.println("res2 = "+res2);
		System.out.println("res3 = "+res3);
		System.out.println("res4 = "+res4);
		
		*/
		
		//Exercise2 Який буде результат виведення на екран?
		/*
		int a = 0;
		int b = a++;
		int c = a++;
		
		System.out.println("Приклад 2 = " +a+" "+b+" "+c+ " ");
		
		*/
		
		//Exercise3
		/*
		int f = 1;
		int g = 2;
		int h = 3;
		
		f+=5;
		g*=4;
		h+=f*g;
		h%=6;
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		*/
		
		//Exercise4 Тернарний оператор
		/*
		int a = 2;
		int r = a > 0? -3 : 2;
		System.out.println("r = "+r);
		*/
		//Exercise5
		/*
		
		boolean j = true;
		boolean k = false;
		boolean l = j|k;
		boolean m = j & k;
		boolean n = (!j & k) | (j & !k);
		boolean o = !j;
		
		System.out.println("j = " +j);
		System.out.println("k = " +k);
		System.out.println("l = " +l);
		System.out.println("m = " +m);
		System.out.println("n = " +n);
		System.out.println("o = " +o);
		*/
		
		//Exercise6
		/*
		int t = 5;
		int u = 5;
		String result = (t>u)? "Yes": "No";
		String result2 = (t==u)? "Yes": "No";
		String result3 = (t>=u)? "Yes": "No";
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		*/
		
		//Exercise7
		/*
		int a1 = 2;
		int b1 = 3;
		if(a1>b1) {
			System.out.println("a1 > b1");
		}else {
			System.out.println("a1 < b1");
			
		}
		*/
		//Exercise8
		/*
		int a1 = 12;
		int b1 = 3;
		if(a1*a1 == b1) {
			System.out.println("1");
		}else if (a1*a1 < b1) {
			System.out.println("2");
		}else {
			System.out.println("3");
		}
		*/
		
		//Exercise9
		/*
		int k1 = 2;
		
		switch(k1) {
		case 1: case 3: case 4:{
			System.out.println("1, 3, 4");
		}
		case 2: System.out.println("2");
		default: System.out.println("default");
		}
		*/
			
		//Exercise10:
		/*
		for(int i = 0; i<10; i++) {
			System.out.println("i = " +i);
		
		}
		*/
		
		//Exercise11:
		/*
		int i = 0;
		
		while(i < 10){
			System.out.println("i = " + i);
			i++;
		}
		*/
		
		//Exercise12:
		/*int i = 10;
	
		do {
			System.out.println("do i = " + i);
			i++;
		}while(i < 10);
		*/
		//Exercise13:
		/*
		int[] array1 = new int [10];
		double[] array2 = new double [10];
		double[] array3 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
			array2[i] = i*i;
		}
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
			System.out.println(array2[i]);
			System.out.println(array3[i]);
		}
			*/
		
		//Exercise14:
		/*
		Byte a1 = 2;
		Short a2 = 2;
		Integer a = 2;
		Long a4 = 2l;
		
		int a5 = a1;
	
		
		
		Double b = 2.2;
		Float b1 = 3.3f;
		*/
		
		System.out.println("Byte = " + Byte.MAX_VALUE);
		
		
		
}
}