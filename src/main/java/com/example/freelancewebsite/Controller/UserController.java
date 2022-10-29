package com.example.freelancewebsite.Controller;

import com.example.freelancewebsite.Model.UserDto;
import com.example.freelancewebsite.Model.UserRequestModel;
import com.example.freelancewebsite.Model.UserRest;
import com.example.freelancewebsite.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public UserRest adduser(@RequestBody UserRequestModel request) throws Exception {
        UserRest returnvalue = new UserRest();
        UserDto userd = new UserDto();
        BeanUtils.copyProperties(request,userd);

        userd.setEmailVerificationStatus(true);
        userd.setUserId("1224");
        UserDto userdnew = new UserDto();
        userdnew= userService.adduser(userd);
        BeanUtils.copyProperties(userdnew,returnvalue);
       //BeanUtils.copyProperties(userd,returnvalue);




        return returnvalue;




    }

}
