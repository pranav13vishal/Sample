package com.Pranav.RedBus.Service;

import com.Pranav.RedBus.Dto.UserDto;
import com.Pranav.RedBus.Entity.User;
import com.Pranav.RedBus.Repository.UserRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;
    private ModelMapper modelMapper;
//    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        if ("Admin".equals(user.getRole())){
            user.setRole("ROLE_ADMIN");
        }
        else {
            user.setRole("ROLE_USER");
        }
//        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
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
        return modelMapper.map(userRepo.findById(id), UserDto.class);
    }

    @Override
    public List<UserDto> viewAllUsers() {
        return userRepo.findAll().stream()
                .map(user ->
                   modelMapper.map(user, UserDto.class)
                )
                .toList();
    }

    @Override
    public UserDto findUserByEmail(String email) {
//        User user = userRepo.findByEmail(email).get();
//        if (user == null) {
//            return new UserDto();
//        }
        return modelMapper.map(userRepo.findByEmail(email), UserDto.class);
    }
}
