package com.paulspangenberg.payroll.config;

import com.paulspangenberg.payroll.employee.Employee;
import com.paulspangenberg.payroll.employee.EmployeeRepository;
import java.sql.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      //log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar", 5432.56d, new Date(125, 0, 1))));
      //log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief", 4676.34d, new Date(125, 0, 15))));
    };
  }
}
