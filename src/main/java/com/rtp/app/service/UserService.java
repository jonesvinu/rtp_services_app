package com.rtp.app.service;

import com.rtp.app.dao.UsersRepo;
import com.rtp.app.domain.Users;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by avila on 6/19/2019.
 */
@Component
public class UserService {

    @Autowired
    private UsersRepo usersRepo;

    public Users register(Users users){
        return usersRepo.save(users);
    }


}
