package com.gizlocorp.blueprintspringboot.Repository;

import com.gizlocorp.blueprintspringboot.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> { }
