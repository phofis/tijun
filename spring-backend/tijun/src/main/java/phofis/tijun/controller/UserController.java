package phofis.tijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import phofis.tijun.model.User;
import phofis.tijun.service.UserService;

@RestController("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestParam String name, @RequestParam String password) {
        return userService.save(new User().username(name).password(password));
    }

    @GetMapping("/login")
    public User findUser(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }
}
