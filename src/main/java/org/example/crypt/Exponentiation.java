package org.example.crypt;

import java.math.BigInteger;

class Exponentiation {
    static BigInteger modExp(BigInteger x, BigInteger d, BigInteger n){

        if(d.equals( BigInteger.ZERO )){
            return BigInteger.ONE;
        } else if (d.mod( BigInteger.TWO ).equals( BigInteger.ZERO )) {
            return modExp( x, d.divide( BigInteger.TWO ), n )
                    .pow( 2 )
                    .mod( n );
        } else {
            return modExp( x, d.subtract( BigInteger.ONE ).divide( BigInteger.TWO ), n )
                    .pow( 2 )
                    .multiply( x ).mod( n );
        }
    }
}
