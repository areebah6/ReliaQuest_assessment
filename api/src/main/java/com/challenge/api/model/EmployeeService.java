package com.challenge.api.service;

import com.challenge.api.model.ImplementEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

// implement business logic
@Service
public class EmployeeService {
    private List<ImplementEmployee> employees = new ArrayList<>(); // create list object of type Implement Employee

    public List<ImplementEmployee> getAllEmployees() {
        return employees;
    }

    public ImplementEmployee getEmployeeByUuid(UUID uuid) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUuid().equals(uuid)) {
                return employees.get(i); // get employee using uuid parsing through list
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee was not found");
    }

    public void createEmployee(ImplementEmployee employee) {
        employees.add(employee); // simply adds to list
    }
}
