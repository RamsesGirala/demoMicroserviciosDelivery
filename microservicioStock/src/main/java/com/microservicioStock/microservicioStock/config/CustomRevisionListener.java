package com.microservicioStock.microservicioStock.config;

import org.hibernate.envers.RevisionListener;

import com.microservicioStock.microservicioStock.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
