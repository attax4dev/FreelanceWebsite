package com.example.freelancewebsite.Service;

import com.example.freelancewebsite.Model.Entity.UserEntity;
import com.example.freelancewebsite.Model.Repository.UserRepository;
import com.example.freelancewebsite.Model.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Userserviceimpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto adduser(UserDto x) throws Exception {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(x,user);

        if (userRepository.findUserEntityByEmail(x.getEmail()) != null) {
            throw new Exception("user exists");

        }
        else {
            UserDto returnvalue = new UserDto();
            UserEntity cloned = userRepository.save(user);
            BeanUtils.copyProperties(cloned,returnvalue);
            return  returnvalue;

        }


    }
}
