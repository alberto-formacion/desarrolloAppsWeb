/**
 * TTopSelectedGoalScorer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTopSelectedGoalScorer  implements java.io.Serializable {
    private java.lang.String sName;

    private int iSelected;

    private eu.dataaccess.footballpool.TCountrySelectedTopScorer[] countries;

    public TTopSelectedGoalScorer() {
    }

    public TTopSelectedGoalScorer(
           java.lang.String sName,
           int iSelected,
           eu.dataaccess.footballpool.TCountrySelectedTopScorer[] countries) {
           this.sName = sName;
           this.iSelected = iSelected;
           this.countries = countries;
    }


    /**
     * Gets the sName value for this TTopSelectedGoalScorer.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TTopSelectedGoalScorer.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the iSelected value for this TTopSelectedGoalScorer.
     * 
     * @return iSelected
     */
    public int getISelected() {
        return iSelected;
    }


    /**
     * Sets the iSelected value for this TTopSelectedGoalScorer.
     * 
     * @param iSelected
     */
    public void setISelected(int iSelected) {
        this.iSelected = iSelected;
    }


    /**
     * Gets the countries value for this TTopSelectedGoalScorer.
     * 
     * @return countries
     */
    public eu.dataaccess.footballpool.TCountrySelectedTopScorer[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this TTopSelectedGoalScorer.
     * 
     * @param countries
     */
    public void setCountries(eu.dataaccess.footballpool.TCountrySelectedTopScorer[] countries) {
        this.countries = countries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTopSelectedGoalScorer)) return false;
        TTopSelectedGoalScorer other = (TTopSelectedGoalScorer) obj;
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
            this.iSelected == other.getISelected() &&
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries())));
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
        _hashCode += getISelected();
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTopSelectedGoalScorer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTopSelectedGoalScorer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISelected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCountrySelectedTopScorer"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCountrySelectedTopScorer"));
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
