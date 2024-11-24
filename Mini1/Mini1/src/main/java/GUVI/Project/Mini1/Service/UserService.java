package GUVI.Project.Mini1.Service;

import GUVI.Project.Mini1.Model.User;
import GUVI.Project.Mini1.Model.UserDto;
import GUVI.Project.Mini1.Repository.UserRepository;
import GUVI.Project.Mini1.exception.Emailpresent;
import GUVI.Project.Mini1.exception.PhoneNumberPresent;
import GUVI.Project.Mini1.exception.ResouceNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {

    private ModelMapper modelMapper;
    private UserRepository userRepository;

    // Get all users
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user ->
                        modelMapper.map(user, UserDto.class)
                )
                .toList();
    }

    // Get user by ID
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).
                orElseThrow(()-> new ResouceNotFoundException("user","id",id));
        return modelMapper.map(user, UserDto.class);
    }

    // Save user
    public UserDto saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        Optional<User> optionalUser = userRepository.findByEmail(userDto.getEmail());
        if(optionalUser.isPresent()){
            throw new Emailpresent("Email Already Present");
        }
        Optional<User> optionalUser1 = userRepository.findByPhoneNumber(userDto.getPhoneNumber());
        if(optionalUser1.isPresent()){
            throw new PhoneNumberPresent("PhoneNumber Already Present");
        }

        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    // update user
    public UserDto updateUser(UserDto userDto,Long id) {
        User user = userRepository.findById(id).
                orElseThrow(()-> new ResouceNotFoundException("user","id",id));
        Optional<User> optionalUser = userRepository.findByEmail(userDto.getEmail());
        if(optionalUser.isPresent()){
            throw new Emailpresent("Email Already Present");
        }
        Optional<User> optionalUser1 = userRepository.findByPhoneNumber(userDto.getPhoneNumber());
        if(optionalUser1.isPresent()){
            throw new PhoneNumberPresent("PhoneNumber Already Present");
        }
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setDepartment(user.getDepartment());
        user.setSalary(userDto.getSalary());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setAddress(userDto.getAddress());
        user.setHireDate(user.getHireDate());
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    // Delete user
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).
                orElseThrow(()-> new ResouceNotFoundException("user","id",id));
        userRepository.deleteById(user.getId());
    }
}
