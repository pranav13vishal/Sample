package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.Bookings;
import com.Pranav.RedBus.Entity.BusData;
import com.Pranav.RedBus.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

