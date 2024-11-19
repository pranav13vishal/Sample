package com.Pranav.RedBus.Controller;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Service.BusDataService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/buses")
@AllArgsConstructor
public class BusDataController {
    private BusDataService BusDataService;

    @PostMapping
    public ResponseEntity<BusDataDto> createBus(@RequestBody BusDataDto busDataDto) {
        return new ResponseEntity<>(BusDataService.addBus(busDataDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<BusDataDto> updateBus(@RequestBody BusDataDto busDataDto, @PathVariable("id") Long id) {
        return new ResponseEntity<>(BusDataService.updateBus(busDataDto,id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBus(@PathVariable("id") Long id) {
        BusDataService.deleteBus(id);
        return new ResponseEntity<>("User deleted successfully!!!", HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}")
    public ResponseEntity<BusDataDto> getBus(@PathVariable("id") Long id) {
        return new ResponseEntity<>(BusDataService.viewBus(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BusDataDto>> getAllBus() {
        return new ResponseEntity<>(BusDataService.viewAllBus(), HttpStatus.OK);
    }
}
