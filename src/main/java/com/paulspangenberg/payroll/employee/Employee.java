package com.paulspangenberg.payroll.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import java.util.Objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String role;
  private double salary;

  private Date entryDate;
  private Date leaveDate;

  public Employee(String name, String role, double salary, Date entryDate) {
    this.name = name;
    this.role = role;
    this.salary = salary;
    this.entryDate = entryDate;
  }

  public Employee(String name, String role, double salary, Date entryDate, Date leaveDate) {
    this.name = name;
    this.role = role;
    this.salary = salary;
    this.entryDate = entryDate;
    this.leaveDate = leaveDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Employee employee))
      return false;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
        && Objects.equals(this.role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role, this.salary);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + ", salary='" + this.salary + "€\'" + '}';
  }


}
