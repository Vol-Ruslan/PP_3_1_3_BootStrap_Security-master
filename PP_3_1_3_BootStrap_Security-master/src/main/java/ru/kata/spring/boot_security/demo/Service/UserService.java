package ru.kata.spring.boot_security.demo.Service;


import ru.kata.spring.boot_security.demo.model.User;


import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    void edit(User user);

    User getById(long id);

    User findByEmail(String email);
}
