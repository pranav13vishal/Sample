package com.example.demo.controller;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pv")
@AllArgsConstructor
public class Usercontroller {
    private UserService userService;

    @PostMapping
    public ResponseEntity<Userdto> createUser(@RequestBody Userdto userdto) {
        return new ResponseEntity<>(userService.createUser(userdto), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Userdto>> getAllUser() {
        return new ResponseEntity<>(userService.getallUser(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Userdto> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Userdto> updateUser(@PathVariable Long id, @RequestBody Userdto userdto) {
        return new ResponseEntity<>(userService.update(id,userdto), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>("user deleted", HttpStatus.NO_CONTENT);
    }
}

