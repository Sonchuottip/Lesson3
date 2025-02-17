package com.example.lesson3.Entities;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class HorseAccount {
    private Integer Id;
    private Horse horse;
    private Account account;
}
