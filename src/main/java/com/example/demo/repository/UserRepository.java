package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// не обязательно @Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //@Query(value = "select * from users where email = :email", nativeQuery = true)
    //@Query(value = "select u from User u where u.email = :email")
    //User findByEmail(String email);

    Optional<User> findAllByEmail(String email);

}
