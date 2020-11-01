package com.reyapr.mypraticeapp.library;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Mapper {
  private Mapper(){

  }

  private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
  private static MapperFacade mapper;

  public static <S,T> T map(S source, Class<T> targetClass) {
    return mapper.map(source, targetClass);
  }

  static {
    mapper = mapperFactory.getMapperFacade();
  }
}
