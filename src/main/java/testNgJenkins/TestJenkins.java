package testNgJenkins;

import org.testng.annotations.*;

public class TestJenkins {
	int number = 5401;
	int reversedNumber;

	@Test
	public void executeFib(){
		fib();
	}
	
	@Test
	public void executeReverse(){
		reverseNumber();
	}
	
	
	public void fib(){
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<9;i++){
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	
	public int reverseNumber(){
		int a = number%10;
		int b = number/10;
		reversedNumber = a*10+b;
		return reversedNumber;
	}
}
