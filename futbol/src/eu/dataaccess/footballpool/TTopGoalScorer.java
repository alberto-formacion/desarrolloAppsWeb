/**
 * TTopGoalScorer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTopGoalScorer  implements java.io.Serializable {
    private java.lang.String sName;

    private int iGoals;

    private java.lang.String sCountry;

    private java.lang.String sFlag;

    private java.lang.String sFlagLarge;

    public TTopGoalScorer() {
    }

    public TTopGoalScorer(
           java.lang.String sName,
           int iGoals,
           java.lang.String sCountry,
           java.lang.String sFlag,
           java.lang.String sFlagLarge) {
           this.sName = sName;
           this.iGoals = iGoals;
           this.sCountry = sCountry;
           this.sFlag = sFlag;
           this.sFlagLarge = sFlagLarge;
    }


    /**
     * Gets the sName value for this TTopGoalScorer.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TTopGoalScorer.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the iGoals value for this TTopGoalScorer.
     * 
     * @return iGoals
     */
    public int getIGoals() {
        return iGoals;
    }


    /**
     * Sets the iGoals value for this TTopGoalScorer.
     * 
     * @param iGoals
     */
    public void setIGoals(int iGoals) {
        this.iGoals = iGoals;
    }


    /**
     * Gets the sCountry value for this TTopGoalScorer.
     * 
     * @return sCountry
     */
    public java.lang.String getSCountry() {
        return sCountry;
    }


    /**
     * Sets the sCountry value for this TTopGoalScorer.
     * 
     * @param sCountry
     */
    public void setSCountry(java.lang.String sCountry) {
        this.sCountry = sCountry;
    }


    /**
     * Gets the sFlag value for this TTopGoalScorer.
     * 
     * @return sFlag
     */
    public java.lang.String getSFlag() {
        return sFlag;
    }


    /**
     * Sets the sFlag value for this TTopGoalScorer.
     * 
     * @param sFlag
     */
    public void setSFlag(java.lang.String sFlag) {
        this.sFlag = sFlag;
    }


    /**
     * Gets the sFlagLarge value for this TTopGoalScorer.
     * 
     * @return sFlagLarge
     */
    public java.lang.String getSFlagLarge() {
        return sFlagLarge;
    }


    /**
     * Sets the sFlagLarge value for this TTopGoalScorer.
     * 
     * @param sFlagLarge
     */
    public void setSFlagLarge(java.lang.String sFlagLarge) {
        this.sFlagLarge = sFlagLarge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTopGoalScorer)) return false;
        TTopGoalScorer other = (TTopGoalScorer) obj;
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
            this.iGoals == other.getIGoals() &&
            ((this.sCountry==null && other.getSCountry()==null) || 
             (this.sCountry!=null &&
              this.sCountry.equals(other.getSCountry()))) &&
            ((this.sFlag==null && other.getSFlag()==null) || 
             (this.sFlag!=null &&
              this.sFlag.equals(other.getSFlag()))) &&
            ((this.sFlagLarge==null && other.getSFlagLarge()==null) || 
             (this.sFlagLarge!=null &&
              this.sFlagLarge.equals(other.getSFlagLarge())));
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
        _hashCode += getIGoals();
        if (getSCountry() != null) {
            _hashCode += getSCountry().hashCode();
        }
        if (getSFlag() != null) {
            _hashCode += getSFlag().hashCode();
        }
        if (getSFlagLarge() != null) {
            _hashCode += getSFlagLarge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTopGoalScorer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTopGoalScorer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iGoals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sFlagLarge"));
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
