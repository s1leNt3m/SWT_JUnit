package StringFunction;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isPalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    public void isPalindrome(String candidate) {
        assertTrue(isPalindrome.isPalindrome(candidate));
    }
}