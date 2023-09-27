package com.starryzeng.springbootsecurity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author StarryZeng
 * @version 1.0.0
 * @date 2023/9/27 17:31
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.withUsername("admin").password(passwordEncoder.encode("123456")).authorities("admin").build();
    }
}
