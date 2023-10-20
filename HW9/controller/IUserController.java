package HW9.controller;

import HW9.exceptions.UserNotFountException;
import HW9.model.User;

import java.util.List;

public interface IUserController {
    User addUser(String userName);
    User deleteUser(int userId) throws UserNotFountException;
    List<User> getUsers();
}
