package com.example.demo.service;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.mapper.Usermapper;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public Userdto createUser(Userdto userdto) {
//        User user = Usermapper.mapToUser(userdto);
        User user=modelMapper.map(userdto,User.class);
        User saved = userRepository.save(user);
//        Userdto returedto = Usermapper.mapToUserdto(saved);
        Userdto returedto = modelMapper.map(saved,Userdto.class);
        return returedto;
}

    @Override
    public List<Userdto> getallUser() {
        List<User> users = userRepository.findAll();
//        List<Userdto> userdto = new ArrayList<>();
//        for (int i = 0; i < user.size(); i++) {
//            Userdto returedto = Usermapper.mapToUserdto(user.get(i));
//            userdto.add(returedto);
//        }
        List<Userdto> userdtos = users.stream().map(us -> Usermapper.mapToUserdto(us))
                                    .toList();
        return userdtos;
    }

    @Override
    public Userdto getUser(Long id) {
        User user= userRepository.findById(id).get();
        Userdto returedto = Usermapper.mapToUserdto(user);
        return returedto;
    }

    @Override
    public Userdto update(Long id,Userdto userdto) {
        User user = Usermapper.mapToUser(userdto);
        User existing = userRepository.findById(id).get();
        existing.setFirstname(user.getFirstname());
        existing.setLastname(user.getLastname());
        existing.setEmail(user.getEmail());
        User saved = userRepository.save(existing);
        Userdto returedto = Usermapper.mapToUserdto(saved);
        return returedto;

    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }
}
