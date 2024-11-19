package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Entity.User;
import com.Pranav.RedBus.Repository.UserRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    UserRepo userRepo;
    ModelMapper modelMapper;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        return modelMapper.map(userRepo.save(user), UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Long id) {
        User user = userRepo.findById(id).get();
         modelMapper.map(userDto,user);
        return modelMapper.map(userRepo.save(user), UserDto.class);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto viewUser(Long id) {
        User user = userRepo.findById(id).get();
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> viewAllUsers() {
        return userRepo.findAll().stream()
                .map(user ->
                   modelMapper.map(user, UserDto.class)
                )
                .toList();
    }
}
