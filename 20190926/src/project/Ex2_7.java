package project;

public class Ex2_7 {

	public static void main(String[] args) {
		System.out.println("������ - 20190926 - EX2_7");
		
		System.out.println("��Ʈ�������� ��� �μ�");
		int a = 11, b = 13;
		String ba = Integer.toBinaryString(a);
		System.out.println("2���� : " + ba);
		String bb = Integer.toBinaryString(b);
		System.out.println("2���� : " + bb);
		
		String ab = Integer.toBinaryString(a & b);
		System.out.println("& ���� : " + ab);
		System.out.println("& ������ " + (a & b));
		
		ab = Integer.toBinaryString(a|b);
		System.out.println("|���� : " + ab);
		System.out.println("|������ " + (a|b));
		
		ab = Integer.toBinaryString(a^b);
		System.out.println("^���� : " + ab);
		System.out.println("^������ " + (a^b));
		
		
	}
}
