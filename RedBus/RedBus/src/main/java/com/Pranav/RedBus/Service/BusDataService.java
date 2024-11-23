package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Entity.BusData;

import java.util.List;

public interface BusDataService {

    BusDataDto addBus(BusDataDto busDataDto) ;
    BusDataDto updateBus(BusDataDto busDataDto, Long id);
    void deleteBus(Long id);
    BusDataDto viewBus(Long id);
    List<BusDataDto> viewAllBus();
    List<BusDataDto> searchBuses(String source, String destination, String date);
//     List<BusData> searchBuses(String source, String destination, String date);

}
