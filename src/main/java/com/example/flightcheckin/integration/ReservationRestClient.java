package com.example.flightcheckin.integration;

import com.example.flightcheckin.integration.dto.Reservation;
import com.example.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {// make web services call
    Reservation findReservation(Long id);

    Reservation updateReservation(ReservationUpdateRequest request);
}
