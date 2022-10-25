package app.household.household.manager.response.auth;

import app.household.household.manager.entities.dto.UserDto;

public record RegistrationResponse(String message, boolean isSuccess, UserDto userDto) {}
