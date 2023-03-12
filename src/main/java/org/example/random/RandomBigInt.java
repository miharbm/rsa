package org.example.random;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RandomBigInt {
    public static BigInteger randomBigInt(){

        BigInteger big;

        do{
            big = new BigInteger( 1024, new SecureRandom() );

        }while(!big.isProbablePrime( 10000 ));

        return big;
    }
}
