package com.kodilla.ecommercee.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static com.kodilla.ecommercee.domain.UserStatus.ACTIVE;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Entity
@Table(name = "USERS")
public final class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "LOGIN")
    private String login;

    @NotNull
    @Column(name = "PASSWORD")
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "USER_STATUS")
    private final UserStatus userStatus = ACTIVE;

    @NotNull
    @Column(name = "CREATE_ACCOUNT_DATE")
    private final Date createAccountDate = new Date();

//    @OneToMany(
//            targetEntity = Order.class,
//            mappedBy = "user",
//            fetch = FetchType.LAZY
//    )
//    private List<Order> orders;
}
