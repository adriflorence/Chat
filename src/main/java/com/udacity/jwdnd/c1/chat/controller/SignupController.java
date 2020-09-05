package com.udacity.jwdnd.c1.chat.controller;

import com.udacity.jwdnd.c1.chat.model.User;
import com.udacity.jwdnd.c1.chat.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {

    private final UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getSignupView() {
        return "signup";
    }

    @PostMapping()
    public String signupUser(@ModelAttribute User user, Model model) {
        String signupError = "some arbitrary error message";

        // TODO cases for error message

        model.addAttribute("signupSuccess", true);
        model.addAttribute("signupError", signupError);
        return "signup";
    }
}
