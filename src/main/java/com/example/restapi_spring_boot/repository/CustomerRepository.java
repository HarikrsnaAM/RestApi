package com.example.restapi_spring_boot.repository;

import com.example.restapi_spring_boot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> //jpa args are entity name and primary key type(wrapper class)
 {

}
