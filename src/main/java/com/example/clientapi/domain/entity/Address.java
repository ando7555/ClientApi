package com.example.clientapi.domain.entity;

import com.example.clientapi.config.PostgreSQLEnumType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table (name = "address", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(
        name = "address_type",
        typeClass = PostgreSQLEnumType.class
)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Column(name = "address_type_column")
    @Enumerated(EnumType.STRING)
    @Type(type = "address_type")
    @Setter
    @Getter
    private AddressType addressTypeColumn;

    @Setter
    @Getter
    private String city;

    @Setter
    @Getter
    private String country;

    @Setter
    @Getter
    @Column(name = "address_line")
    private String addressLine;

    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Customer customer;

    public Address(AddressType addressTypeColumn, String city, String country, String addressLine, Customer customer) {
        this.addressTypeColumn = addressTypeColumn;
        this.city = city;
        this.country = country;
        this.addressLine = addressLine;
        this.customer = customer;
    }
}
