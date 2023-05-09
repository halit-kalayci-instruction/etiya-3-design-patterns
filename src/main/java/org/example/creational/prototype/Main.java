package org.example.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Sheep originalSheep = new Sheep("Lorry");
        System.out.println(originalSheep);
        System.out.println(originalSheep.name);
        Sheep clonedSheep =
                (Sheep)originalSheep.makeCopy();
        System.out.println(clonedSheep);
        System.out.println(clonedSheep.name);
    }
}
