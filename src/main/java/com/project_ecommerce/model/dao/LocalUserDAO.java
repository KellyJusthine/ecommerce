package com.project_ecommerce.model.dao;

import com.project_ecommerce.model.LocalUser;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends ListCrudRepository<LocalUser, Long> {

    Optional<LocalUser> findByUsernameIgnoreCase(String name);
    Optional<LocalUser> findByEmailIgnoreCase(String email);
}
