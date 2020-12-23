package com.example.simplecrudspringwebflux.repositories;

import com.example.simplecrudspringwebflux.models.Users;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends ReactiveMongoRepository<Users, Long> {
}
