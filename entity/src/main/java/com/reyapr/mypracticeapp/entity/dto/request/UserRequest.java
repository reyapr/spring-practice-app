package com.reyapr.mypracticeapp.entity.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {

  private String name;

  private String email;

  private String password;
}
