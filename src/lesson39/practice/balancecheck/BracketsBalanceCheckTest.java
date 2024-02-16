package practice.balancecheck;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsBalanceCheckTest {
    BracketsBalanceCheck check = new BracketsBalanceCheck();

    @Test
    public void bracketsBalanceProofTrueTest() {

        boolean actual = check.bracketsBalanceProof("(nsk [,dk],,d{ms( ) })");
        assertTrue(actual);
    }
    @Test
    public void bracketsBalanceProofFalseTest() {

        boolean actual = check.bracketsBalanceProof("(nsk [,dk)],,d{(ms( ) })");
        assertFalse( actual);
    }
    @Test
    public void bracketsBalanceProofEmptyString() {

        boolean actual = check.bracketsBalanceProof("nsk ,dk,,ms");
        assertTrue(actual);

    }
}