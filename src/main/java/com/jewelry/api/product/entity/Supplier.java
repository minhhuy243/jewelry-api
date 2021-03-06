package com.jewelry.api.product.entity;

import com.jewelry.api.commondata.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "jewelry_supplier")
public class Supplier extends AbstractEntity {

    @Column(unique = true)
    private String code;

    @NotBlank(message = "{supplier.name.not-blank}")
    private String name;

    @Column(nullable = false)
    @Pattern(regexp = "(^$|[0-9]{10})", message = "{supplier.phone-number.pattern}")
    private String phoneNumber;

    @Column(nullable = false)
    @Email(message = "{supplier.email.format}")
    private String email;

    @Column(nullable = false)
    private String address;

    private String logo;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<>();
}
