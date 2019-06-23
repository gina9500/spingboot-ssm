package org.java.Service.impl;

import org.java.Service.InfService;
import org.java.dao.InfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InfServiceImpl implements InfService {

    @Autowired
    private InfMapper infMapper;

    @Override
    public List<Map> findAll() {
        return infMapper.findAll();
    }
}
