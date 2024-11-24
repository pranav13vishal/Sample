package GUVI.Project.Mini1.Controllerm;//package com.PRANAV.Mini1.Controller;
//
//import com.PRANAV.Mini1.Model.UserDto;
//import com.PRANAV.Mini1.Service.UserService;
//import com.PRANAV.Mini1.Model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    // View all users
//    @GetMapping
//    public String getAllUsers(Model model) {
//        List<UserDto> users = userService.getAllUsers();
//        model.addAttribute("users", users);
//        return "user-list";
//    }
//
//    // View user details
//    @GetMapping("/{id}")
//    public String getUserDetails(@PathVariable("id") Long id, Model model) {
//        UserDto user = userService.getUserById(id);
//        model.addAttribute("user", user);
//        return "user-detail"; // Create a page to view details if necessary
//    }
//
//    // Show form to create a new user
//    @GetMapping("/create")
//    public String showCreateUserForm(Model model) {
//        model.addAttribute("user", new User());
//        return "user-form"; // This page will be for creating a user
//    }
//
//    // Save new user
//    @PostMapping("/create")
//    public String createUser(@ModelAttribute("user") UserDto user) {
//        userService.saveUser(user);
//        return "redirect:/users";
//    }
//
//    // Show form to edit user
//    @GetMapping("/edit/{id}")
//    public String showEditUserForm(@PathVariable("id") Long id, Model model) {
//        UserDto user = userService.getUserById(id);
//        model.addAttribute("user", user);
//        return "user-form"; // This page will be for editing a user
//    }
//
//    // Update user
//    @PostMapping("/edit/{id}")
//    public String updateUser(@PathVariable("id") Long id, @ModelAttribute("user") UserDto user) {
//        user.setId(id);
//        userService.saveUser(user);
//        return "redirect:/users";
//    }
//
//    // Delete user
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/users";
//    }
//}
