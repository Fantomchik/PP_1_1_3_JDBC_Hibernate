package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Dire", "Wolf", (byte) 150);
        userService.saveUser("Tyrion", "Lannister", (byte) 30);
        userService.saveUser("Daenerys", "Targaryen", (byte) 28);
        userService.saveUser("John", "Snow", (byte) 25);

        userService.removeUserById(2);

        userService.getAllUsers();

        for (User user: userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
