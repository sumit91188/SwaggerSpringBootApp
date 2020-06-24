package com.sdeo.application;

import com.sdeo.api.UserApiDelegate;
import com.sdeo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Sumit Deo
 */
@Service
public class UserApiDelegateImpl implements UserApiDelegate {
    @Override
    public ResponseEntity<User> getUserByName(String username) {
        User user = new User();

        user.setId(123L);
        user.setFirstName("Sumit");
        user.setLastName("Deo");
        user.setUsername("sdeo");
        user.setEmail("sumit.deo@outlook.com");
        user.setPassword("password");
        user.setPhone("1234567890");
        user.setUserStatus(0);

        return ResponseEntity.ok(user);
    }
}
