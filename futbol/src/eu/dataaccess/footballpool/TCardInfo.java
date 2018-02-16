/**
 * TCardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TCardInfo  implements java.io.Serializable {
    private java.util.Date dGame;

    private int iMinute;

    private java.lang.String sGameTeam1;

    private java.lang.String sGameTeam2;

    private java.lang.String sPlayerName;

    private boolean bYellowCard;

    private boolean bRedCard;

    private java.lang.String sGameTeam1Flag;

    private java.lang.String sGameTeam1FlagLarge;

    private java.lang.String sGameTeam2Flag;

    private java.lang.String sGameTeam2FlagLarge;

    private java.lang.String sPlayerFlag;

    private java.lang.String sPlayerFlagLarge;

    public TCardInfo() {
    }

    public TCardInfo(
           java.util.Date dGame,
           int iMinute,
           java.lang.String sGameTeam1,
           java.lang.String sGameTeam2,
           java.lang.String sPlayerName,
           boolean bYellowCard,
           boolean bRedCard,
           java.lang.String sGameTeam1Flag,
           java.lang.String sGameTeam1FlagLarge,
           java.lang.String sGameTeam2Flag,
           java.lang.String sGameTeam2FlagLarge,
           java.lang.String sPlayerFlag,
           java.lang.String sPlayerFlagLarge) {
           this.dGame = dGame;
           this.iMinute = iMinute;
           this.sGameTeam1 = sGameTeam1;
           this.sGameTeam2 = sGameTeam2;
           this.sPlayerName = sPlayerName;
           this.bYellowCard = bYellowCard;
           this.bRedCard = bRedCard;
           this.sGameTeam1Flag = sGameTeam1Flag;
           this.sGameTeam1FlagLarge = sGameTeam1FlagLarge;
           this.sGameTeam2Flag = sGameTeam2Flag;
           this.sGameTeam2FlagLarge = sGameTeam2FlagLarge;
           this.sPlayerFlag = sPlayerFlag;
           this.sPlayerFlagLarge = sPlayerFlagLarge;
    }


    /**
     * Gets the dGame value for this TCardInfo.
     * 
     * @return dGame
     */
    public java.util.Date getDGame() {
        return dGame;
    }


    /**
     * Sets the dGame value for this TCardInfo.
     * 
     * @param dGame
     */
    public void setDGame(java.util.Date dGame) {
        this.dGame = dGame;
    }


    /**
     * Gets the iMinute value for this TCardInfo.
     * 
     * @return iMinute
     */
    public int getIMinute() {
        return iMinute;
    }


    /**
     * Sets the iMinute value for this TCardInfo.
     * 
     * @param iMinute
     */
    public void setIMinute(int iMinute) {
        this.iMinute = iMinute;
    }


    /**
     * Gets the sGameTeam1 value for this TCardInfo.
     * 
     * @return sGameTeam1
     */
    public java.lang.String getSGameTeam1() {
        return sGameTeam1;
    }


    /**
     * Sets the sGameTeam1 value for this TCardInfo.
     * 
     * @param sGameTeam1
     */
    public void setSGameTeam1(java.lang.String sGameTeam1) {
        this.sGameTeam1 = sGameTeam1;
    }


    /**
     * Gets the sGameTeam2 value for this TCardInfo.
     * 
     * @return sGameTeam2
     */
    public java.lang.String getSGameTeam2() {
        return sGameTeam2;
    }


    /**
     * Sets the sGameTeam2 value for this TCardInfo.
     * 
     * @param sGameTeam2
     */
    public void setSGameTeam2(java.lang.String sGameTeam2) {
        this.sGameTeam2 = sGameTeam2;
    }


    /**
     * Gets the sPlayerName value for this TCardInfo.
     * 
     * @return sPlayerName
     */
    public java.lang.String getSPlayerName() {
        return sPlayerName;
    }


    /**
     * Sets the sPlayerName value for this TCardInfo.
     * 
     * @param sPlayerName
     */
    public void setSPlayerName(java.lang.String sPlayerName) {
        this.sPlayerName = sPlayerName;
    }


    /**
     * Gets the bYellowCard value for this TCardInfo.
     * 
     * @return bYellowCard
     */
    public boolean isBYellowCard() {
        return bYellowCard;
    }


    /**
     * Sets the bYellowCard value for this TCardInfo.
     * 
     * @param bYellowCard
     */
    public void setBYellowCard(boolean bYellowCard) {
        this.bYellowCard = bYellowCard;
    }


    /**
     * Gets the bRedCard value for this TCardInfo.
     * 
     * @return bRedCard
     */
    public boolean isBRedCard() {
        return bRedCard;
    }


    /**
     * Sets the bRedCard value for this TCardInfo.
     * 
     * @param bRedCard
     */
    public void setBRedCard(boolean bRedCard) {
        this.bRedCard = bRedCard;
    }


    /**
     * Gets the sGameTeam1Flag value for this TCardInfo.
     * 
     * @return sGameTeam1Flag
     */
    public java.lang.String getSGameTeam1Flag() {
        return sGameTeam1Flag;
    }


    /**
     * Sets the sGameTeam1Flag value for this TCardInfo.
     * 
     * @param sGameTeam1Flag
     */
    public void setSGameTeam1Flag(java.lang.String sGameTeam1Flag) {
        this.sGameTeam1Flag = sGameTeam1Flag;
    }


    /**
     * Gets the sGameTeam1FlagLarge value for this TCardInfo.
     * 
     * @return sGameTeam1FlagLarge
     */
    public java.lang.String getSGameTeam1FlagLarge() {
        return sGameTeam1FlagLarge;
    }


    /**
     * Sets the sGameTeam1FlagLarge value for this TCardInfo.
     * 
     * @param sGameTeam1FlagLarge
     */
    public void setSGameTeam1FlagLarge(java.lang.String sGameTeam1FlagLarge) {
        this.sGameTeam1FlagLarge = sGameTeam1FlagLarge;
    }


    /**
     * Gets the sGameTeam2Flag value for this TCardInfo.
     * 
     * @return sGameTeam2Flag
     */
    public java.lang.String getSGameTeam2Flag() {
        return sGameTeam2Flag;
    }


    /**
     * Sets the sGameTeam2Flag value for this TCardInfo.
     * 
     * @param sGameTeam2Flag
     */
    public void setSGameTeam2Flag(java.lang.String sGameTeam2Flag) {
        this.sGameTeam2Flag = sGameTeam2Flag;
    }


    /**
     * Gets the sGameTeam2FlagLarge value for this TCardInfo.
     * 
     * @return sGameTeam2FlagLarge
     */
    public java.lang.String getSGameTeam2FlagLarge() {
        return sGameTeam2FlagLarge;
    }


    /**
     * Sets the sGameTeam2FlagLarge value for this TCardInfo.
     * 
     * @param sGameTeam2FlagLarge
     */
    public void setSGameTeam2FlagLarge(java.lang.String sGameTeam2FlagLarge) {
        this.sGameTeam2FlagLarge = sGameTeam2FlagLarge;
    }


    /**
     * Gets the sPlayerFlag value for this TCardInfo.
     * 
     * @return sPlayerFlag
     */
    public java.lang.String getSPlayerFlag() {
        return sPlayerFlag;
    }


    /**
     * Sets the sPlayerFlag value for this TCardInfo.
     * 
     * @param sPlayerFlag
     */
    public void setSPlayerFlag(java.lang.String sPlayerFlag) {
        this.sPlayerFlag = sPlayerFlag;
    }


    /**
     * Gets the sPlayerFlagLarge value for this TCardInfo.
     * 
     * @return sPlayerFlagLarge
     */
    public java.lang.String getSPlayerFlagLarge() {
        return sPlayerFlagLarge;
    }


    /**
     * Sets the sPlayerFlagLarge value for this TCardInfo.
     * 
     * @param sPlayerFlagLarge
     */
    public void setSPlayerFlagLarge(java.lang.String sPlayerFlagLarge) {
        this.sPlayerFlagLarge = sPlayerFlagLarge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCardInfo)) return false;
        TCardInfo other = (TCardInfo) obj;
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
            ((this.sGameTeam1==null && other.getSGameTeam1()==null) || 
             (this.sGameTeam1!=null &&
              this.sGameTeam1.equals(other.getSGameTeam1()))) &&
            ((this.sGameTeam2==null && other.getSGameTeam2()==null) || 
             (this.sGameTeam2!=null &&
              this.sGameTeam2.equals(other.getSGameTeam2()))) &&
            ((this.sPlayerName==null && other.getSPlayerName()==null) || 
             (this.sPlayerName!=null &&
              this.sPlayerName.equals(other.getSPlayerName()))) &&
            this.bYellowCard == other.isBYellowCard() &&
            this.bRedCard == other.isBRedCard() &&
            ((this.sGameTeam1Flag==null && other.getSGameTeam1Flag()==null) || 
             (this.sGameTeam1Flag!=null &&
              this.sGameTeam1Flag.equals(other.getSGameTeam1Flag()))) &&
            ((this.sGameTeam1FlagLarge==null && other.getSGameTeam1FlagLarge()==null) || 
             (this.sGameTeam1FlagLarge!=null &&
              this.sGameTeam1FlagLarge.equals(other.getSGameTeam1FlagLarge()))) &&
            ((this.sGameTeam2Flag==null && other.getSGameTeam2Flag()==null) || 
             (this.sGameTeam2Flag!=null &&
              this.sGameTeam2Flag.equals(other.getSGameTeam2Flag()))) &&
            ((this.sGameTeam2FlagLarge==null && other.getSGameTeam2FlagLarge()==null) || 
             (this.sGameTeam2FlagLarge!=null &&
              this.sGameTeam2FlagLarge.equals(other.getSGameTeam2FlagLarge()))) &&
            ((this.sPlayerFlag==null && other.getSPlayerFlag()==null) || 
             (this.sPlayerFlag!=null &&
              this.sPlayerFlag.equals(other.getSPlayerFlag()))) &&
            ((this.sPlayerFlagLarge==null && other.getSPlayerFlagLarge()==null) || 
             (this.sPlayerFlagLarge!=null &&
              this.sPlayerFlagLarge.equals(other.getSPlayerFlagLarge())));
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
        if (getSGameTeam1() != null) {
            _hashCode += getSGameTeam1().hashCode();
        }
        if (getSGameTeam2() != null) {
            _hashCode += getSGameTeam2().hashCode();
        }
        if (getSPlayerName() != null) {
            _hashCode += getSPlayerName().hashCode();
        }
        _hashCode += (isBYellowCard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBRedCard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSGameTeam1Flag() != null) {
            _hashCode += getSGameTeam1Flag().hashCode();
        }
        if (getSGameTeam1FlagLarge() != null) {
            _hashCode += getSGameTeam1FlagLarge().hashCode();
        }
        if (getSGameTeam2Flag() != null) {
            _hashCode += getSGameTeam2Flag().hashCode();
        }
        if (getSGameTeam2FlagLarge() != null) {
            _hashCode += getSGameTeam2FlagLarge().hashCode();
        }
        if (getSPlayerFlag() != null) {
            _hashCode += getSPlayerFlag().hashCode();
        }
        if (getSPlayerFlagLarge() != null) {
            _hashCode += getSPlayerFlagLarge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCardInfo"));
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
        elemField.setFieldName("SGameTeam1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGameTeam2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPlayerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sPlayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BYellowCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "bYellowCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRedCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "bRedCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGameTeam1Flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam1Flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGameTeam1FlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam1FlagLarge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGameTeam2Flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam2Flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGameTeam2FlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGameTeam2FlagLarge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPlayerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sPlayerFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPlayerFlagLarge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sPlayerFlagLarge"));
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
