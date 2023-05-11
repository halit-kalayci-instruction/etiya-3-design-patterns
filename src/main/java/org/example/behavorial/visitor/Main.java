package org.example.behavorial.visitor;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ConcreteComputerPartVisitor());

        Computer computer1 = new Computer();
        computer1.accept(new ComputerPartGamerVisitor());
    }
}
