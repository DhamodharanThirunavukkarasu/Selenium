
public class StringImportance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="This is my own world";
	String s2="I can rule it";
	// compare two string
	System.out.println("Comparing string s1 is equal to s2? = "+s1.equals(s2));
	// concatination two string
	System.out.println("concat two string= "+s1.concat(s2));
	//Retrive index of value
	System.out.println("Retrive the value in the index of 5= "+s1.charAt(5));
	//lenth of string
	System.out.println("Lenght of the s1 string= "+s1.length());
	//converting to uppercase
	System.out.println("converting to upper case= "+s1.toUpperCase());
	//convertingto lower case
	System.out.println("lower case= "+s1.toLowerCase());
	//indexOf
	System.out.println("index of first i ="+s1.indexOf("i"));
	//Retrieve the Index of word 'Very' from string.
	  System.out.println("Index of word own Is -> "+s1.indexOf("own"));
	  //converting string to integer
	  int j=10;
	  String svalue=String.valueOf(j);
	  System.out.println("converted integer to string= "+svalue);
	  //string to integer
	  String s3="100";
	  int n=Integer.parseInt(s3);
	  System.out.println("Converted string to integer= "+n);
	//Split string. 
	  String splt[] = s1.split("own");
	  System.out.println("String Part 1 Is -> "+splt[0]);
	  System.out.println("String Part 2 Is -> "+splt[1]); 
	  
	  //reverse
	  StringBuffer sb=new StringBuffer(s1);
	  System.out.println(sb.reverse());
	  //System.out.println("reverse string = "+s1.r);

	}

}
