package com.example.demo.repository;

import com.example.demo.entity.Demo;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Long> {
    List<Demo> findByProducer(User producer);
    List<Demo> findByStatus(Demo.Status status);
}
