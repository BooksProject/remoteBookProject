package Repostories;

import Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmailAndPassword(String email,String password);
    User findByFirstNameAndLastName(String firstName,String lastName);
}
