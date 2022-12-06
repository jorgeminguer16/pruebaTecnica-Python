package pruebaTecnica.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaTecnica.demo.models.EmployeesModel;
import pruebaTecnica.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empleadoRepository;

    public ArrayList<EmployeesModel> obtenerEmployees(){
        return (ArrayList<EmployeesModel>) empleadoRepository.findAll();
    }
    
    public EmployeesModel saveEmployees(EmployeesModel employee){
        return EmployeeRepository.save(employee);
    }
}
