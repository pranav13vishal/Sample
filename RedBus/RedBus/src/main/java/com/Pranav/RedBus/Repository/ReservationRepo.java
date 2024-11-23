package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {}
