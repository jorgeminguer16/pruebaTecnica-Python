package pruebaTecnica.demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends CrudRepository<EmployeesModel, Number> {
    
}
