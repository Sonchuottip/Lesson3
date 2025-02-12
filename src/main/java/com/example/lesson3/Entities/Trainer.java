package com.example.lesson3.Entities;
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
    private Integer Id;

    @Column(length = 255, nullable = false)
    private String Name;

    @Column(name="account_id", nullable = false)
    private int AccountId;
}
