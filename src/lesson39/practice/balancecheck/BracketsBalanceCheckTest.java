package practice.balancecheck;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsBalanceCheckTest {
    BracketsBalanceCheck check = new BracketsBalanceCheck();

    @Test
    public void bracketsBalanceProofTrueTest() {
        boolean expected = true;
        boolean actual = check.bracketsBalanceProof("(nsk [,dk],,d{ms( ) })");
        assertEquals(expected, actual);
    }
    @Test
    public void bracketsBalanceProofFalseTest() {
        boolean expected = false;
        boolean actual = check.bracketsBalanceProof("(nsk [,dk)],,d{(ms( ) })");
        assertEquals(expected, actual);
    }
    @Test
    public void bracketsBalanceProofEmptyString() {
        boolean expected = true;
        boolean actual = check.bracketsBalanceProof("nsk ,dk,,ms");
        assertEquals(expected, actual);

    }
}