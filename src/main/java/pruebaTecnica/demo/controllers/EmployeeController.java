package pruebaTecnica.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaTecnica.demo.services.EmployeeService;
import pruebaTecnica.demo.models.EmployeesModel;
import java.util.ArrayList;
import java.util.Optional;;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    public ArrayList<EmployeesModel> obtenerEmployees(){
        return employeeService.obtenerEmployees();
    }

    @PostMapping()
    public EmployeesModel saveEmployee(@RequestBody EmployeesModel usuario){
        return this.EmployeeService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<EmployeesModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.EmployeeService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<EmployeesModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.EmployeeService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Number Employee_id){
        boolean ok = this.EmployeeService.eliminarUsuario(Employee_id);
        if (ok){
            return "Se eliminó el id " + id;
        }else{
            return "No pudo eliminar el id" + id;
        }
    }
}
