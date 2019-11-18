package com.company;

public class Main {

    public static void main(String[] args) {
        FeistelCipher feistel=new FeistelCipher(16,1,"AND");
        String x=feistel.encrypt("10101010");
        String y=feistel.decrypt(x);
        System.out.println(y);    }
}
