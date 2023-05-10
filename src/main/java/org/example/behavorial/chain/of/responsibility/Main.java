package org.example.behavorial.chain.of.responsibility;

public class Main {
    public static void main(String[] args) {
        Middleware chain = Middleware.link(
                new ThrottleMiddleware(2),
                new UserExistsMiddleware(),
                new RoleCheckMiddleware()
        );

        UserService userService = new UserService(chain);
        userService.login("etiya1@etiya.com","12345");
        userService.login("etiya@etiya.com","admin");
        userService.login("etiya@etiya.com","admin");
    }
}
// 14.25