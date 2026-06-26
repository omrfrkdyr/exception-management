package com.omerduyar.service.impl;

import com.omerduyar.dto.DtoDepartment;
import com.omerduyar.dto.DtoEmployee;
import com.omerduyar.exception.BaseException;
import com.omerduyar.exception.ErrorMessage;
import com.omerduyar.exception.MessageType;
import com.omerduyar.model.Department;
import com.omerduyar.model.Employee;
import com.omerduyar.repository.EmployeeRepository;
import com.omerduyar.service.IEmployeeService;
import org.apache.catalina.mbeans.MBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {

        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);

        if(optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee = optional.get();
        Department department = employee.getDepartment();
        BeanUtils.copyProperties(employee,dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}
