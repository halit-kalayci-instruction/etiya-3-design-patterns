package org.example.behavorial.visitor;

public class ComputerPartGamerVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Gaming bilgisayar üretildi.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Gaming klavye üretildi.");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Gaming monitör üretildi.");

    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Gaming mouse üretildi.");

    }
}
