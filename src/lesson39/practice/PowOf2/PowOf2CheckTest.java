package practice.PowOf2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowOf2CheckTest {
    PowOf2Check check = new PowOf2Check();

    @Test
    public void powOf2ProofTrue() {

        boolean actual = check.PowOf2Proof(256);
        assertTrue(actual);
    }

    @Test
    public void powOf2ProofFalse() {

        boolean actual = check.PowOf2Proof(358);
        assertFalse(actual);
    }

    @Test
    public void powOf2ProofOf0() {

        boolean actual = check.PowOf2Proof(0);
        assertFalse(actual);
    }

    @Test
    public void powOf2ProofOfNegative() {

        boolean actual = check.PowOf2Proof(-5);
        assertFalse(actual);
    }

}