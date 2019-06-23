package org.java.Service;

import org.java.dao.InfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface InfService {

    public List<Map> findAll();
}
