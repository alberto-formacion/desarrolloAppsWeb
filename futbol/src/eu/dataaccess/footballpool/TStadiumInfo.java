/**
 * TStadiumInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TStadiumInfo  implements java.io.Serializable {
    private java.lang.String sStadiumName;

    private int iSeatsCapacity;

    private java.lang.String sCityName;

    private java.lang.String sWikipediaURL;

    private java.lang.String sGoogleMapsURL;

    public TStadiumInfo() {
    }

    public TStadiumInfo(
           java.lang.String sStadiumName,
           int iSeatsCapacity,
           java.lang.String sCityName,
           java.lang.String sWikipediaURL,
           java.lang.String sGoogleMapsURL) {
           this.sStadiumName = sStadiumName;
           this.iSeatsCapacity = iSeatsCapacity;
           this.sCityName = sCityName;
           this.sWikipediaURL = sWikipediaURL;
           this.sGoogleMapsURL = sGoogleMapsURL;
    }


    /**
     * Gets the sStadiumName value for this TStadiumInfo.
     * 
     * @return sStadiumName
     */
    public java.lang.String getSStadiumName() {
        return sStadiumName;
    }


    /**
     * Sets the sStadiumName value for this TStadiumInfo.
     * 
     * @param sStadiumName
     */
    public void setSStadiumName(java.lang.String sStadiumName) {
        this.sStadiumName = sStadiumName;
    }


    /**
     * Gets the iSeatsCapacity value for this TStadiumInfo.
     * 
     * @return iSeatsCapacity
     */
    public int getISeatsCapacity() {
        return iSeatsCapacity;
    }


    /**
     * Sets the iSeatsCapacity value for this TStadiumInfo.
     * 
     * @param iSeatsCapacity
     */
    public void setISeatsCapacity(int iSeatsCapacity) {
        this.iSeatsCapacity = iSeatsCapacity;
    }


    /**
     * Gets the sCityName value for this TStadiumInfo.
     * 
     * @return sCityName
     */
    public java.lang.String getSCityName() {
        return sCityName;
    }


    /**
     * Sets the sCityName value for this TStadiumInfo.
     * 
     * @param sCityName
     */
    public void setSCityName(java.lang.String sCityName) {
        this.sCityName = sCityName;
    }


    /**
     * Gets the sWikipediaURL value for this TStadiumInfo.
     * 
     * @return sWikipediaURL
     */
    public java.lang.String getSWikipediaURL() {
        return sWikipediaURL;
    }


    /**
     * Sets the sWikipediaURL value for this TStadiumInfo.
     * 
     * @param sWikipediaURL
     */
    public void setSWikipediaURL(java.lang.String sWikipediaURL) {
        this.sWikipediaURL = sWikipediaURL;
    }


    /**
     * Gets the sGoogleMapsURL value for this TStadiumInfo.
     * 
     * @return sGoogleMapsURL
     */
    public java.lang.String getSGoogleMapsURL() {
        return sGoogleMapsURL;
    }


    /**
     * Sets the sGoogleMapsURL value for this TStadiumInfo.
     * 
     * @param sGoogleMapsURL
     */
    public void setSGoogleMapsURL(java.lang.String sGoogleMapsURL) {
        this.sGoogleMapsURL = sGoogleMapsURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TStadiumInfo)) return false;
        TStadiumInfo other = (TStadiumInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sStadiumName==null && other.getSStadiumName()==null) || 
             (this.sStadiumName!=null &&
              this.sStadiumName.equals(other.getSStadiumName()))) &&
            this.iSeatsCapacity == other.getISeatsCapacity() &&
            ((this.sCityName==null && other.getSCityName()==null) || 
             (this.sCityName!=null &&
              this.sCityName.equals(other.getSCityName()))) &&
            ((this.sWikipediaURL==null && other.getSWikipediaURL()==null) || 
             (this.sWikipediaURL!=null &&
              this.sWikipediaURL.equals(other.getSWikipediaURL()))) &&
            ((this.sGoogleMapsURL==null && other.getSGoogleMapsURL()==null) || 
             (this.sGoogleMapsURL!=null &&
              this.sGoogleMapsURL.equals(other.getSGoogleMapsURL())));
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
        if (getSStadiumName() != null) {
            _hashCode += getSStadiumName().hashCode();
        }
        _hashCode += getISeatsCapacity();
        if (getSCityName() != null) {
            _hashCode += getSCityName().hashCode();
        }
        if (getSWikipediaURL() != null) {
            _hashCode += getSWikipediaURL().hashCode();
        }
        if (getSGoogleMapsURL() != null) {
            _hashCode += getSGoogleMapsURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TStadiumInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tStadiumInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SStadiumName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sStadiumName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISeatsCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iSeatsCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SWikipediaURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sWikipediaURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGoogleMapsURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGoogleMapsURL"));
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
