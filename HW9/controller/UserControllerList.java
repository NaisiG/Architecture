package HW9.controller;

import HW9.exceptions.UserNotFountException;
import HW9.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UserControllerList implements IUserController {
    private final List<User> users = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public User addUser(String userName) {
        int id = idGenerator.getAndIncrement();
        User newUser = new User(id, userName);
        users.add(newUser);
        return newUser;
    }

    public User deleteUser(int userId) throws UserNotFountException {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                return users.remove(i);
            }
        }
        throw new UserNotFountException("user not found");
    }

    public List<User> getUsers() {
        return users;
    }
}
