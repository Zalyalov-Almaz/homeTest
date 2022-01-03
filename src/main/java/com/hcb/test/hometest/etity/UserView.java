package com.hcb.test.hometest.etity;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_user_view")
@Immutable
@Getter
public class UserView {

    @Id
    private Long id;
    private String name;
    private String roles;

}
