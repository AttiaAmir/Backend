package com.example.adminservice.service;

import com.example.adminservice.model.Admin;
import com.example.adminservice.model.MyUserDetails;
import com.example.adminservice.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService {
    @Autowired
    private AdminRepository adminRepository ;

    //@Override
    public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        admin.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
        return admin.map(MyUserDetails::new).get();
    }
}
