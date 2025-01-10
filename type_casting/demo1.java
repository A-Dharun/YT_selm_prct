package type_casting;

public class demo1 {
	public static void main(String[] args) {
//		Type casting
		System.out.println("--Type casting--");
		int a=100;
		System.out.println("a="+a);
		double b=100.1;
		System.out.println("b="+b);
//		Implicity Widening
		System.out.println("--Implicity Widening--");
		double c=100;
		System.out.println("c="+c);
		float d='f';
		System.out.println("d="+d);
//		explicity widening
		System.out.println("--explicity widening--");
		double e=(double)'b';
		System.out.println("e="+e);
		float f=(float)'d';
		System.out.println("f="+f);
//		explicity narrowing
		System.out.println("--explicity narrowing--");
		int g=(int)420.420000;
		System.out.println("g="+g);
		char h=(char)98.99;
		System.out.println("h="+h);
		
	}
}
