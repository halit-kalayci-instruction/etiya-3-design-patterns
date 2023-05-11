package org.example.behavorial.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryConverter binaryConverter = new BinaryConverter(subject);
        HexaConverter hexaConverter = new HexaConverter(subject);
        OctalConverter octalConverter = new OctalConverter(subject);

        subject.setNumber(5);
        System.out.println("***********");
        subject.setNumber(10);
    }
}
