package org.example.behavorial.visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
}
