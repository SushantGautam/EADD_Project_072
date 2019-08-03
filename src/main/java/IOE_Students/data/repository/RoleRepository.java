package IOE_Students.data.repository;


import IOE_Students.data.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository("roleRepository")
@Transactional
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByRole(String roleName);
}
