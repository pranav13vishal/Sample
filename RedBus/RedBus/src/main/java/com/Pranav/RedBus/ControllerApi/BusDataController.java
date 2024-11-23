//package com.Pranav.RedBus.ControllerApi;
//
//import com.Pranav.RedBus.Dto.BusDataDto;
//import com.Pranav.RedBus.Service.BusDataService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("/api/buses")
//@AllArgsConstructor
//public class BusDataController {
//
//    private BusDataService busDataService;
//
//    @PostMapping
//    public ResponseEntity<BusDataDto> createBus(@RequestBody BusDataDto busDataDto) {
//        return new ResponseEntity<>(busDataService.addBus(busDataDto), HttpStatus.CREATED);
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<BusDataDto> updateBus(@RequestBody BusDataDto busDataDto, @PathVariable("id") Long id) {
//        return new ResponseEntity<>(busDataService.updateBus(busDataDto,id), HttpStatus.OK);
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteBus(@PathVariable("id") Long id) {
//        busDataService.deleteBus(id);
//        return new ResponseEntity<>("User deleted successfully!!!", HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<BusDataDto> getBus(@PathVariable("id") Long id) {
//        return new ResponseEntity<>(busDataService.viewBus(id), HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<BusDataDto>> getAllBus() {
//        return new ResponseEntity<>(busDataService.viewAllBus(), HttpStatus.OK);
//    }
//}
//
////{
////        "busNumber":"TN48AS1234",
////        "busName": "pranavtravels",
////        "capacity": 25,
////        "source" : "cbe",
////        "destination":"mas",
////        "price": 200,
////        "date":"05-11-2024",
////        "time": "11:30",
////        "duration":6,
////        "availableSeats":20
////        }
