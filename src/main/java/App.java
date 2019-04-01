import service.UserService;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        final UserService userService = new UserService();

        System.out.println(userService.findAll());
        System.out.println(userService.findOne("Ivan"));
        System.out.println(userService.findAllIDs());

    }

}
