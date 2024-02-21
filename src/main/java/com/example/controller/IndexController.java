package com.example.controller;


import com.example.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @PostMapping("/register")
    public String register(@ModelAttribute User user, BindingResult result) {
        // Process form data




        // Validation logic
        if (result.hasErrors()) {
            // Add error messages to the result object
            return "index"; // Return to the form with errors displayed
        }

        // Process the valid user data
        System.out.println(user.toString()); // Print user details for demonstration

        return "redirect:/";
    }
}
