package com.akasa.modelsdto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightResponseDto {
	private String origin;
	private String destination;
	private LocalDate flightDate;
}
