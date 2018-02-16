/**
 * TGroupsCompetitors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGroupsCompetitors  implements java.io.Serializable {
    private eu.dataaccess.footballpool.TGroupInfo groupInfo;

    private eu.dataaccess.footballpool.TTeamInfo[] teamsInGroup;

    public TGroupsCompetitors() {
    }

    public TGroupsCompetitors(
           eu.dataaccess.footballpool.TGroupInfo groupInfo,
           eu.dataaccess.footballpool.TTeamInfo[] teamsInGroup) {
           this.groupInfo = groupInfo;
           this.teamsInGroup = teamsInGroup;
    }


    /**
     * Gets the groupInfo value for this TGroupsCompetitors.
     * 
     * @return groupInfo
     */
    public eu.dataaccess.footballpool.TGroupInfo getGroupInfo() {
        return groupInfo;
    }


    /**
     * Sets the groupInfo value for this TGroupsCompetitors.
     * 
     * @param groupInfo
     */
    public void setGroupInfo(eu.dataaccess.footballpool.TGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }


    /**
     * Gets the teamsInGroup value for this TGroupsCompetitors.
     * 
     * @return teamsInGroup
     */
    public eu.dataaccess.footballpool.TTeamInfo[] getTeamsInGroup() {
        return teamsInGroup;
    }


    /**
     * Sets the teamsInGroup value for this TGroupsCompetitors.
     * 
     * @param teamsInGroup
     */
    public void setTeamsInGroup(eu.dataaccess.footballpool.TTeamInfo[] teamsInGroup) {
        this.teamsInGroup = teamsInGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGroupsCompetitors)) return false;
        TGroupsCompetitors other = (TGroupsCompetitors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupInfo==null && other.getGroupInfo()==null) || 
             (this.groupInfo!=null &&
              this.groupInfo.equals(other.getGroupInfo()))) &&
            ((this.teamsInGroup==null && other.getTeamsInGroup()==null) || 
             (this.teamsInGroup!=null &&
              java.util.Arrays.equals(this.teamsInGroup, other.getTeamsInGroup())));
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
        if (getGroupInfo() != null) {
            _hashCode += getGroupInfo().hashCode();
        }
        if (getTeamsInGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamsInGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamsInGroup(), i);
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
        new org.apache.axis.description.TypeDesc(TGroupsCompetitors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGroupsCompetitors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "GroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGroupInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamsInGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "TeamsInGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamInfo"));
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
