package pruebaTecnica.demo.models;

import java.sql.Date;

public class EmployeesModel {
    
    private Number Employee_id;
    private Number Gender_id;
    private Number Job_id;
    private String Name;
    private String LastName;
    private Date Birthdate;

    public void setPrioridad(String Name){
        this.Name = Name;
    }


    public Number getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(Number Employee_id) {
        this.Employee_id = Employee_id;
    }

    public Number getGender_id() {
        return Gender_id;
    }

    public void setGender_id(Number Gender_id) {
        this.Gender_id = Gender_id;
    }

    public Number getJob_id() {
        return Job_id;
    }

    public void seJob_id(Number Job_id) {
        this.Job_id = Job_id;
    }

    public String getName() {
        return Name;
    }

    public void setNombre(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmail(String LastName) {
        this.LastName = LastName;
    }

}
