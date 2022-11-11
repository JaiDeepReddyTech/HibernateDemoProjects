package com.first.demo.entity;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
@Entity
@Table(name="employee_details")
public class Employee {
    @Id
    @GenericGenerator(name="emp_info" ,strategy = "increment")
    @GeneratedValue(generator = "emp_info")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="department")
    private String department;
    @Column(name="salary")
    private  Double salary;

    public Employee() {
    }

    public Employee(String name, String department, Double salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
