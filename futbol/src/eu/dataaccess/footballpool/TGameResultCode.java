/**
 * TGameResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGameResultCode  implements java.io.Serializable {
    private java.lang.String sCode;

    private java.lang.String sDescription;

    public TGameResultCode() {
    }

    public TGameResultCode(
           java.lang.String sCode,
           java.lang.String sDescription) {
           this.sCode = sCode;
           this.sDescription = sDescription;
    }


    /**
     * Gets the sCode value for this TGameResultCode.
     * 
     * @return sCode
     */
    public java.lang.String getSCode() {
        return sCode;
    }


    /**
     * Sets the sCode value for this TGameResultCode.
     * 
     * @param sCode
     */
    public void setSCode(java.lang.String sCode) {
        this.sCode = sCode;
    }


    /**
     * Gets the sDescription value for this TGameResultCode.
     * 
     * @return sDescription
     */
    public java.lang.String getSDescription() {
        return sDescription;
    }


    /**
     * Sets the sDescription value for this TGameResultCode.
     * 
     * @param sDescription
     */
    public void setSDescription(java.lang.String sDescription) {
        this.sDescription = sDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGameResultCode)) return false;
        TGameResultCode other = (TGameResultCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sCode==null && other.getSCode()==null) || 
             (this.sCode!=null &&
              this.sCode.equals(other.getSCode()))) &&
            ((this.sDescription==null && other.getSDescription()==null) || 
             (this.sDescription!=null &&
              this.sDescription.equals(other.getSDescription())));
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
        if (getSCode() != null) {
            _hashCode += getSCode().hashCode();
        }
        if (getSDescription() != null) {
            _hashCode += getSDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGameResultCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGameResultCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sDescription"));
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
