package com.example.lesson3.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import javax.lang.model.element.Name;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="horse_account")
@Entity

public class HorseAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "horse_id", referencedColumnName = "id", nullable = false)
    private Horse horse;

    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private Account account;

    @Column(name = "archive", nullable = false, columnDefinition = "TINYINT DEFAULT 0")
    private Integer archive;

}
