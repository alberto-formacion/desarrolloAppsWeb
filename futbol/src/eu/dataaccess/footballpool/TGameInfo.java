/**
 * TGameInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGameInfo  implements java.io.Serializable {
    private int iId;

    private java.lang.String sDescription;

    private java.util.Date dPlayDate;

    private org.apache.axis.types.Time tPlayTime;

    private int iUTCOffset;

    private eu.dataaccess.footballpool.TStadiumInfo stadiumInfo;

    private eu.dataaccess.footballpool.TTeamInfo team1;

    private eu.dataaccess.footballpool.TTeamInfo team2;

    private java.lang.String sResult;

    private java.lang.String sScore;

    private int iYellowCards;

    private int iRedCards;

    private eu.dataaccess.footballpool.TGameCard[] cards;

    private eu.dataaccess.footballpool.TGoal[] goals;

    private boolean bChampion;

    public TGameInfo() {
    }

    public TGameInfo(
           int iId,
           java.lang.String sDescription,
           java.util.Date dPlayDate,
           org.apache.axis.types.Time tPlayTime,
           int iUTCOffset,
           eu.dataaccess.footballpool.TStadiumInfo stadiumInfo,
           eu.dataaccess.footballpool.TTeamInfo team1,
           eu.dataaccess.footballpool.TTeamInfo team2,
           java.lang.String sResult,
           java.lang.String sScore,
           int iYellowCards,
           int iRedCards,
           eu.dataaccess.footballpool.TGameCard[] cards,
           eu.dataaccess.footballpool.TGoal[] goals,
           boolean bChampion) {
           this.iId = iId;
           this.sDescription = sDescription;
           this.dPlayDate = dPlayDate;
           this.tPlayTime = tPlayTime;
           this.iUTCOffset = iUTCOffset;
           this.stadiumInfo = stadiumInfo;
           this.team1 = team1;
           this.team2 = team2;
           this.sResult = sResult;
           this.sScore = sScore;
           this.iYellowCards = iYellowCards;
           this.iRedCards = iRedCards;
           this.cards = cards;
           this.goals = goals;
           this.bChampion = bChampion;
    }


    /**
     * Gets the iId value for this TGameInfo.
     * 
     * @return iId
     */
    public int getIId() {
        return iId;
    }


    /**
     * Sets the iId value for this TGameInfo.
     * 
     * @param iId
     */
    public void setIId(int iId) {
        this.iId = iId;
    }


    /**
     * Gets the sDescription value for this TGameInfo.
     * 
     * @return sDescription
     */
    public java.lang.String getSDescription() {
        return sDescription;
    }


    /**
     * Sets the sDescription value for this TGameInfo.
     * 
     * @param sDescription
     */
    public void setSDescription(java.lang.String sDescription) {
        this.sDescription = sDescription;
    }


    /**
     * Gets the dPlayDate value for this TGameInfo.
     * 
     * @return dPlayDate
     */
    public java.util.Date getDPlayDate() {
        return dPlayDate;
    }


    /**
     * Sets the dPlayDate value for this TGameInfo.
     * 
     * @param dPlayDate
     */
    public void setDPlayDate(java.util.Date dPlayDate) {
        this.dPlayDate = dPlayDate;
    }


    /**
     * Gets the tPlayTime value for this TGameInfo.
     * 
     * @return tPlayTime
     */
    public org.apache.axis.types.Time getTPlayTime() {
        return tPlayTime;
    }


    /**
     * Sets the tPlayTime value for this TGameInfo.
     * 
     * @param tPlayTime
     */
    public void setTPlayTime(org.apache.axis.types.Time tPlayTime) {
        this.tPlayTime = tPlayTime;
    }


    /**
     * Gets the iUTCOffset value for this TGameInfo.
     * 
     * @return iUTCOffset
     */
    public int getIUTCOffset() {
        return iUTCOffset;
    }


    /**
     * Sets the iUTCOffset value for this TGameInfo.
     * 
     * @param iUTCOffset
     */
    public void setIUTCOffset(int iUTCOffset) {
        this.iUTCOffset = iUTCOffset;
    }


    /**
     * Gets the stadiumInfo value for this TGameInfo.
     * 
     * @return stadiumInfo
     */
    public eu.dataaccess.footballpool.TStadiumInfo getStadiumInfo() {
        return stadiumInfo;
    }


    /**
     * Sets the stadiumInfo value for this TGameInfo.
     * 
     * @param stadiumInfo
     */
    public void setStadiumInfo(eu.dataaccess.footballpool.TStadiumInfo stadiumInfo) {
        this.stadiumInfo = stadiumInfo;
    }


    /**
     * Gets the team1 value for this TGameInfo.
     * 
     * @return team1
     */
    public eu.dataaccess.footballpool.TTeamInfo getTeam1() {
        return team1;
    }


    /**
     * Sets the team1 value for this TGameInfo.
     * 
     * @param team1
     */
    public void setTeam1(eu.dataaccess.footballpool.TTeamInfo team1) {
        this.team1 = team1;
    }


    /**
     * Gets the team2 value for this TGameInfo.
     * 
     * @return team2
     */
    public eu.dataaccess.footballpool.TTeamInfo getTeam2() {
        return team2;
    }


    /**
     * Sets the team2 value for this TGameInfo.
     * 
     * @param team2
     */
    public void setTeam2(eu.dataaccess.footballpool.TTeamInfo team2) {
        this.team2 = team2;
    }


    /**
     * Gets the sResult value for this TGameInfo.
     * 
     * @return sResult
     */
    public java.lang.String getSResult() {
        return sResult;
    }


    /**
     * Sets the sResult value for this TGameInfo.
     * 
     * @param sResult
     */
    public void setSResult(java.lang.String sResult) {
        this.sResult = sResult;
    }


    /**
     * Gets the sScore value for this TGameInfo.
     * 
     * @return sScore
     */
    public java.lang.String getSScore() {
        return sScore;
    }


    /**
     * Sets the sScore value for this TGameInfo.
     * 
     * @param sScore
     */
    public void setSScore(java.lang.String sScore) {
        this.sScore = sScore;
    }


    /**
     * Gets the iYellowCards value for this TGameInfo.
     * 
     * @return iYellowCards
     */
    public int getIYellowCards() {
        return iYellowCards;
    }


    /**
     * Sets the iYellowCards value for this TGameInfo.
     * 
     * @param iYellowCards
     */
    public void setIYellowCards(int iYellowCards) {
        this.iYellowCards = iYellowCards;
    }


    /**
     * Gets the iRedCards value for this TGameInfo.
     * 
     * @return iRedCards
     */
    public int getIRedCards() {
        return iRedCards;
    }


    /**
     * Sets the iRedCards value for this TGameInfo.
     * 
     * @param iRedCards
     */
    public void setIRedCards(int iRedCards) {
        this.iRedCards = iRedCards;
    }


    /**
     * Gets the cards value for this TGameInfo.
     * 
     * @return cards
     */
    public eu.dataaccess.footballpool.TGameCard[] getCards() {
        return cards;
    }


    /**
     * Sets the cards value for this TGameInfo.
     * 
     * @param cards
     */
    public void setCards(eu.dataaccess.footballpool.TGameCard[] cards) {
        this.cards = cards;
    }


    /**
     * Gets the goals value for this TGameInfo.
     * 
     * @return goals
     */
    public eu.dataaccess.footballpool.TGoal[] getGoals() {
        return goals;
    }


    /**
     * Sets the goals value for this TGameInfo.
     * 
     * @param goals
     */
    public void setGoals(eu.dataaccess.footballpool.TGoal[] goals) {
        this.goals = goals;
    }


    /**
     * Gets the bChampion value for this TGameInfo.
     * 
     * @return bChampion
     */
    public boolean isBChampion() {
        return bChampion;
    }


    /**
     * Sets the bChampion value for this TGameInfo.
     * 
     * @param bChampion
     */
    public void setBChampion(boolean bChampion) {
        this.bChampion = bChampion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGameInfo)) return false;
        TGameInfo other = (TGameInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iId == other.getIId() &&
            ((this.sDescription==null && other.getSDescription()==null) || 
             (this.sDescription!=null &&
              this.sDescription.equals(other.getSDescription()))) &&
            ((this.dPlayDate==null && other.getDPlayDate()==null) || 
             (this.dPlayDate!=null &&
              this.dPlayDate.equals(other.getDPlayDate()))) &&
            ((this.tPlayTime==null && other.getTPlayTime()==null) || 
             (this.tPlayTime!=null &&
              this.tPlayTime.equals(other.getTPlayTime()))) &&
            this.iUTCOffset == other.getIUTCOffset() &&
            ((this.stadiumInfo==null && other.getStadiumInfo()==null) || 
             (this.stadiumInfo!=null &&
              this.stadiumInfo.equals(other.getStadiumInfo()))) &&
            ((this.team1==null && other.getTeam1()==null) || 
             (this.team1!=null &&
              this.team1.equals(other.getTeam1()))) &&
            ((this.team2==null && other.getTeam2()==null) || 
             (this.team2!=null &&
              this.team2.equals(other.getTeam2()))) &&
            ((this.sResult==null && other.getSResult()==null) || 
             (this.sResult!=null &&
              this.sResult.equals(other.getSResult()))) &&
            ((this.sScore==null && other.getSScore()==null) || 
             (this.sScore!=null &&
              this.sScore.equals(other.getSScore()))) &&
            this.iYellowCards == other.getIYellowCards() &&
            this.iRedCards == other.getIRedCards() &&
            ((this.cards==null && other.getCards()==null) || 
             (this.cards!=null &&
              java.util.Arrays.equals(this.cards, other.getCards()))) &&
            ((this.goals==null && other.getGoals()==null) || 
             (this.goals!=null &&
              java.util.Arrays.equals(this.goals, other.getGoals()))) &&
            this.bChampion == other.isBChampion();
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
        _hashCode += getIId();
        if (getSDescription() != null) {
            _hashCode += getSDescription().hashCode();
        }
        if (getDPlayDate() != null) {
            _hashCode += getDPlayDate().hashCode();
        }
        if (getTPlayTime() != null) {
            _hashCode += getTPlayTime().hashCode();
        }
        _hashCode += getIUTCOffset();
        if (getStadiumInfo() != null) {
            _hashCode += getStadiumInfo().hashCode();
        }
        if (getTeam1() != null) {
            _hashCode += getTeam1().hashCode();
        }
        if (getTeam2() != null) {
            _hashCode += getTeam2().hashCode();
        }
        if (getSResult() != null) {
            _hashCode += getSResult().hashCode();
        }
        if (getSScore() != null) {
            _hashCode += getSScore().hashCode();
        }
        _hashCode += getIYellowCards();
        _hashCode += getIRedCards();
        if (getCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCards(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGoals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGoals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGoals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isBChampion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGameInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGameInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPlayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "dPlayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPlayTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tPlayTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUTCOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "iUTCOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stadiumInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "StadiumInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tStadiumInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Team1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Team2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tTeamInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "sScore"));
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
        elemField.setFieldName("cards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Cards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGameCard"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGameCard"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "Goals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGoal"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "tGoal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BChampion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://footballpool.dataaccess.eu", "bChampion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
