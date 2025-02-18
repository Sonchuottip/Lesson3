package com.example.lesson3.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "horse")

public class Horse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date foaled;

    //@JsonManagedReference
    @OneToMany(mappedBy = "horse")
    private List<HorseAccount> horseAccounts;

    public Horse(Integer id, String name, Date foaled) {
        this.id = id;
        this.name = name;
        this.foaled = foaled;
    }
}
