/**
 * TPlayerNames.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TPlayerNames  implements java.io.Serializable {
    private int iId;

    private java.lang.String sName;

    private java.lang.String sCountryName;

    private java.lang.String sCountryFlag;

    private java.lang.String sCountryFlagLarge;

    public TPlayerNames() {
    }

    public TPlayerNames(
           int iId,
           java.lang.String sName,
           java.lang.String sCountryName,
           java.lang.String sCountryFlag,
           java.lang.String sCountryFlagLarge) {
           this.iId = iId;
           this.sName = sName;
           this.sCountryName = sCountryName;
           this.sCountryFlag = sCountryFlag;
           this.sCountryFlagLarge = sCountryFlagLarge;
    }


    /**
     * Gets the iId value for this TPlayerNames.
     * 
     * @return iId
     */
    public int getIId() {
        return iId;
    }


    /**
     * Sets the iId value for this TPlayerNames.
     * 
     * @param iId
     */
    public void setIId(int iId) {
        this.iId = iId;
    }


    /**
     * Gets the sName value for this TPlayerNames.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TPlayerNames.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sCountryName value for this TPlayerNames.
     * 
     * @return sCountryName
     */
    public java.lang.String getSCountryName() {
        return sCountryName;
    }


    /**
     * Sets the sCountryName value for this TPlayerNames.
     * 
     * @param sCountryName
     */
    public void setSCountryName(java.lang.String sCountryName) {
        this.sCountryName = sCountryName;
    }


    /**
     * Gets the sCountryFlag value for this TPlayerNames.
     * 
     * @return sCountryFlag
     */
    public java.lang.String getSCountryFlag() {
        return sCountryFlag;
    }


    /**
     * Sets the sCountryFlag value for this TPlayerNames.
     * 
     * @param sCountryFlag
     */
    public void setSCountryFlag(java.lang.String sCountryFlag) {
        this.sCountryFlag = sCountryFlag;
    }


    /**
     * Gets the sCountryFlagLarge value for this TPlayerNames.
     * 
     * @return sCountryFlagLarge
     */
    public java.lang.String getSCountryFlagLarge() {
        return sCountryFlagLarge;
    }


    /**
     * Sets the sCountryFlagLarge value for this TPlayerNames.
     * 
     * @param sCountryFlagLarge
     */
    public void setSCountryFlagLarge(java.lang.String sCountryFlagLarge) {
        this.sCountryFlagLarge = sCountryFlagLarge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPlayerNames)) return false;
        TPlayerNames other = (TPlayerNames) obj;
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
            ((this.sCountryName==null && other.getSCountryName()==null) || 
             (this.sCountryName!=null &&
              this.sCountryName.equals(other.getSCountryName()))) &&
            ((this.sCountryFlag==null && other.getSCountryFlag()==null) || 
             (this.sCountryFlag!=null &&
              this.sCountryFlag.equals(other.getSCountryFlag()))) &&
            ((this.sCountryFlagLarge==null && other.getSCountryFlagLarge()==null) || 
             (this.sCountryFlagLarge!=null &&
              this.sCountryFlagLarge.equals(other.getSCountryFlagLarge())));
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
        if (getSCountryName() != null) {
            _hashCode += getSCountryName().hashCode();
        }
        if (getSCountryFlag() != null) {
            _hashCode += getSCountryFlag().hashCode();
        }
        if (getSCountryFlagLarge() != null) {
            _hashCode += getSCountryFlagLarge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPlayerNames.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tPlayerNames"));
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
        elemField.setFieldName("SCountryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCountryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCountryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCountryFlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCountryFlagLarge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
