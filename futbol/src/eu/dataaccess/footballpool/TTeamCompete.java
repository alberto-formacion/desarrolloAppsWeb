/**
 * TTeamCompete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTeamCompete  implements java.io.Serializable {
    private int iCompeted;

    private int iWon;

    private eu.dataaccess.footballpool.TCoaches coachInfo;

    public TTeamCompete() {
    }

    public TTeamCompete(
           int iCompeted,
           int iWon,
           eu.dataaccess.footballpool.TCoaches coachInfo) {
           this.iCompeted = iCompeted;
           this.iWon = iWon;
           this.coachInfo = coachInfo;
    }


    /**
     * Gets the iCompeted value for this TTeamCompete.
     * 
     * @return iCompeted
     */
    public int getICompeted() {
        return iCompeted;
    }


    /**
     * Sets the iCompeted value for this TTeamCompete.
     * 
     * @param iCompeted
     */
    public void setICompeted(int iCompeted) {
        this.iCompeted = iCompeted;
    }


    /**
     * Gets the iWon value for this TTeamCompete.
     * 
     * @return iWon
     */
    public int getIWon() {
        return iWon;
    }


    /**
     * Sets the iWon value for this TTeamCompete.
     * 
     * @param iWon
     */
    public void setIWon(int iWon) {
        this.iWon = iWon;
    }


    /**
     * Gets the coachInfo value for this TTeamCompete.
     * 
     * @return coachInfo
     */
    public eu.dataaccess.footballpool.TCoaches getCoachInfo() {
        return coachInfo;
    }


    /**
     * Sets the coachInfo value for this TTeamCompete.
     * 
     * @param coachInfo
     */
    public void setCoachInfo(eu.dataaccess.footballpool.TCoaches coachInfo) {
        this.coachInfo = coachInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTeamCompete)) return false;
        TTeamCompete other = (TTeamCompete) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iCompeted == other.getICompeted() &&
            this.iWon == other.getIWon() &&
            ((this.coachInfo==null && other.getCoachInfo()==null) || 
             (this.coachInfo!=null &&
              this.coachInfo.equals(other.getCoachInfo())));
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
        _hashCode += getICompeted();
        _hashCode += getIWon();
        if (getCoachInfo() != null) {
            _hashCode += getCoachInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTeamCompete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamCompete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICompeted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iCompeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IWon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coachInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "CoachInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tCoaches"));
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
