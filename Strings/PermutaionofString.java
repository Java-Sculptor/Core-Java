package Strings;

import java.util.Scanner;
import java.util.*;

public class PermutaionofString {
public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        List<String> permutations = generatePermutations(str);
	        System.out.println("Permutations of the string \"" + str + "\":");
	        for (String perm : permutations) {
	            System.out.println(perm);
	        }
	        sc.close();
	    }
	    
	    public static List<String> generatePermutations(String str) {
	        List<String> permutations = new ArrayList<>();
	        generatePermutationsHelper(str.toCharArray(), 0, permutations);
	        return permutations;
	    }
	    
	    private static void generatePermutationsHelper(char[] chars, int index, List<String> permutations) {
	        if (index == chars.length - 1) {
	            permutations.add(String.valueOf(chars));
	            return;
	        }
	        for (int i = index; i < chars.length; i++) {
	            swap(chars, index, i);
	            generatePermutationsHelper(chars, index + 1, permutations);
	            swap(chars, index, i);
	        }
	    }
	    
	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	}


    

