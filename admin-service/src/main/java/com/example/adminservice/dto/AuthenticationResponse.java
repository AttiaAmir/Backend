package com.example.adminservice.dto;

import com.example.adminservice.model.MyUserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {
    private String token;
    private MyUserDetails user ;
}
