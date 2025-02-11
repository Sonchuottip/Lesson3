package com.example.lesson3.Entities;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Trainer {
    private Integer Id;
    private String Name;
    private Account account;
}
