package com.tkk.spring_boot_demo.controller;

import com.tkk.spring_boot_demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created  on 2018-05-23
 *
 * @author 唐开阔
 * @describe
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/getUser/{username}", method = RequestMethod.GET)
    public String login(@PathVariable String username, @RequestParam String pwd) {
        return "Welcome," + username;
    }
}
