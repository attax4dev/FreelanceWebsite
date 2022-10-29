package com.example.freelancewebsite.Model.Repository;

import com.example.freelancewebsite.Model.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findUserEntityByEmail(String email);
}

