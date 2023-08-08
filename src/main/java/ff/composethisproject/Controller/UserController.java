package ff.composethisproject.Controller;

import ff.composethisproject.Repository.UserRepo;
import ff.composethisproject.Service.UserService;
import ff.composethisproject.dto.UserDto;
import ff.composethisproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserService userService;



    @GetMapping("/")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody UserDto dto) {

        var result = userService.createUser(dto);

        return ResponseEntity.ok(result);
    }
}
