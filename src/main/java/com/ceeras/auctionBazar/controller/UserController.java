package com.ceeras.auctionBazar.controller;

import com.ceeras.auctionBazar.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, String> userData) {
        String email = userData.get("email");
        String password = userData.get("password");
        String name = userData.get("name");

        return userService.registerUser(email, password, name);
    }
    @PutMapping("/update")
    public User update(@RequestHeader ("Authorization") String jwt,@RequestBody Map<String, String> user)  {
        User main=userRepository.findByEmail(user.get("email");
        return userService.Update(main,user);
    }
}
