package avocado.ecommercebackend.user.controller;


import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/user/addUser")
    public User addUser(@RequestBody User user){return userService.addUser(user);}

    @GetMapping("/user/getAllUser")
    public List<User> getAllUser(){return userService.getAllUser();}

    @GetMapping("/user/getUser/{id}")
    public Optional<User> getUser(@PathVariable Long id){return userService.getUser(id);}
}