package com.omerduyar.service;

import com.omerduyar.dto.DtoEmployee;
import com.omerduyar.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
