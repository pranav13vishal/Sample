//package com.Pranav.RedBus.ControllerApi;
//
//import com.Pranav.RedBus.Dto.BusDataDto;
//import com.Pranav.RedBus.Entity.Bookings;
//import com.Pranav.RedBus.Service.BookingService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/booking")
//@AllArgsConstructor
//public class BookingController {
//    BookingService bookingService;
//
//    @GetMapping
//    public ResponseEntity<List<Bookings>> getAllBookings() {
//        return new ResponseEntity<>(bookingService.viewAllBus(), HttpStatus.OK);
//    }
//}
