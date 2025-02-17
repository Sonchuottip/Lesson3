package com.example.lesson3.entities;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name= "trainer")

public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id",nullable = false)
    private Account account;
}
