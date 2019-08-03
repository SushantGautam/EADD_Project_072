package IOE_Students.business.service;

import IOE_Students.business.domain.UserProfile;
import IOE_Students.data.entity.Role;
import IOE_Students.data.entity.User;
import IOE_Students.data.repository.RoleRepository;
import IOE_Students.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserProfileService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserProfileService(@Qualifier("userRepository") UserRepository userRepository, @Qualifier("roleRepository") RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<UserProfile> getAllUserProfiles() {
        Iterable<User> users = this.userRepository.findAll();
        List<UserProfile> userProfiles = new ArrayList<>();

        users.forEach( user -> {
            userProfiles.add(this.getUserProfileById(user.getId()));
        });

        return userProfiles;
    }

    public UserProfile getUserProfileById(long userId) {
        User user = this.userRepository.findOne(userId);
        UserProfile userProfile = new UserProfile();

        userProfile.setUserId(user.getId());
        userProfile.setEmail(user.getEmail());
        userProfile.setFirstName(user.getName());
        userProfile.setLastName(user.getLastName());
        userProfile.setActive(user.getActive() == 1 ? true : false);

        Set<Role> roles = user.getRoles();
        List<String> roleNames = new ArrayList<>();
        roles.forEach(role -> {
            roleNames.add(role.getRole());
        });
        userProfile.setRoles(roleNames);

        return userProfile;
    }

    public List<UserProfile> getUserProfilesByRole(String roleName) {
        Role role = this.roleRepository.findByRole(roleName);
        Iterable<User> users = this.userRepository.findAll();
        List<UserProfile> userProfiles = new ArrayList<>();

        users.forEach( user -> {
            if (user.getRoles().contains(role)) {
                userProfiles.add(this.getUserProfileById(user.getId()));
            }
        });

        return userProfiles;
    }

}
