package org.example.crypt;

import java.math.BigInteger;

record Key(BigInteger ed, BigInteger n) {

    @Override
    public String toString() {
        return "ed = " + ed + "\n" + "n = " + n;
    }
}
