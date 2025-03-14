package com.example.shared_libs.dto;

import java.time.LocalDateTime;

public record AppointmentRequest(
        LocalDateTime startTime,
        String patientId,
        String doctorId,
        String reason
) {
}
