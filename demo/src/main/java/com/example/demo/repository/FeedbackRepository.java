package com.example.demo.repository;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByDemo(Demo demo);
}
