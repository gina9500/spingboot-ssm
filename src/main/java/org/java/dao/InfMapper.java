package org.java.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InfMapper {

    public List<Map> findAll();
}
