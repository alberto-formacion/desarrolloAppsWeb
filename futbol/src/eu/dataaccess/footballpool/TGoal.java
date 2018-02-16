/**
 * TGoal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGoal  implements java.io.Serializable {
    private java.util.Date dGame;

    private int iMinute;

    private java.lang.String sPlayerName;

    private java.lang.String sTeamName;

    private java.lang.String sTeamFlag;

    private java.lang.String sTeamFlagLarge;

    public TGoal() {
    }

    public TGoal(
           java.util.Date dGame,
           int iMinute,
           java.lang.String sPlayerName,
           java.lang.String sTeamName,
           java.lang.String sTeamFlag,
           java.lang.String sTeamFlagLarge) {
           this.dGame = dGame;
           this.iMinute = iMinute;
           this.sPlayerName = sPlayerName;
           this.sTeamName = sTeamName;
           this.sTeamFlag = sTeamFlag;
           this.sTeamFlagLarge = sTeamFlagLarge;
    }


    /**
     * Gets the dGame value for this TGoal.
     * 
     * @return dGame
     */
    public java.util.Date getDGame() {
        return dGame;
    }


    /**
     * Sets the dGame value for this TGoal.
     * 
     * @param dGame
     */
    public void setDGame(java.util.Date dGame) {
        this.dGame = dGame;
    }


    /**
     * Gets the iMinute value for this TGoal.
     * 
     * @return iMinute
     */
    public int getIMinute() {
        return iMinute;
    }


    /**
     * Sets the iMinute value for this TGoal.
     * 
     * @param iMinute
     */
    public void setIMinute(int iMinute) {
        this.iMinute = iMinute;
    }


    /**
     * Gets the sPlayerName value for this TGoal.
     * 
     * @return sPlayerName
     */
    public java.lang.String getSPlayerName() {
        return sPlayerName;
    }


    /**
     * Sets the sPlayerName value for this TGoal.
     * 
     * @param sPlayerName
     */
    public void setSPlayerName(java.lang.String sPlayerName) {
        this.sPlayerName = sPlayerName;
    }


    /**
     * Gets the sTeamName value for this TGoal.
     * 
     * @return sTeamName
     */
    public java.lang.String getSTeamName() {
        return sTeamName;
    }


    /**
     * Sets the sTeamName value for this TGoal.
     * 
     * @param sTeamName
     */
    public void setSTeamName(java.lang.String sTeamName) {
        this.sTeamName = sTeamName;
    }


    /**
     * Gets the sTeamFlag value for this TGoal.
     * 
     * @return sTeamFlag
     */
    public java.lang.String getSTeamFlag() {
        return sTeamFlag;
    }


    /**
     * Sets the sTeamFlag value for this TGoal.
     * 
     * @param sTeamFlag
     */
    public void setSTeamFlag(java.lang.String sTeamFlag) {
        this.sTeamFlag = sTeamFlag;
    }


    /**
     * Gets the sTeamFlagLarge value for this TGoal.
     * 
     * @return sTeamFlagLarge
     */
    public java.lang.String getSTeamFlagLarge() {
        return sTeamFlagLarge;
    }


    /**
     * Sets the sTeamFlagLarge value for this TGoal.
     * 
     * @param sTeamFlagLarge
     */
    public void setSTeamFlagLarge(java.lang.String sTeamFlagLarge) {
        this.sTeamFlagLarge = sTeamFlagLarge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGoal)) return false;
        TGoal other = (TGoal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dGame==null && other.getDGame()==null) || 
             (this.dGame!=null &&
              this.dGame.equals(other.getDGame()))) &&
            this.iMinute == other.getIMinute() &&
            ((this.sPlayerName==null && other.getSPlayerName()==null) || 
             (this.sPlayerName!=null &&
              this.sPlayerName.equals(other.getSPlayerName()))) &&
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
        if (getDGame() != null) {
            _hashCode += getDGame().hashCode();
        }
        _hashCode += getIMinute();
        if (getSPlayerName() != null) {
            _hashCode += getSPlayerName().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(TGoal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGoal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DGame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPlayerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sPlayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
