/*
1.Implement a java program to demonstrate the concept of mutability and immutability.
*/

//String objects are immutable meaning unchangable.
//StringBuffer objects are mutable meaning changable.

public class task3_1 {
	public static void main(String[] args) {
		String s1 = new String("hi");
		String s2 = new String("hello");
		// String s2 = s1.concat("hello");
		// String s3 = new String(s1.concat("hello"));
		// System.out.println(s3);
		s1.concat(s2);
		System.out.println("Immutability : " + s1);

		StringBuffer sb1 = new StringBuffer("Graphic");
		StringBuffer sb2 = new StringBuffer(" era");
		sb1.append(sb2);
		System.out.println("Mutability : " + sb1);
	}
}