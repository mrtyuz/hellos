package com.springapp.model.util;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: me99922
 * Date: 21.03.2013
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */

@MappedSuperclass
public abstract class BaseClass implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "rds_entity_seq_gen")
    @SequenceGenerator(name = "rds_entity_seq_gen", sequenceName = "RDS_ENTITY_SEQ", allocationSize = Integer.MAX_VALUE)
    protected Long id;
    @Column(name = "CREATIONDATE")
    protected Date createdDate;
    @Column(name = "CREATEDBY")
    protected String createdBy;
    @Column(name = "UPDATEDATE")
    protected Date updatedDate;
    @Column(name = "UPDATEDBY")
    protected String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public abstract boolean basicEquals(Object... object);

    @PrePersist
    protected void onPrePersist() {
        // check if the creationDate was not manually set
        if (createdDate == null) {
            createdDate = new Date();
        }

        String username = "toyota"; //ServiceUtils.getUsername();
        if (username != null && !username.equals("")) {
            this.createdBy = username;
        } else {
            this.createdBy = "NULLUSER";
        }
    }

    @PreUpdate
    protected void onPreUpdate() {
        updatedDate = new Date();
        String username = "toyota"; //ServiceUtils.getUsername();
        if (username != null && !username.equals("")) {
            this.updatedBy = username;
        } else {
            this.updatedBy = "NULLUSER";
        }
    }

//    public boolean basicEquals(Object... obj) {
//        if (obj == null || obj.length != 1 || obj[0] == null) {
//            return false;
//        }
//        return new EqualsBuilder().append(this.id, obj[0]).isEquals();
//    }

}
