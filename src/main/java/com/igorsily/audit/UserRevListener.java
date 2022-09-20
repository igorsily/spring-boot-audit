package com.igorsily.audit;

import org.hibernate.envers.RevisionListener;

public class UserRevListener implements RevisionListener {

    public final static  String USERNAME = "igorsily";
    @Override
    public void newRevision(Object o) {
        UserRevEntity userRevEntity = (UserRevEntity) o;

        userRevEntity.setUsername(USERNAME);
    }
}
