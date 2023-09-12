package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void sendEmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void sendRegularStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello"));
    }
    @Test
    public void unbalancedPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void sendOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void sendClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void sendStringWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }
    @Test
    public void sendStringWithBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello]]"));
    }
    @Test
    public void sendStringNumberReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("9"));
    }
    @Test
    public void sendDifferentTypesOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{))}]"));
    }
}

