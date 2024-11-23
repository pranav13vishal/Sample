package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Dto.BusDataDto;
import com.Pranav.RedBus.Entity.BusData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface BusDataRepo extends JpaRepository<BusData,Long> {
//    @Query(value = "select * from Reservation  where reservation.to_destination =:to and reservation.from_destination =:from and reservation.filter_date =:date  order By reservation.filter_date desc " , nativeQuery = true)
//    List<BusData> findByToFromAndDate(String to , String from, String date);
//List<BusData> findBySourceAndDestinationAndDate(String source, String destination, String date);

    List<BusData> findBySourceAndDestinationAndDate(String source, String destination, String date);

//    @Query("SELECT b FROM Bus b WHERE b.startLocation = :from AND b.endLocation = :to AND b.date = :date")
//    List<BusData> findBusesByRouteAndDate(@Param("from") String from, @Param("to") String to, @Param("date") LocalDate date);

}
