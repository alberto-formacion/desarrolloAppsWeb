/**
 * TTournamentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTournamentInfo  implements java.io.Serializable {
    private java.util.Date dFirstGame;

    private java.util.Date dLastGame;

    private java.util.Date dLastGroupDateGame;

    private int iGames;

    public TTournamentInfo() {
    }

    public TTournamentInfo(
           java.util.Date dFirstGame,
           java.util.Date dLastGame,
           java.util.Date dLastGroupDateGame,
           int iGames) {
           this.dFirstGame = dFirstGame;
           this.dLastGame = dLastGame;
           this.dLastGroupDateGame = dLastGroupDateGame;
           this.iGames = iGames;
    }


    /**
     * Gets the dFirstGame value for this TTournamentInfo.
     * 
     * @return dFirstGame
     */
    public java.util.Date getDFirstGame() {
        return dFirstGame;
    }


    /**
     * Sets the dFirstGame value for this TTournamentInfo.
     * 
     * @param dFirstGame
     */
    public void setDFirstGame(java.util.Date dFirstGame) {
        this.dFirstGame = dFirstGame;
    }


    /**
     * Gets the dLastGame value for this TTournamentInfo.
     * 
     * @return dLastGame
     */
    public java.util.Date getDLastGame() {
        return dLastGame;
    }


    /**
     * Sets the dLastGame value for this TTournamentInfo.
     * 
     * @param dLastGame
     */
    public void setDLastGame(java.util.Date dLastGame) {
        this.dLastGame = dLastGame;
    }


    /**
     * Gets the dLastGroupDateGame value for this TTournamentInfo.
     * 
     * @return dLastGroupDateGame
     */
    public java.util.Date getDLastGroupDateGame() {
        return dLastGroupDateGame;
    }


    /**
     * Sets the dLastGroupDateGame value for this TTournamentInfo.
     * 
     * @param dLastGroupDateGame
     */
    public void setDLastGroupDateGame(java.util.Date dLastGroupDateGame) {
        this.dLastGroupDateGame = dLastGroupDateGame;
    }


    /**
     * Gets the iGames value for this TTournamentInfo.
     * 
     * @return iGames
     */
    public int getIGames() {
        return iGames;
    }


    /**
     * Sets the iGames value for this TTournamentInfo.
     * 
     * @param iGames
     */
    public void setIGames(int iGames) {
        this.iGames = iGames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTournamentInfo)) return false;
        TTournamentInfo other = (TTournamentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dFirstGame==null && other.getDFirstGame()==null) || 
             (this.dFirstGame!=null &&
              this.dFirstGame.equals(other.getDFirstGame()))) &&
            ((this.dLastGame==null && other.getDLastGame()==null) || 
             (this.dLastGame!=null &&
              this.dLastGame.equals(other.getDLastGame()))) &&
            ((this.dLastGroupDateGame==null && other.getDLastGroupDateGame()==null) || 
             (this.dLastGroupDateGame!=null &&
              this.dLastGroupDateGame.equals(other.getDLastGroupDateGame()))) &&
            this.iGames == other.getIGames();
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
        if (getDFirstGame() != null) {
            _hashCode += getDFirstGame().hashCode();
        }
        if (getDLastGame() != null) {
            _hashCode += getDLastGame().hashCode();
        }
        if (getDLastGroupDateGame() != null) {
            _hashCode += getDLastGroupDateGame().hashCode();
        }
        _hashCode += getIGames();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTournamentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTournamentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFirstGame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dFirstGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DLastGame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dLastGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DLastGroupDateGame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dLastGroupDateGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iGames"));
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
