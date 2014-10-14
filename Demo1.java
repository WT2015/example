package pro1009;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		String a = "abcd";
		String b = new String("abcd");
		String c = "Abcd";
		String d = "Abcdeg";
		
		System.out.println(a.charAt(0)==b.charAt(0));
		
	/*	System.out.println(a.charAt(3));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equals(c));
		System.out.println(a.replace('a', 'b'));
		System.out.println(a.replace("ab", "ba"));
		System.out.println(a.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(d.length());
		*/
		/*String m = "Welcome to China!";
		String mm = " Welcome to China ! ";
		System.out.println(m);*/
		/*String m1 = m.toLowerCase();
		System.out.println(m.replace('c', '*'));
		System.out.println(m1.replace('c', '*'));
		m = m1.replace('c', '*');
		System.out.println(m);*/
		/*System.out.println(m.indexOf('t'));
		System.out.println(m.lastIndexOf("o"));
		System.out.println(m.startsWith("we"));
		System.out.println(m.startsWith("We"));
		System.out.println(m.endsWith("a!"));
		System.out.println(m.substring(4));
		System.out.println(m.substring(3, 10));
		System.out.println(m.charAt(3));
		System.out.println(m.codePointAt(3));
		System.out.println(m.codePointBefore(3));
		System.out.println(m.codePointCount(3, 6));
		System.out.println(m.hashCode());
		//System.out.println(m.notify());
		System.out.println(mm.trim());*/
		/*Scanner in = new Scanner(System.in);
		System.out.print("Please enter :");
		String m = in.next();
		int d = 0;
		int x = 0;
		int f = 0;
		for (int i = 0; i < m.length(); i++) {
			char c = m.charAt(i);
			if(c > 'A' && c < 'Z'){
				d++;
			}else if(c > 'a' && c < 'z'){
				x++;
			}else{
				f++;
			}
		}
		System.out.println("大写："+d+"，小写："+x+"，其他："+f);*/
	}
}
