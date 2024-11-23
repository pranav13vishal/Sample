package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Dto.ReservationDto;
import com.Pranav.RedBus.Entity.BusData;
import com.Pranav.RedBus.Entity.Reservation;
import com.Pranav.RedBus.Repository.BusDataRepo;
//import com.Pranav.RedBus.Repository.ReservationRepo;
import com.Pranav.RedBus.Repository.ReservationRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BusDataServiceImpl implements BusDataService {

    BusDataRepo busDataRepo;
    ModelMapper modelMapper;
    ReservationRepo reservationRepo;

    @Override
    public BusDataDto addBus(BusDataDto busDataDto) {
        BusData busData = modelMapper.map(busDataDto, BusData.class);

        ReservationDto reservationDto =
                new ReservationDto(busData.getId(), busData.getSource(), busData.getDestination(), busDataDto.getDate());
        reservationRepo.save(modelMapper.map(reservationDto, Reservation.class));

        return modelMapper.map(busDataRepo.save(busData), BusDataDto.class);
    }

    @Override
    public BusDataDto updateBus(BusDataDto busDataDto, Long id) {
        BusData busData = busDataRepo.findById(id).get();
        busData.setBusNumber(busDataDto.getBusNumber());
        busData.setBusName(busDataDto.getBusName());
        busData.setCapacity(busDataDto.getCapacity());
        busData.setSource(busDataDto.getSource());
        busData.setDestination(busDataDto.getDestination());
        busData.setPrice(busDataDto.getPrice());
        busData.setDate(busDataDto.getDate());
        busData.setTime(busDataDto.getTime());
        busData.setDuration(busDataDto.getDuration());
        busData.setAvailableSeats(busDataDto.getAvailableSeats());
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

//    public List<BusDataDto> findBuses(String source, String destination, String date) {
//        return busDataRepo.findBySourceAndDestinationAndDate(source, destination, date)
//                .stream()
//                .map(busData ->
//                        modelMapper.map(busData, BusDataDto.class)
//                )
//                .toList();
//    }

    //    public List<BusData> searchBuses(String source, String destination, String date) {
//        return busDataRepo.findBySourceAndDestinationAndDate(source, destination, date);
//    }
    public List<BusDataDto> searchBuses(String source, String destination, String date) {
        return busDataRepo.findBySourceAndDestinationAndDate(source, destination, date)
                .stream()
                .map(busData ->
                        modelMapper.map(busData, BusDataDto.class)
                )
                .toList();
    }
}
