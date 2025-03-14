package com.example.shared_libs.dto;

public record DoctorDto(
        Long id,
        String name,
        String specialization,
        String crm,
        String availability) {
}
