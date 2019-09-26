package project;

public class Ex2_6 {
	public static void main(String[] args) {
	System.out.println("최은서 - 20190926 - EX2_6");
	
	 System.out.println("논리연산자 결과 인쇄");
     
     System.out.println("(2>2)&&(4>3)결과="+((2>2)&&(4>3)));
     System.out.println("(2<2)&&(4<3)결과="+((2<2)&&(4<3)));
     System.out.println("(2>2)||(4>3)결과="+((2>2)||(4>3)));
     System.out.println("(2<2)||(4<3)결과="+((2<2)||(4<3)));
     System.out.println("!(2==3)결과="+!(2==3));
     System.out.println("!(2!=3)결과="+!(2!=3));
     
     boolean flag;
     flag = (3>2)&&(2==3);
     System.out.println(flag);
	}

}
