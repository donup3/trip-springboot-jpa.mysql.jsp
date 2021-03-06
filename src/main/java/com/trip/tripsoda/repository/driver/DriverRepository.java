package com.trip.tripsoda.repository.driver;

import com.trip.tripsoda.domain.dirver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long>, DriverCustomRepository {
    Driver findByName(String driverName);
}


