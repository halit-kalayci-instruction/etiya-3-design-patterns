package org.example.structural.facade.authorization;

public class Authorization implements IAuthorization {

    @Override
    public void authorize() {
        System.out.println("Authorization");
    }
}
