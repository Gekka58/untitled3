package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Nikolai", "Safronov", (byte) 12);
        userService.saveUser("Alexei", "Golovanov", (byte) 45);
        userService.saveUser("Veronika", "Milohina", (byte) 35);
        userService.saveUser("Aleksandr", "Vorobiev", (byte) 22);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable(); // реализуйте алгоритм здесь
    }
}
