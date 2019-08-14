package com.emramirez.palindrome.logic;

/**
 * Challenge
 * Have the function Palindrome(str) take the str parameter being passed and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string false. For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string.
 * Sample Test Cases
 * Input:"never odd or even"
 *
 * Output:true
 *
 *
 * Input:"eye"
 *
 * Output:true
 */
public class PalindromeEvaluator {

    public String evaluate(String input) {
        input = input.replaceAll("[0-9]", "").replaceAll("\\s+", "").replaceAll("\\p{Punct}", "");

        String reverseStr = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reverseStr);

        return isPalindrome ? "true" : "false";
    }
}
