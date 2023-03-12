package org.example.random;

import java.math.BigInteger;

public class CoprimeEuclid {

    private BigInteger j;


    public CoprimeEuclid(){}

    public BigInteger getJ(){
        return this.j;
    }


    private Trio euclid(final BigInteger a, final BigInteger b){

        if( b.equals( BigInteger.ZERO )){
            return new Trio(a,1,0);
        } else {
            final Trio trio = euclid( b, a.mod( b ) );
            return new Trio(trio.g, trio.j , trio.i.subtract( a.divide( b ).multiply( trio.j ) ) ) ;
        }
    }


    public BigInteger find(BigInteger r){

        Trio trio;

        BigInteger e = new BigInteger( String.valueOf( 3 ) );

        do{
            e = e.add( BigInteger.valueOf( 2 ) );

            trio = euclid( r, e );

        } while (!trio.g.equals( BigInteger.ONE ));

        this.j = trio.j;

        return e;
    }


}


