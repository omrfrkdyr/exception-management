package com.omerduyar.controller.impl;

import com.omerduyar.controller.RestEmployeeController;
import com.omerduyar.dto.DtoEmployee;
import com.omerduyar.model.RootEntity;
import com.omerduyar.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {

        return ok(employeeService.findEmployeeById(id));
    }
}
