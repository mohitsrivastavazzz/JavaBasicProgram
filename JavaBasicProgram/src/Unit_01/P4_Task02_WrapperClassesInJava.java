package Unit_01;

public class P4_Task02_WrapperClassesInJava {
	
	public static void main(String[] args) {
		// Converting int, into Integer
		int a = 20;
		String s = "" + a + "";
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println(a +" "+ i+" "+ j);
		System. out.println(i.toString());

		byte b=10;
		Byte byteobj=2;
		System.out.println(byteobj);
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
		
	}
}