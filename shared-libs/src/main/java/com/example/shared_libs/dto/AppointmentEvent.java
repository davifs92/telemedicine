package com.example.shared_libs.dto;

import java.time.LocalDateTime;

public record AppointmentEvent(
        String appointmentId,
        String eventType,
        String patientId,
        String doctorId,
        LocalDateTime timestamp
) {
}
