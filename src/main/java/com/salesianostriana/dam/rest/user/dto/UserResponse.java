package com.salesianostriana.dam.rest.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
// import net.bytebuddy.implementation.bind.annotation.Super;
import com.salesianostriana.dam.rest.user.model.User;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor @AllArgsConstructor
@SuperBuilder
public class UserResponse {

    protected String id;
    protected String email;
    protected String username, avatar, fullName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    protected LocalDateTime createdAt;


    public static UserResponse fromUser(User user) {

        return UserResponse.builder()
                .id(user.getId().toString())
                .email(user.getEmail())
                .username(user.getUsername())
                .avatar(user.getAvatar())
                .fullName(user.getFullName())
                .createdAt(user.getCreatedAt())
                .build();
    }

}
