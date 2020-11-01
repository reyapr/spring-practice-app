package com.reyapr.mypracticeapp.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "user")
public class User {

  @Field
  private String name;

  @Field
  private String email;

  @Field
  private String password;
}
