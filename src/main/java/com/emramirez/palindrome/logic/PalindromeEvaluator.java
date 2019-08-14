package com.emramirez.palindrome.logic;

public class PalindromeEvaluator {

    public boolean evaluate(String input) {
        StringBuilder sb = new StringBuilder(input).reverse();

        return sb.toString().equals(input);
    }
}
