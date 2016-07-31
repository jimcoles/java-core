/*
 * Copyright (c) Jim Coles (jameskcoles@gmail.com) 2016. through present.
 *
 * Licensed under the following license agreement:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Also see the LICENSE file in the repository root directory.
 */

package org.jkcsoft.java.repos;

/**
 * This class generated by a code generation process.
 * <p>
 * RDB Table: BC_ACCESS_GRANT
 */
public class AccessGrant {
    // useful constants
    public static final String PROP_oid = "oid";
    public static final String PROP_creationDate = "creationDate";
    public static final String PROP_lastUpdatedDate = "lastUpdatedDate";
    public static final String PROP_userOid = "userOid";
    public static final String PROP_procedureOid = "procedureOid";
    public static final String PROP_contextEntityTypeOid = "contextEntityTypeOid";
    public static final String PROP_contextEntityOid = "contextEntityOid";

    // properties
    private Long oid; // OID
    private java.util.Date creationDate; // CREATION_DATE
    private java.util.Date lastUpdatedDate; // LAST_UPDATED_DATE
    private Long userOid; // USER_OID
    private Long procedureOid; // PROCEDURE_OID
    private Long contextEntityTypeOid; // CONTEXT_ENTITY_TYPE_OID
    private Long contextEntityOid; // CONTEXT_ENTITY_OID

    // getters and setters
    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public void setOid(long oid) {
        this.oid = new Long(oid);
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Long getUserOid() {
        return userOid;
    }

    public void setUserOid(Long userOid) {
        this.userOid = userOid;
    }

    public void setUserOid(long userOid) {
        this.userOid = new Long(userOid);
    }

    public Long getProcedureOid() {
        return procedureOid;
    }

    public void setProcedureOid(Long procedureOid) {
        this.procedureOid = procedureOid;
    }

    public void setProcedureOid(long procedureOid) {
        this.procedureOid = new Long(procedureOid);
    }

    public Long getContextEntityTypeOid() {
        return contextEntityTypeOid;
    }

    public void setContextEntityTypeOid(Long contextEntityTypeOid) {
        this.contextEntityTypeOid = contextEntityTypeOid;
    }

    public void setContextEntityTypeOid(long contextEntityTypeOid) {
        this.contextEntityTypeOid = new Long(contextEntityTypeOid);
    }

    public Long getContextEntityOid() {
        return contextEntityOid;
    }

    public void setContextEntityOid(Long contextEntityOid) {
        this.contextEntityOid = contextEntityOid;
    }

    public void setContextEntityOid(long contextEntityOid) {
        this.contextEntityOid = new Long(contextEntityOid);
    }

    // override Object.toString()
    public String toString() {
        String s = "AccessGrant => "
                + " [oid] " + oid
                + " [creationDate] " + creationDate
                + " [lastUpdatedDate] " + lastUpdatedDate
                + " [userOid] " + userOid
                + " [procedureOid] " + procedureOid
                + " [contextEntityTypeOid] " + contextEntityTypeOid
                + " [contextEntityOid] " + contextEntityOid
                + " | Super => " + super.toString();

        return s;
    }
}

  
   

