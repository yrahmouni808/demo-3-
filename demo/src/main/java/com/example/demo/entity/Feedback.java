package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "feedbacks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String comment;

    private LocalDateTime createdAt = LocalDateTime.now();


    @ManyToOne
    @JoinColumn(name = "demo_id", nullable = false)
    private Demo demo;


    @ManyToOne
    @JoinColumn(name = "reviewer_id", nullable = false)
    private User reviewer;
}
