
public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s = "TeeNAPreeTHi";
		
			StringBuffer b1 = new StringBuffer(s);
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (Character.isLowerCase(ch)) {
					b1.setCharAt(i, Character.toUpperCase(ch));
				} else {
					b1.setCharAt(i, Character.toLowerCase(ch));
				}
			}
			System.out.println(b1);
		}
			

	}


