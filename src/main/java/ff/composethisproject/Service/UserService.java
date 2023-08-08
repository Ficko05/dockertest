package ff.composethisproject.Service;


import ff.composethisproject.Repository.RolesRepo;
import ff.composethisproject.Repository.UserRepo;
import ff.composethisproject.dto.UserDto;
import ff.composethisproject.entity.Roles;
import ff.composethisproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepository;

    @Autowired
    RolesRepo rolesRepository;

    public User createUser(UserDto userDto) {

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        user = userRepository.save(user);

        Roles roles = new Roles();

        roles.setAdmin(true);
        roles.setUserId(user);


        roles = rolesRepository.save(roles);



        return user;


    }
}
