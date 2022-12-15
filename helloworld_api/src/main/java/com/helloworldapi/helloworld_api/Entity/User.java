package com.helloworldapi.helloworld_api.Entity;

import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "bobmarly")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NonNull
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @NonNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

}