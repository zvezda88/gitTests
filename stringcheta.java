import java.util.Scanner;

public class stringcheta {
	public static void main(String[] args) {
		String s1 = new String("test;alabala;mest");
		String[] a = s1.split(";");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// System.out.println(metodche());
		//System.out.println(how("bozata e alkoholna", 'o'));
		//beforeAndAfterDot("hmm.bzz");
		//System.out.println(chasha("stringa", 2));
		//System.out.println(deleteRepeated("assd"));

	}

	public static String metodche() {
		Scanner s = new Scanner(System.in);
		StringBuilder strb = new StringBuilder(s.nextLine());
		for (int i = 0; i < strb.length(); i++) {
			if (strb.charAt(i) == '.') {
				strb.setCharAt(i, ',');
			}
		}
		return strb.toString();
	}

	// kolko puti se sreshta bukva v string
	public static int how(String str, char a) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				++counter;
			}
		}
		return counter;
	}

	public static void beforeAndAfterDot(String str) {
		int n = str.indexOf('.');
		System.out.println(str.substring(0, n));
		System.out.println(str.substring(n + 1, str.length()));
	}

	public static String chasha(String str, int a) {
		if (str.length() == a) {
			return str;
		}
		if (str.length() > a) {
			return str.substring(0, a);
		} else {
			StringBuffer k = new StringBuffer(str);
			for (int i = str.length() - 1; i < a; i++) {
				k.append('-');
			}
			return k.toString();
		}

	}

	public static String deleteRepeated(String str){
		StringBuilder k = new StringBuilder(str);
		for(int i = 0; i < str.length()-1; i++){{
			if(k.charAt(i) == k.charAt(i+1))
				k.setCharAt(i, ' ');
			}
		}
		return k.toString();
	}
	
	public static void willBeRemoved() {
		System.out.println("more");
	}
}
