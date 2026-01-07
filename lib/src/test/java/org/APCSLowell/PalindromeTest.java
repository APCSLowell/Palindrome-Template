package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

// test
// rotator
// rewriter
// nurses run
// Madam, I'm Adam!
// A Man! A Plan! A Canal! Panama!

public class PalindromeTest {
    @Test
    public void wordTest() {
        Palindrome p = new Palindrome();
        assert(!p.palindrome("test"));
        assert(p.palindrome("rotator"));
        assert(!p.palindrome("rewriter"));
        assert(p.palindrome("nurses run"));
        assert(p.palindrome("Madam, I'm Adam"));
        assert(p.palindrome("A Man! A Plan! A Canal! Panama!"));
    }
}
