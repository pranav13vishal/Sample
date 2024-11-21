//package com.Pranav.RedBus.security;//package com.example.todo_management.security;
//
//import com.Pranav.RedBus.Entity.User;
//import com.Pranav.RedBus.Repository.UserRepo;
//
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//@AllArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//    private UserRepo userRepos;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepos.findByEmail(username).get();
////                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));;
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(user.getRole()));
//
//        return new org.springframework.security.core.userdetails.User(
//                username,
//                user.getPassword(),
//                authorities
//        );
//    }
//}
