package com.hcb.test.hometest.etity;

import lombok.Getter;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
@Subselect("SELECT * FROM v_user_view")
@Getter
public class UserView {

    @Id
    private Long id;
    private String name;
    private String roles;

}
