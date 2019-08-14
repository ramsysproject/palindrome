package com.emramirez.palindrome.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeEvaluatorTest {

    private PalindromeEvaluator palindromeEvaluator = new PalindromeEvaluator();

    @Test
    public void evaluate_notPalindromeWordGiven_falseResultExpected() {
        // arrange
        String notPalindrome = "house";

        // act
        boolean result = palindromeEvaluator.evaluate(notPalindrome);

        // assert
        assertThat("Expected false, but found otherwise", result, equalTo(false));
    }

    @Test
    public void evaluate_palindromeWordGiven_trueResultExpected() {
        // arrange
        String palindrome = "madam";

        // act
        boolean result = palindromeEvaluator.evaluate(palindrome);

        // assert
        assertThat("Expected true, but found otherwise", result, equalTo(true));
    }
}
