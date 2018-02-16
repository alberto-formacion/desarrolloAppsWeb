/**
 * TFullTeamInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TFullTeamInfo  implements java.io.Serializable {
    private java.lang.String sName;

    private java.lang.String sCountryFlag;

    private java.lang.String sCountryFlagLarge;

    private java.lang.String sCoach;

    private int iCompeted;

    private java.lang.String[] sGoalKeepers;

    private java.lang.String[] sDefenders;

    private java.lang.String[] sMidFields;

    private java.lang.String[] sForwards;

    public TFullTeamInfo() {
    }

    public TFullTeamInfo(
           java.lang.String sName,
           java.lang.String sCountryFlag,
           java.lang.String sCountryFlagLarge,
           java.lang.String sCoach,
           int iCompeted,
           java.lang.String[] sGoalKeepers,
           java.lang.String[] sDefenders,
           java.lang.String[] sMidFields,
           java.lang.String[] sForwards) {
           this.sName = sName;
           this.sCountryFlag = sCountryFlag;
           this.sCountryFlagLarge = sCountryFlagLarge;
           this.sCoach = sCoach;
           this.iCompeted = iCompeted;
           this.sGoalKeepers = sGoalKeepers;
           this.sDefenders = sDefenders;
           this.sMidFields = sMidFields;
           this.sForwards = sForwards;
    }


    /**
     * Gets the sName value for this TFullTeamInfo.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TFullTeamInfo.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sCountryFlag value for this TFullTeamInfo.
     * 
     * @return sCountryFlag
     */
    public java.lang.String getSCountryFlag() {
        return sCountryFlag;
    }


    /**
     * Sets the sCountryFlag value for this TFullTeamInfo.
     * 
     * @param sCountryFlag
     */
    public void setSCountryFlag(java.lang.String sCountryFlag) {
        this.sCountryFlag = sCountryFlag;
    }


    /**
     * Gets the sCountryFlagLarge value for this TFullTeamInfo.
     * 
     * @return sCountryFlagLarge
     */
    public java.lang.String getSCountryFlagLarge() {
        return sCountryFlagLarge;
    }


    /**
     * Sets the sCountryFlagLarge value for this TFullTeamInfo.
     * 
     * @param sCountryFlagLarge
     */
    public void setSCountryFlagLarge(java.lang.String sCountryFlagLarge) {
        this.sCountryFlagLarge = sCountryFlagLarge;
    }


    /**
     * Gets the sCoach value for this TFullTeamInfo.
     * 
     * @return sCoach
     */
    public java.lang.String getSCoach() {
        return sCoach;
    }


    /**
     * Sets the sCoach value for this TFullTeamInfo.
     * 
     * @param sCoach
     */
    public void setSCoach(java.lang.String sCoach) {
        this.sCoach = sCoach;
    }


    /**
     * Gets the iCompeted value for this TFullTeamInfo.
     * 
     * @return iCompeted
     */
    public int getICompeted() {
        return iCompeted;
    }


    /**
     * Sets the iCompeted value for this TFullTeamInfo.
     * 
     * @param iCompeted
     */
    public void setICompeted(int iCompeted) {
        this.iCompeted = iCompeted;
    }


    /**
     * Gets the sGoalKeepers value for this TFullTeamInfo.
     * 
     * @return sGoalKeepers
     */
    public java.lang.String[] getSGoalKeepers() {
        return sGoalKeepers;
    }


    /**
     * Sets the sGoalKeepers value for this TFullTeamInfo.
     * 
     * @param sGoalKeepers
     */
    public void setSGoalKeepers(java.lang.String[] sGoalKeepers) {
        this.sGoalKeepers = sGoalKeepers;
    }


    /**
     * Gets the sDefenders value for this TFullTeamInfo.
     * 
     * @return sDefenders
     */
    public java.lang.String[] getSDefenders() {
        return sDefenders;
    }


    /**
     * Sets the sDefenders value for this TFullTeamInfo.
     * 
     * @param sDefenders
     */
    public void setSDefenders(java.lang.String[] sDefenders) {
        this.sDefenders = sDefenders;
    }


    /**
     * Gets the sMidFields value for this TFullTeamInfo.
     * 
     * @return sMidFields
     */
    public java.lang.String[] getSMidFields() {
        return sMidFields;
    }


    /**
     * Sets the sMidFields value for this TFullTeamInfo.
     * 
     * @param sMidFields
     */
    public void setSMidFields(java.lang.String[] sMidFields) {
        this.sMidFields = sMidFields;
    }


    /**
     * Gets the sForwards value for this TFullTeamInfo.
     * 
     * @return sForwards
     */
    public java.lang.String[] getSForwards() {
        return sForwards;
    }


    /**
     * Sets the sForwards value for this TFullTeamInfo.
     * 
     * @param sForwards
     */
    public void setSForwards(java.lang.String[] sForwards) {
        this.sForwards = sForwards;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFullTeamInfo)) return false;
        TFullTeamInfo other = (TFullTeamInfo) obj;
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
            ((this.sCountryFlag==null && other.getSCountryFlag()==null) || 
             (this.sCountryFlag!=null &&
              this.sCountryFlag.equals(other.getSCountryFlag()))) &&
            ((this.sCountryFlagLarge==null && other.getSCountryFlagLarge()==null) || 
             (this.sCountryFlagLarge!=null &&
              this.sCountryFlagLarge.equals(other.getSCountryFlagLarge()))) &&
            ((this.sCoach==null && other.getSCoach()==null) || 
             (this.sCoach!=null &&
              this.sCoach.equals(other.getSCoach()))) &&
            this.iCompeted == other.getICompeted() &&
            ((this.sGoalKeepers==null && other.getSGoalKeepers()==null) || 
             (this.sGoalKeepers!=null &&
              java.util.Arrays.equals(this.sGoalKeepers, other.getSGoalKeepers()))) &&
            ((this.sDefenders==null && other.getSDefenders()==null) || 
             (this.sDefenders!=null &&
              java.util.Arrays.equals(this.sDefenders, other.getSDefenders()))) &&
            ((this.sMidFields==null && other.getSMidFields()==null) || 
             (this.sMidFields!=null &&
              java.util.Arrays.equals(this.sMidFields, other.getSMidFields()))) &&
            ((this.sForwards==null && other.getSForwards()==null) || 
             (this.sForwards!=null &&
              java.util.Arrays.equals(this.sForwards, other.getSForwards())));
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
        if (getSCountryFlag() != null) {
            _hashCode += getSCountryFlag().hashCode();
        }
        if (getSCountryFlagLarge() != null) {
            _hashCode += getSCountryFlagLarge().hashCode();
        }
        if (getSCoach() != null) {
            _hashCode += getSCoach().hashCode();
        }
        _hashCode += getICompeted();
        if (getSGoalKeepers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSGoalKeepers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSGoalKeepers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSDefenders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSDefenders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSDefenders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMidFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMidFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMidFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSForwards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSForwards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSForwards(), i);
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
        new org.apache.axis.description.TypeDesc(TFullTeamInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tFullTeamInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCoach");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sCoach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICompeted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iCompeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGoalKeepers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sGoalKeepers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDefenders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sDefenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMidFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sMidFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SForwards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sForwards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "string"));
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
