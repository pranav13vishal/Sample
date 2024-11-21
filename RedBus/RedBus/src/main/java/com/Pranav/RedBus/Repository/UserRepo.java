package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.Bookings;
import com.Pranav.RedBus.Entity.BusData;
import com.Pranav.RedBus.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}

