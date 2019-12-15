package com.invillia.acme.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data

public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private Order order;

    
}
