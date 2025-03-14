package com.example.shared_libs.dto;

import java.time.LocalDateTime;

public record AppointmentDto(
    LocalDateTime startTime,
    LocalDateTime endTime,
    String patientId,
    String doctorId,
    String reason,
    String status

) {
}
