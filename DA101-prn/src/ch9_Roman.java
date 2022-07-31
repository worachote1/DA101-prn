import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ch9_Roman {

	public static String intToRoman(int num) {
		//System.out.println("Integer: " + num);
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}
		//System.out.println("Corresponding Roman Numerals is: " + roman.toString());
		return  roman.toString();
	}

    public static int convertRomanToInt(String s)  
    {  
        Map<Character, Integer> map=new HashMap<Character, Integer>();  
        //adding elements to the Map   
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);    
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC");  
        int number = 0;  
    //loop iterates over the roman numeral   
        for (int i = 0; i < s.length(); i++)  
        {  
    //getting each character of roman numeral and adding it to the variable number  
            number = number + (map.get(s.charAt(i)));  
        }  
        //prints the corresponding integer value  
        //System.out.println("The corresponding Integer value is: "+number);  
        
        return number;
    }  
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		sc.nextLine();
		
		String ss[] = new String[n];
		for(int i=0;i<ss.length;i++) {
			ss[i]=sc.nextLine();
		}
		
		//display roman to int
//		for(int i=0;i<ss.length;i++) {
//			System.out.println(convertRomanToInt(ss[i]));
//		}
		
		int num[] = new int [n];
		for(int i=0;i<num.length;i++) {
			num[i] = convertRomanToInt(ss[i]);
		}
		
		Arrays.sort(num);
		
		//display result : int to roman
		for(int i=0;i<num.length;i++) {
			System.out.println(intToRoman(num[i]));
		}
	}

}
