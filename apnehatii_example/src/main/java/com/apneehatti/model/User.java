package com.apneehatti.model;

import com.apneehatti.constant.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@Table(name = "USER", schema = "LF")
public class User extends PersistedObject {

    private String name;
    private String email;
    private String mobile;
    private String userName;
    private String password;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Role role;
    private long pinCode;
    private Status status;
}
