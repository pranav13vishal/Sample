package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Entity.User;

import java.util.List;

public interface UserService {

     UserDto addUser(UserDto userDto) ;
     UserDto updateUser(UserDto userDto,Long id) ;
     void deleteUser(Long id) ;
     UserDto viewUser(Long id) ;
     List<UserDto> viewAllUsers() ;
     UserDto findUserByEmail(String email);

}