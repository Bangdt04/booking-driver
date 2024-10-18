package com.fpt.booking.domain.payload.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private String accessToken;
    @JsonIgnore
    private String tokenType = "Bearer";
    private Integer role;

    public AuthResponse(String accessToken, Integer role) {
        this.accessToken = accessToken;
        this.role = role;
    }

    public AuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}