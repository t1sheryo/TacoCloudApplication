package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}