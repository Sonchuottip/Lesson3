package com.example.lesson3.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="account")

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,unique = true, nullable = false )
    private String username;

    @Column(length = 50,nullable = false)
    private String password;

    @Column(nullable = false )
    private Integer status;

    //@JsonManagedReference
    @OneToMany(mappedBy = "account")
    private List<HorseAccount> horseAccounts;

    public Account(String username, String password, Integer status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }
}
