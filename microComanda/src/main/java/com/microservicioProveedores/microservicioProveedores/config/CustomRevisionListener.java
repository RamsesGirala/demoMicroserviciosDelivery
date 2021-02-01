package com.microservicioProveedores.microservicioProveedores.config;

import org.hibernate.envers.RevisionListener;

import com.microservicioProveedores.microservicioProveedores.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
