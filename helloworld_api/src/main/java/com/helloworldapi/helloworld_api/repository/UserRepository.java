package com.helloworldapi.helloworld_api.repository;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.helloworldapi.helloworld_api.Entity.User;



public interface UserRepository extends JpaRepository<User, Long>{
    // void update(Optional<User> user);
}
