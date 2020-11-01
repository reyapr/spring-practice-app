package com.reytapr.mypracticeapp.service.api;

import com.reyapr.mypracticeapp.entity.User;
import com.reyapr.mypracticeapp.entity.dto.request.UserRequest;
import reactor.core.publisher.Mono;

public interface UserService {

  Mono<User> createUser(UserRequest userRequest);
}
