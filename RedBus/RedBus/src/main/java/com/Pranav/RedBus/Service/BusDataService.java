package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.BusDataDto;

import java.util.List;

public interface BusDataService {

    BusDataDto addBus(BusDataDto bus) ;
    BusDataDto updateBus(BusDataDto bus, Long id);
    void deleteBus(Long id);
    BusDataDto viewBus(Long id);
    List<BusDataDto> viewAllBus();

}
