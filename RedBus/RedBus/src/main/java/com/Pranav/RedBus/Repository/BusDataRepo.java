package com.Pranav.RedBus.Repository;

import com.Pranav.RedBus.Entity.BusData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusDataRepo extends JpaRepository<BusData,Long> {
    
}
