package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Bookings,Long> {}
