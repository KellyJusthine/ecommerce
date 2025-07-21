package com.project_ecommerce.model.dao;

import com.project_ecommerce.model.LocalUser;
import com.project_ecommerce.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    void deletedByUser(LocalUser user);
}
