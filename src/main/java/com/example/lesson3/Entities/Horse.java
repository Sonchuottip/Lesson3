package com.example.lesson3.Entities;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Horse {
    private Integer Id;
    private String Name;
    private LocalDateTime Floaled;
    private Integer Archive;
}
