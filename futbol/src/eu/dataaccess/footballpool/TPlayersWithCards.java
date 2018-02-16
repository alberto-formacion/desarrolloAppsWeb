/**
 * TPlayersWithCards.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TPlayersWithCards  implements java.io.Serializable {
    private java.lang.String sName;

    private int iYellowCards;

    private int iRedCards;

    private java.lang.String sTeamName;

    private java.lang.String sTeamFlag;

    private java.lang.String sTeamFlagLarge;

    public TPlayersWithCards() {
    }

    public TPlayersWithCards(
           java.lang.String sName,
           int iYellowCards,
           int iRedCards,
           java.lang.String sTeamName,
           java.lang.String sTeamFlag,
           java.lang.String sTeamFlagLarge) {
           this.sName = sName;
           this.iYellowCards = iYellowCards;
           this.iRedCards = iRedCards;
           this.sTeamName = sTeamName;
           this.sTeamFlag = sTeamFlag;
           this.sTeamFlagLarge = sTeamFlagLarge;
    }


    /**
     * Gets the sName value for this TPlayersWithCards.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TPlayersWithCards.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the iYellowCards value for this TPlayersWithCards.
     * 
     * @return iYellowCards
     */
    public int getIYellowCards() {
        return iYellowCards;
    }


    /**
     * Sets the iYellowCards value for this TPlayersWithCards.
     * 
     * @param iYellowCards
     */
    public void setIYellowCards(int iYellowCards) {
        this.iYellowCards = iYellowCards;
    }


    /**
     * Gets the iRedCards value for this TPlayersWithCards.
     * 
     * @return iRedCards
     */
    public int getIRedCards() {
        return iRedCards;
    }


    /**
     * Sets the iRedCards value for this TPlayersWithCards.
     * 
     * @param iRedCards
     */
    public void setIRedCards(int iRedCards) {
        this.iRedCards = iRedCards;
    }


    /**
     * Gets the sTeamName value for this TPlayersWithCards.
     * 
     * @return sTeamName
     */
    public java.lang.String getSTeamName() {
        return sTeamName;
    }


    /**
     * Sets the sTeamName value for this TPlayersWithCards.
     * 
     * @param sTeamName
     */
    public void setSTeamName(java.lang.String sTeamName) {
        this.sTeamName = sTeamName;
    }


    /**
     * Gets the sTeamFlag value for this TPlayersWithCards.
     * 
     * @return sTeamFlag
     */
    public java.lang.String getSTeamFlag() {
        return sTeamFlag;
    }


    /**
     * Sets the sTeamFlag value for this TPlayersWithCards.
     * 
     * @param sTeamFlag
     */
    public void setSTeamFlag(java.lang.String sTeamFlag) {
        this.sTeamFlag = sTeamFlag;
    }


    /**
     * Gets the sTeamFlagLarge value for this TPlayersWithCards.
     * 
     * @return sTeamFlagLarge
     */
    public java.lang.String getSTeamFlagLarge() {
        return sTeamFlagLarge;
    }


    /**
     * Sets the sTeamFlagLarge value for this TPlayersWithCards.
     * 
     * @param sTeamFlagLarge
     */
    public void setSTeamFlagLarge(java.lang.String sTeamFlagLarge) {
        this.sTeamFlagLarge = sTeamFlagLarge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPlayersWithCards)) return false;
        TPlayersWithCards other = (TPlayersWithCards) obj;
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
            this.iYellowCards == other.getIYellowCards() &&
            this.iRedCards == other.getIRedCards() &&
            ((this.sTeamName==null && other.getSTeamName()==null) || 
             (this.sTeamName!=null &&
              this.sTeamName.equals(other.getSTeamName()))) &&
            ((this.sTeamFlag==null && other.getSTeamFlag()==null) || 
             (this.sTeamFlag!=null &&
              this.sTeamFlag.equals(other.getSTeamFlag()))) &&
            ((this.sTeamFlagLarge==null && other.getSTeamFlagLarge()==null) || 
             (this.sTeamFlagLarge!=null &&
              this.sTeamFlagLarge.equals(other.getSTeamFlagLarge())));
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
        _hashCode += getIYellowCards();
        _hashCode += getIRedCards();
        if (getSTeamName() != null) {
            _hashCode += getSTeamName().hashCode();
        }
        if (getSTeamFlag() != null) {
            _hashCode += getSTeamFlag().hashCode();
        }
        if (getSTeamFlagLarge() != null) {
            _hashCode += getSTeamFlagLarge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPlayersWithCards.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tPlayersWithCards"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IYellowCards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iYellowCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRedCards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iRedCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sTeamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sTeamFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamFlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sTeamFlagLarge"));
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
