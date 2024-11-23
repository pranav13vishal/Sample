package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Entity.Bookings;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public interface BookingService {
    List<Bookings> viewAllBus();
    Bookings saveBooking(Bookings booking);
    void generatePdfWithPDFBox(Bookings booking, HttpServletResponse response) throws IOException;
}
