package com.example.demowithtests.dto.employee;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.HashSet;
import java.util.Set;


public class EmployeeDto {
    public EmployeeDto(String name, String country, String email, Set<AddressDto> addresses, Set<PhotoDto> photos) {
        this.name = name;
        this.country = country;
        this.email = email;
        this.addresses = addresses;
        this.photos = photos;
    }
    @Schema(description = "Name of an employee.", example = "Billy Sullyvan", required = true)
    public String name;

    @Schema(description = "Country of an employee.", example = "Ukraine", required = true)
    public String country;

    @Schema(description = "Email of an employee.", example = "billy@ukr.net", required = true)
    public String email;

    @Schema(description = "Addresses of an employee.", example = "Ukraine, Odesa, Sakharova", required = true)
    public Set<AddressDto> addresses = new HashSet<>();

    @Schema(description = "Photos of an employee.", example = "http://link.com, 30,30", required = true)
    public Set<PhotoDto> photos = new HashSet<>();

    //public Date creationTime = Date.from(Instant.now());
}
