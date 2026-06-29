package com.omerduyar;

import com.omerduyar.dto.DtoEmployee;
import com.omerduyar.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementApplication.class})
class ExceptionManagementApplicationTests {

    @Autowired
    private IEmployeeService employeeService;

    


    @Test
    public void testFindEmployeeById(){
        DtoEmployee employee = employeeService.findEmployeeById(4L);

        assertNotNull(5);

    }

}
