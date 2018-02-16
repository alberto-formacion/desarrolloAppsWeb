/**
 * TCoaches.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TCoaches  implements java.io.Serializable {
    private java.lang.String sName;

    private eu.dataaccess.footballpool.TTeamInfo teamInfo;

    public TCoaches() {
    }

    public TCoaches(
           java.lang.String sName,
           eu.dataaccess.footballpool.TTeamInfo teamInfo) {
           this.sName = sName;
           this.teamInfo = teamInfo;
    }


    /**
     * Gets the sName value for this TCoaches.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TCoaches.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the teamInfo value for this TCoaches.
     * 
     * @return teamInfo
     */
    public eu.dataaccess.footballpool.TTeamInfo getTeamInfo() {
        return teamInfo;
    }


    /**
     * Sets the teamInfo value for this TCoaches.
     * 
     * @param teamInfo
     */
    public void setTeamInfo(eu.dataaccess.footballpool.TTeamInfo teamInfo) {
        this.teamInfo = teamInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCoaches)) return false;
        TCoaches other = (TCoaches) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            ((this.teamInfo==null && other.getTeamInfo()==null) || 
             (this.teamInfo!=null &&
              this.teamInfo.equals(other.getTeamInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        if (getTeamInfo() != null) {
            _hashCode += getTeamInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCoaches.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCoaches"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "TeamInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
