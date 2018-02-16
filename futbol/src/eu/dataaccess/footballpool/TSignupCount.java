/**
 * TSignupCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TSignupCount  implements java.io.Serializable {
    private java.util.Date dSignup;

    private int iCount;

    private int iTotal;

    private int iAverage;

    public TSignupCount() {
    }

    public TSignupCount(
           java.util.Date dSignup,
           int iCount,
           int iTotal,
           int iAverage) {
           this.dSignup = dSignup;
           this.iCount = iCount;
           this.iTotal = iTotal;
           this.iAverage = iAverage;
    }


    /**
     * Gets the dSignup value for this TSignupCount.
     * 
     * @return dSignup
     */
    public java.util.Date getDSignup() {
        return dSignup;
    }


    /**
     * Sets the dSignup value for this TSignupCount.
     * 
     * @param dSignup
     */
    public void setDSignup(java.util.Date dSignup) {
        this.dSignup = dSignup;
    }


    /**
     * Gets the iCount value for this TSignupCount.
     * 
     * @return iCount
     */
    public int getICount() {
        return iCount;
    }


    /**
     * Sets the iCount value for this TSignupCount.
     * 
     * @param iCount
     */
    public void setICount(int iCount) {
        this.iCount = iCount;
    }


    /**
     * Gets the iTotal value for this TSignupCount.
     * 
     * @return iTotal
     */
    public int getITotal() {
        return iTotal;
    }


    /**
     * Sets the iTotal value for this TSignupCount.
     * 
     * @param iTotal
     */
    public void setITotal(int iTotal) {
        this.iTotal = iTotal;
    }


    /**
     * Gets the iAverage value for this TSignupCount.
     * 
     * @return iAverage
     */
    public int getIAverage() {
        return iAverage;
    }


    /**
     * Sets the iAverage value for this TSignupCount.
     * 
     * @param iAverage
     */
    public void setIAverage(int iAverage) {
        this.iAverage = iAverage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSignupCount)) return false;
        TSignupCount other = (TSignupCount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dSignup==null && other.getDSignup()==null) || 
             (this.dSignup!=null &&
              this.dSignup.equals(other.getDSignup()))) &&
            this.iCount == other.getICount() &&
            this.iTotal == other.getITotal() &&
            this.iAverage == other.getIAverage();
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
        if (getDSignup() != null) {
            _hashCode += getDSignup().hashCode();
        }
        _hashCode += getICount();
        _hashCode += getITotal();
        _hashCode += getIAverage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSignupCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tSignupCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSignup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dSignup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iAverage"));
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
