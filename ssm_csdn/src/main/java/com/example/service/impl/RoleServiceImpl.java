package com.example.service.impl;

import com.example.dao.RoleMapper;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Martin Huang on 2018/7/1.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Map<String, Object>> getAllRoles() throws Exception {
        return roleMapper.getAllRoles();
    }
}
