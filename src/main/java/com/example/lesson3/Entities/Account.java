package com.example.lesson3.Entities;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Account {
    private Integer Id;
    private String Username;
    private String Password;
    private Integer Status;
}
