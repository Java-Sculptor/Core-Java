package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    
    public static void main(String[] args) {
        
                String str = "hello world";
                String result = removeDuplicates(str);
                
                System.out.println("Original String: " + str);
                System.out.println("String after removing duplicates: " + result);
            }
            
            public static String removeDuplicates(String str) {
                // Using LinkedHashSet to preserve the order of characters
                LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
                
                // Add characters to the set
                for (char c : str.toCharArray()) {
                    uniqueChars.add(c);
                }
                
                // Construct the string from the set
                StringBuilder builder = new StringBuilder();
                for (char c : uniqueChars) {
                    builder.append(c);
                }
                
                return builder.toString();
            }
        }
    
    
    
       

