package com.kodilla.ecommercee;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "LOGIN")
    private String login;

    @NotNull
    @Column("PASSWORD")
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "USER_STATUS")
    private UserStatus userStatus = UserStatus.ACTIVE;

    @NotNull
    @Column(name = "CREATE_ACCOUNT_DATE")
    private final Date createAccountDate = new Date();

    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<Order> orders;
}
