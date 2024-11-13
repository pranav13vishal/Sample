package com.example.demo.service;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    Userdto createUser(Userdto userdto);
    List<Userdto> getallUser();
    Userdto getUser(Long id);
    Userdto update(Long id,Userdto userdto);
    void delete (Long ig);
}
