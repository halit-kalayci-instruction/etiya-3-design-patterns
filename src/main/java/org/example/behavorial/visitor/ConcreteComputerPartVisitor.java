package org.example.behavorial.visitor;

public class ConcreteComputerPartVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Klasik bilgisayar üretildi.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Klasik klavye üretildi.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Klasik monitör üretildi.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Klasik mouse üretildi.");
    }
}
