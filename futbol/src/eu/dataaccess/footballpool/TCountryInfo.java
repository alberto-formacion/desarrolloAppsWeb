/**
 * TCountryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TCountryInfo  implements java.io.Serializable {
    private int iId;

    private java.lang.String sName;

    private java.lang.String sIsoCode;

    private int iPersons;

    public TCountryInfo() {
    }

    public TCountryInfo(
           int iId,
           java.lang.String sName,
           java.lang.String sIsoCode,
           int iPersons) {
           this.iId = iId;
           this.sName = sName;
           this.sIsoCode = sIsoCode;
           this.iPersons = iPersons;
    }


    /**
     * Gets the iId value for this TCountryInfo.
     * 
     * @return iId
     */
    public int getIId() {
        return iId;
    }


    /**
     * Sets the iId value for this TCountryInfo.
     * 
     * @param iId
     */
    public void setIId(int iId) {
        this.iId = iId;
    }


    /**
     * Gets the sName value for this TCountryInfo.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TCountryInfo.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sIsoCode value for this TCountryInfo.
     * 
     * @return sIsoCode
     */
    public java.lang.String getSIsoCode() {
        return sIsoCode;
    }


    /**
     * Sets the sIsoCode value for this TCountryInfo.
     * 
     * @param sIsoCode
     */
    public void setSIsoCode(java.lang.String sIsoCode) {
        this.sIsoCode = sIsoCode;
    }


    /**
     * Gets the iPersons value for this TCountryInfo.
     * 
     * @return iPersons
     */
    public int getIPersons() {
        return iPersons;
    }


    /**
     * Sets the iPersons value for this TCountryInfo.
     * 
     * @param iPersons
     */
    public void setIPersons(int iPersons) {
        this.iPersons = iPersons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCountryInfo)) return false;
        TCountryInfo other = (TCountryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iId == other.getIId() &&
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            ((this.sIsoCode==null && other.getSIsoCode()==null) || 
             (this.sIsoCode!=null &&
              this.sIsoCode.equals(other.getSIsoCode()))) &&
            this.iPersons == other.getIPersons();
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
        _hashCode += getIId();
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        if (getSIsoCode() != null) {
            _hashCode += getSIsoCode().hashCode();
        }
        _hashCode += getIPersons();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCountryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCountryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPersons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iPersons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
