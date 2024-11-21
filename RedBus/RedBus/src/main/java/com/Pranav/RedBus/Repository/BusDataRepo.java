package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.BusData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusDataRepo extends JpaRepository<BusData,Long> {
//    @Query(value = "select * from Reservation  where reservation.to_destination =:to and reservation.from_destination =:from and reservation.filter_date =:date  order By reservation.filter_date desc " , nativeQuery = true)
//    List<BusData> findByToFromAndDate(String to , String from, String date);
List<BusData> findBySourceAndDestinationAndDate(String source, String destination, String date);
}
