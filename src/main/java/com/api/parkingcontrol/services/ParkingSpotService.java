package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface ParkingSpotService {



    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

    public boolean existsByLicensePlateCar(String licensePlateCar);

    public boolean existsByParkingSpotNumber(String parkingSpotNumber);

    public boolean existsByApartmentAndBlock(String apartment, String block);

    public Page<ParkingSpotModel> findAll(Pageable pageable);

    public Optional<ParkingSpotModel> findById(UUID id);


    public void delete(ParkingSpotModel parkingSpotModel);
}
