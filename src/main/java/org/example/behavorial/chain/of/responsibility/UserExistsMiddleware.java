package org.example.behavorial.chain.of.responsibility;

public class UserExistsMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        System.out.println("UserExists kontrol ediliyor..");
        if(email != "etiya@etiya.com"
                && email != "admin@etiya.com")
            return false;
        return checkNext(email,password);
    }
}
