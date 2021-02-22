package io.github.olgazskiba.Java_blog.arrays;

public class Palindrome {
    boolean isPalindrome(String text){
        boolean notPalindrome = false;
        String string = "Doc, note, I dissent. A fast never prevents a fatness. I diet on cod";

        string = string.replaceAll("[^a-zA-Z]+","").toLowerCase();

        char[] array = string.toCharArray();
        for(int i=0, j=array.length-1; i<j; i++, j--) {
            if(array[i] != array[j]) {
                notPalindrome = true;
                break;
            }
        }
        return notPalindrome;
    }
    }

