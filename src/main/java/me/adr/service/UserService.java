package me.adr.service;

import me.adr.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
