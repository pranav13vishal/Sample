package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Entity.BusData;
import com.Pranav.RedBus.Entity.User;
import com.Pranav.RedBus.Repository.BusDataRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BusDataServiceImpl implements BusDataService {
    BusDataRepo busDataRepo;
    ModelMapper modelMapper;

    @Override
    public BusDataDto addBus(BusDataDto busDataDto) {
        BusData busData = modelMapper.map(busDataDto,BusData.class);
        return modelMapper.map(busDataRepo.save(busData), BusDataDto.class);
    }

    @Override
    public BusDataDto updateBus(BusDataDto busDataDto, Long id) {
        BusData busData = busDataRepo.findById(id).get();
        modelMapper.map(busDataDto,busData);
        return modelMapper.map(busDataRepo.save(busData), BusDataDto.class);

    }

    @Override
    public void deleteBus(Long id) {
        busDataRepo.deleteById(id);
    }

    @Override
    public BusDataDto viewBus(Long id) {
        BusData busData = busDataRepo.findById(id).get();
        return modelMapper.map(busData, BusDataDto.class);

    }

    @Override
    public List<BusDataDto> viewAllBus() {
        return busDataRepo.findAll().stream()
                .map(busData ->
                        modelMapper.map(busData, BusDataDto.class)
                )
                .toList();
    }
}
