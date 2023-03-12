package org.example.random;

import java.math.BigInteger;

class Trio {
    BigInteger g, i, j;

    Trio(BigInteger _g, BigInteger _i, BigInteger _j){
        this.g = _g;
        this.i = _i;
        this.j = _j;
    }
    Trio(BigInteger _g, int _i, int _j){
        this.g =  _g ;
        this.i = BigInteger.valueOf(_i);
        this.j = BigInteger.valueOf(_j);
    }
}
