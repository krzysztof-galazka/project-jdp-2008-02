package com.kodilla.ecommercee.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

import static com.kodilla.ecommercee.domain.UserStatus.ACTIVE;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Entity
public final class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String login;

    @NotNull
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private final UserStatus userStatus = ACTIVE;

    @NotNull
    private final Date createAccountDate = new Date();

    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<Order> orders;
}
