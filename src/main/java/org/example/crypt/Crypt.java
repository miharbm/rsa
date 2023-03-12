package org.example.crypt;

import org.example.random.CoprimeEuclid;
import org.example.random.RandomBigInt;

import java.math.BigInteger;



public class Crypt {

    private final Key publicKey;
    private final Key privateKey;

    public Crypt(){
        BigInteger p = RandomBigInt.randomBigInt();
        BigInteger q = RandomBigInt.randomBigInt();
        BigInteger n = p.multiply( q );
        BigInteger r = p.subtract( BigInteger.ONE).multiply( q.subtract( BigInteger.ONE ) );

        CoprimeEuclid coprime = new CoprimeEuclid();

        BigInteger e = coprime.find( r );

        BigInteger d = coprime.getJ().mod( r );

        this.publicKey = new Key( e, n );
        this.privateKey = new Key( d, n );
    }

    public BigInteger encrypt(BigInteger data){
        return Encryption.encrypt( data, this.publicKey);
    }

    public BigInteger decrypt(BigInteger data){
        return Encryption.decrypt( data, this.privateKey);
    }
    public static BigInteger encrypt(BigInteger data, Key publicKey){
        return Encryption.encrypt( data, publicKey);
    }

    public static BigInteger decrypt(BigInteger data, Key privateKey){
        return Encryption.decrypt( data, privateKey);
    }

    public Key getPrivateKey() {
        return privateKey;
    }

    public Key getPublicKey() {
        return publicKey;
    }
}
