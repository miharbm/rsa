package org.example;

import java.math.BigInteger;

import org.example.crypt.*;

public class Main {
    public static void main(String[] args) {

      Crypt crypt = new Crypt();


      System.out.println("private key: " + crypt.getPrivateKey());
      System.out.println("public key: " + crypt.getPublicKey());

      BigInteger encrypted = crypt.encrypt( BigInteger.valueOf( 12345 ));
      System.out.println("encrypted: " + encrypted);

      BigInteger decrypted = crypt.decrypt( encrypted);
      System.out.println("decrypted: " + decrypted);


    }

}