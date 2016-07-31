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
 * RDB Table: BC_NUMBER_ATTR_VALUE
 */
public class NumberAttrValue {
    // useful constants
    public static final String PROP_oid = "oid";
    public static final String PROP_value = "value";
    public static final String PROP_attributeOid = "attributeOid";
    public static final String PROP_parentOid = "parentOid";

    // properties
    private Long oid; // OID
    private Long value; // VALUE
    private Long attributeOid; // ATTRIBUTE_OID
    private Long parentOid; // PARENT_OID

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

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public void setValue(long value) {
        this.value = new Long(value);
    }

    public Long getAttributeOid() {
        return attributeOid;
    }

    public void setAttributeOid(Long attributeOid) {
        this.attributeOid = attributeOid;
    }

    public void setAttributeOid(long attributeOid) {
        this.attributeOid = new Long(attributeOid);
    }

    public Long getParentOid() {
        return parentOid;
    }

    public void setParentOid(Long parentOid) {
        this.parentOid = parentOid;
    }

    public void setParentOid(long parentOid) {
        this.parentOid = new Long(parentOid);
    }

    // override Object.toString()
    public String toString() {
        String s = "NumberAttrValue => "
                + " [oid] " + oid
                + " [value] " + value
                + " [attributeOid] " + attributeOid
                + " [parentOid] " + parentOid
                + " | Super => " + super.toString();

        return s;
    }
}

  
   

