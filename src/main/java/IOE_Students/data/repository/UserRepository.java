package IOE_Students.data.repository;

import IOE_Students.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository("userRepository")
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
