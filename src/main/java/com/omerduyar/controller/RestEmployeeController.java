package com.omerduyar.controller;

import com.omerduyar.dto.DtoEmployee;
import com.omerduyar.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
