package week1day2;

public class MyMobile {
	static int num=1234;
	static short num1=12;
	static long mobile=8610976348l;
	static float decimal=0.66f;
	static double threedecimal=111.345698745d;
	static char initial='m';
	static boolean benice=false;
	static String name="aarvi";
public void makeCall() {
	
	System.out.println("makecall");
}
public void sendMsg() {
	System.out.println("sendMsg");
}
private void payBills() {
	
	System.out.println("payBills");
}
public static void main(String[] args) {
	System.out.println("num");
	System.out.println("num1");
	System.out.println("mobile");
	System.out.println("decimal");
	System.out.println("threedecimal");
	System.out.println("initial");
	System.out.println("benice");
	System.out.println("name");
	MyMobile obj= new MyMobile();
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
	System.out.println("aashique2");
}

}
