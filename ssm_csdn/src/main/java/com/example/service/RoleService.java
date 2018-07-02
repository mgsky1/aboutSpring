package com.example.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Martin Huang on 2018/7/1.
 */
public interface RoleService {

    public List<Map<String,Object>> getAllRoles() throws Exception;
}
