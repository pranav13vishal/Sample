package com.Pranav.RedBus.Controller;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Service.BusDataService;
import com.Pranav.RedBus.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
//@RequestMapping("/admin")
@AllArgsConstructor
public class BusController {

    BusDataService busDataService;
    UserService userService;

    @GetMapping("/admin")
    public String showAdmin() {
        return "admin";  //
    }

    @GetMapping("/admin-addBus")
    public String showBusRegistrationForm(Model model) {
        BusDataDto busDataDto = new BusDataDto();
        model.addAttribute("busDataDto", busDataDto);
        return "admin-addBus";
    }

    @PostMapping("/admin-addBus/save")
    public String registerBus(@ModelAttribute BusDataDto busDataDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("busDataDto", busDataDto);
            return "/admin-addBus";
        }
        busDataService.addBus(busDataDto);
        return "redirect:/admin?success";
        // Redirect to login page after successful registration
    }

    @GetMapping("/admin-viewBuses")
    public String viewAllBus(Model model) {
        List<BusDataDto> busDataDto = busDataService.viewAllBus();
        model.addAttribute("busDataDto", busDataDto);
        return "admin-viewBuses";
    }

    @GetMapping("/admin-viewUsers")
    public String users(Model model) {
        List<UserDto> users = userService.viewAllUsers();
        model.addAttribute("users", users);
        return "admin-viewUsers";
    }

    @GetMapping("/admin-deleteBus")
    public String showDeleteBusPage(Model model) {
        // Fetch all buses to display on the delete page
        List<BusDataDto> buses = busDataService.viewAllBus();
        model.addAttribute("buses", buses);
        return "admin-deleteBus";
    }
//
//    @PostMapping("/admin-deleteBus/{id}")
//    public String deleteBus(@PathVariable Long id, RedirectAttributes redirectAttributes) {
//        busDataService.deleteBus(id);
//        redirectAttributes.addFlashAttribute("success", "Bus deleted successfully!");
//        return "redirect:/admin?success";
//    }

    @GetMapping("/admin-updateBus")
    public String showUpdateBusPage(Model model) {
        // Fetch all buses to display on the update page
        List<BusDataDto> buses = busDataService.viewAllBus();
        model.addAttribute("buses", buses);
        return "admin-updateBus";
    }

//    @PostMapping("/admin-updateBus")
//    public String updateBus(@ModelAttribute BusDataDto busDataDto, RedirectAttributes redirectAttributes) {
//        busDataService.updateBus(busDataDto, busDataDto.getId());
//        redirectAttributes.addFlashAttribute("success", "Bus updated successfully!");
//        return "redirect:/admin/updateBus";
//    }

    @GetMapping("/admin-viewBookings")
    public String viewAllBookings(Model model) {
        List<BusDataDto> busDataDto = busDataService.viewAllBus();
        model.addAttribute("busDataDto", busDataDto);
        return "admin-viewBookings";
    }
}

