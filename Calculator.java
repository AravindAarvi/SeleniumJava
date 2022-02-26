package week1day2;

public class Calculator {
	
	public int add() {
		int num1=1;
		int num2=2;
		int num3=3;
		System.out.println("6");
		return num1+num2+num3;
	}
		public float div() {
			float num1=0.12f;
			float num2=5.12f;
			System.out.println("0.0234375f");
			return num1/num2;
		}
		public double mult() {
			double num1=345.545d;
			double num2=125.789d;
			System.out.println("43465.76d");
			return num1*num2;
		}
		public int sub() {
			int num1=1;
			int num2=4;
			System.out.println("-3");
			return num1-num2;
		}
		
		public static void main(String[] args) {
			Calculator object=new Calculator();
			object.add();
			object.sub();
			object.mult();
			object.div();
			System.out.println("Finally");
		}
		
		
		
	}
