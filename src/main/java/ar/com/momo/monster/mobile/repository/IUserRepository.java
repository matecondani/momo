package ar.com.momo.monster.mobile.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import  ar.com.momo.monster.mobile.model.entity.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

    Optional<User> findByName (String username);

}
