package com.Pranav.RedBus.Controller;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Service.BusDataService;
import com.Pranav.RedBus.Service.BusDataServiceImpl;
import com.Pranav.RedBus.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;
    private BusDataService busDataService;

    @GetMapping("/home")
    public String showhome() {
        return "home";  // Return the registration page view
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "register";
    }

    @PostMapping("/register/save")
    public String registerUser(@ModelAttribute UserDto userDto,BindingResult result, Model model) {
        UserDto existingUser = userService.findUserByEmail(userDto.getEmail());
        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }
        if (result.hasErrors()) {
            model.addAttribute("userDto", userDto);
            return "/register";
        }
        userService.addUser(userDto);
        return "redirect:/login?success";
         // Redirect to login page after successful registration
    }

//    @GetMapping("/searchBuses")
//    public String searchBuses(@RequestParam String source,
//                              @RequestParam String destination,
//                              @RequestParam String date,
//                              Model model) {
//        // Call service to get buses matching the search criteria
//        List<BusDataDto> buses = busDataService.findBuses(source, destination, date);
//
//        // Add the buses to the model to display in the view
//        model.addAttribute("buses", buses);
//
//        return "home";  // Return the view with the search results
@GetMapping("/searchBuses")
public String searchBuses(@RequestParam String from,
                          @RequestParam String to,
                          @RequestParam String date,
                          Model model) {
    // Search for buses based on the input parameters
    List<BusDataDto> buses = busDataService.findBuses(from, to, date);
    model.addAttribute("buses", buses);
    model.addAttribute("from", from);
    model.addAttribute("to", to);
    model.addAttribute("date", date);
    return "home";  // Return to the same page with search results
}


}
