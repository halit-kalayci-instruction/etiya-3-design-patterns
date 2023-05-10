package org.example.behavorial.chain.of.responsibility;

// Soyutlama
public class UserService {

    private Middleware middleware;

    public UserService(Middleware middleware) {
        this.middleware = middleware;
    }

    public void login(String email, String password){
        if(this.middleware.check(email,password)){
            System.out.println("Giriş yapıldı.");
            return;
        }
        System.out.println("Giriş başarısız.");
    }
}
