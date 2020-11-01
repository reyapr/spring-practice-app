package com.reyapr.mypracticeapp.service.impl;

import com.reyapr.mypracticeapp.dao.UserRepository;
import com.reyapr.mypracticeapp.entity.User;
import com.reyapr.mypracticeapp.entity.dto.request.UserRequest;
import com.reyapr.mypraticeapp.library.Mapper;
import com.reytapr.mypracticeapp.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Mono<User> createUser(UserRequest userRequest) {
    return userRepository.save(Mapper.map(userRequest, User.class));
  }
}
