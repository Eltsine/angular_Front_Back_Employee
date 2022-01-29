package com.example.app.produit2.repository;

import com.example.app.produit2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
