package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "demos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private int bpm;

    @Column(length = 500)
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String filePath;

    public enum Status {
        PENDING,
        IN_TREATMENT,
        ACCEPTED,
        REJECTED
    }

    // Many demos belong to one producer
    @ManyToOne
    @JoinColumn(name = "producer_id", nullable = false)
    private User producer;

    // One demo can have multiple feedbacks
    @OneToMany(mappedBy = "demo", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;
}

