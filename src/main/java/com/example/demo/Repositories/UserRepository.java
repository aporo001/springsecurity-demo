package com.example.demo.Repositories;

import com.example.demo.domains.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
