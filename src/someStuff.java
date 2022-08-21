import java.util.ArrayList;
import java.util.Arrays;

public class someStuff {

	public static void main(String[] args) {
		/*String file = "its'";
		System.out.println(file);
		if (file.contains("'")) {
			for(int i = 0;i<file.length();i++) {
				if(file.charAt(i)=='\'') {
					file = file.substring(0, i)+file.substring(i+1);
				}
			}
		}
		System.out.println(file);*/
		String str = "78s457637ometh9ing1";
		String [] arr = str.split("");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))==true) {
				str = str.substring(0, i)+str.substring(i+1);
			}
		}
		//System.out.println(str);
		String correct = "";
		if(!(arr[0].equals("?")||arr[0].equals(".")||arr[0].equals(",")||arr[0].equals(";")||arr[0].equals("!")||arr[0].equals(":")||Character.isDigit(arr[0].charAt(0))==true)) {
			correct += arr[0];
		}
		for(int i = 1;i<arr.length;i++){
			if(!(arr[i].equals("=")||arr[i].equals("'")||Character.isDigit(arr[i].charAt(0))==true)) {
				correct += arr[i];
			}
		}
		System.out.println(str);
		System.out.println(correct);
		System.out.println(Character.isDigit(arr[2].charAt(0)));
		String[] arr2 = {"sally","sabby","happy","habbp","killian"};
		for(int i = 0; i<arr2.length; i++)   //Holds each element
        {  
            for (int j = i+1; j<arr2.length; j++)  //Check for remaining elements 
            {  
               //compares each elements of the array to all the remaining elements  
               if(arr2[i].compareTo(arr2[j])>0)   
               {  
                   //swapping array elements  
                   String temp = arr2[i];  
                   arr2[i] = arr2[j];  
                   arr2[j] = temp;  
                }  
             }  
          }
		for(String st: arr2) {
			System.out.println(st);
		}
		String[] arr3 = {"a","a","b","c","h","o","q","t","v","v","v","x","y","z","z"};
		System.out.println("-----"+arr3[0]+"-----");
		String prev = arr3[0];
		for(String st: arr3) {
			if(!(prev.equals(st))) {
				System.out.println("-----"+st+"-----");
			}
			System.out.println(st);
			prev = st;
		}
		//System.out.println(Integer.valueOf(str));
	}

}
