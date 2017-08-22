package com.example.order.service;

import com.example.user.dto.UserDto;
import com.example.user.type.Sex;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by sajacaros on 2017-08-21.
 */
@Slf4j
@Component
public class UserFallback implements UserEndPoint{
    @Override
    public ResponseEntity<UserDto.Response> userProfile( Long userId ) {
        log.info("user fallback, userId : {}", userId);
        return ResponseEntity.ok(new UserDto.Response( -1L, "", "", Sex.MALE ));
    }
}
