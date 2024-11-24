package GUVI.Project.Mini1.Controller;
import GUVI.Project.Mini1.Model.UserDto;
import GUVI.Project.Mini1.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "User Management API - CRED API ",
        description = "Endpoints for managing users "
)
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @Operation(summary = "Create a new user", description = "Creating a new valid user in the database")
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(userService.saveUser(userDto), HttpStatus.CREATED);
    }

    @Operation(summary = "Update a user", description = "Updates an existing user's details in the database")
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@RequestBody @Valid UserDto userDto, @PathVariable("id") Long id){
        return new ResponseEntity<>(userService.updateUser(userDto,id), HttpStatus.OK);
    }

    @Operation(summary = "Delete a user", description = "Deletes a user from the database")
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully!!!", HttpStatus.NO_CONTENT);
    }

    @Operation(summary = "Get a users", description = "Fetches the users from the database based on the id")
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @Operation(summary = "Get all users", description = "Fetches all users from the database")
    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
//{
//        "firstName": "Pranav",
//        "lastName": "Vishal",
//        "department": "work",
//        "salary": 5000,
//        "email": "pv1@gmail.com",
//        "phoneNumber": 8870985863,
//        "address": "akg nagaer",
//        "hireDate": "12-05-2024"
//
//        }

