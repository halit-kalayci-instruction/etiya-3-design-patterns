package org.example.behavorial.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}

