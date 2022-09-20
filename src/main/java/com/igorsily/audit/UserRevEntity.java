package com.igorsily.audit;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RevisionEntity(UserRevListener.class)
public class UserRevEntity extends DefaultRevisionEntity {

    @Getter
    @Setter
    private String username;

}
