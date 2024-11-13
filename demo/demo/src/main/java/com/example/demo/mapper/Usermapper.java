package com.example.demo.mapper;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;

public class Usermapper {
    public static Userdto mapToUserdto(User user){
        Userdto returedto = new Userdto();
        returedto.setEmail(user.getEmail());
        returedto.setFirstname(user.getFirstname());
        returedto.setLastname(user.getLastname());
        returedto.setId(user.getId());
        return returedto;
    }
    public static User mapToUser(Userdto userdto){
        User user = new User();
        user.setEmail(userdto.getEmail());
        user.setFirstname(userdto.getFirstname());
        user.setLastname(userdto.getLastname());
    return user;
    }
}
