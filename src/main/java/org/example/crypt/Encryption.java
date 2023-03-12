package org.example.crypt;

import java.math.BigInteger;

class Encryption {
    static BigInteger encrypt(BigInteger data, Key key ){

        return Exponentiation.modExp( data, key.ed(), key.n() );
    }

    static BigInteger decrypt(BigInteger data, Key key ){
        return encrypt( data, key );
    }
}
