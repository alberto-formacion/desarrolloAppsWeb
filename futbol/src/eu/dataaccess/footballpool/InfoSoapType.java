/**
 * InfoSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public interface InfoSoapType extends java.rmi.Remote {

    /**
     * Returns an array with the id, name, country and flag reference
     * of all players
     */
    public eu.dataaccess.footballpool.TPlayerNames[] allPlayerNames(boolean bSelected) throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all defenders. If you pass
     * a country name the result will be filtered on that country, so you
     * only get the defenders listed for the specified country
     */
    public java.lang.String[] allDefenders(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all goalkeepers. If you
     * pass a country name the result will be filtered on that country, so
     * you only get the goalkeepers listed for the specified country
     */
    public java.lang.String[] allGoalKeepers(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all forwards. If you pass
     * a country name the result will be filtered on that country, so you
     * only get the forwards listed for the specified country
     */
    public java.lang.String[] allForwards(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all midfields. If you pass
     * a country name the result will be filtered on that country, so you
     * only get the midfields listed for the specified country
     */
    public java.lang.String[] allMidFields(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the top N goal scorers and their current
     * score. Pass 0 as TopN and you get them all.
     */
    public eu.dataaccess.footballpool.TTopGoalScorer[] topGoalScorers(int iTopN) throws java.rmi.RemoteException;

    /**
     * Returns an array with the top N selected goal scorers and how
     * often they are selected. Pass 0 as TopN and you get them all.
     */
    public eu.dataaccess.footballpool.TTopSelectedGoalScorer[] topSelectedGoalScorers(int iTopN) throws java.rmi.RemoteException;

    /**
     * Returns an array with players that have a red or a yellow card.
     * Note: You can only sort on Name, Yellow or Red cards, not on a combination.
     */
    public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithYellowOrRedCards(boolean bSortedByName, boolean bSortedByYellowCards, boolean bSortedByRedCards) throws java.rmi.RemoteException;

    /**
     * Returns an array with players that have a yellow card. Note:
     * You can only sort on Name or Yellow cards, not on a combination.
     */
    public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithYellowCards(boolean bSortedByName, boolean bSortedByYellowCards) throws java.rmi.RemoteException;

    /**
     * Returns an array with players that have a red card. Note: You
     * can only sort on Name or Red cards, not on a combination.
     */
    public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithRedCards(boolean bSortedByName, boolean bSortedByRedCards) throws java.rmi.RemoteException;

    /**
     * Returns an array with all given cards during the tournament
     */
    public eu.dataaccess.footballpool.TCardInfo[] allCards() throws java.rmi.RemoteException;

    /**
     * Returns an array with all the city names where games are played
     */
    public java.lang.String[] cities() throws java.rmi.RemoteException;

    /**
     * Returns an array of stadium names where the games are played
     */
    public java.lang.String[] stadiumNames() throws java.rmi.RemoteException;

    /**
     * Returns a URL that can be used to show a small map of the stadium
     */
    public java.lang.String stadiumURL(java.lang.String sStadiumName) throws java.rmi.RemoteException;

    /**
     * Returns the information we keep about a particular stadium,
     * Pass the name of the stadium
     */
    public eu.dataaccess.footballpool.TStadiumInfo stadiumInfo(java.lang.String sStadiumName) throws java.rmi.RemoteException;

    /**
     * Returns an array with all stadiums. The array contains the
     * names, the city where the stadium can be found and the seat capacity
     */
    public eu.dataaccess.footballpool.TStadiumInfo[] allStadiumInfo() throws java.rmi.RemoteException;

    /**
     * Returns all team info from a passed team; name, flag, playernames
     * (by role), trainer
     */
    public eu.dataaccess.footballpool.TFullTeamInfo fullTeamInfo(java.lang.String sTeamName) throws java.rmi.RemoteException;

    /**
     * Returns an array of all teams that compete with a link to the
     * picture of their flag
     */
    public eu.dataaccess.footballpool.TTeamInfo[] teams() throws java.rmi.RemoteException;

    /**
     * Returns the number of groups in the tournament
     */
    public int groupCount() throws java.rmi.RemoteException;

    /**
     * Returns an array of group id's and descriptions. Group is a
     * poule collection of a knock out level
     */
    public eu.dataaccess.footballpool.TGroupInfo[] groups() throws java.rmi.RemoteException;

    /**
     * List all the members of a group/poule
     */
    public eu.dataaccess.footballpool.TTeamInfo[] groupCompetitors(java.lang.String sPoule) throws java.rmi.RemoteException;

    /**
     * List all the members of all groups/poules
     */
    public eu.dataaccess.footballpool.TGroupsCompetitors[] allGroupCompetitors() throws java.rmi.RemoteException;

    /**
     * Returns an array of scored goals. If the game id is passed
     * only for that game. You can get the game ID's via the method AllGames
     */
    public eu.dataaccess.footballpool.TGoal[] goalsScored(int iGameId) throws java.rmi.RemoteException;

    /**
     * Returns the information about a particular game
     */
    public eu.dataaccess.footballpool.TGameInfo gameInfo(int iGameId) throws java.rmi.RemoteException;

    /**
     * Returns an array of games information
     */
    public eu.dataaccess.footballpool.TGameInfo[] allGames() throws java.rmi.RemoteException;

    /**
     * Returns an array of country names. The country is a property
     * of a participant. You need the country ID to call PersonsPerCountry.
     */
    public eu.dataaccess.footballpool.TCountryInfo[] countryNames(boolean bWithCompetitors) throws java.rmi.RemoteException;

    /**
     * Number of games played so far
     */
    public int gamesPlayed() throws java.rmi.RemoteException;

    /**
     * Returns an array of Games that are played in the passed city
     * name
     */
    public eu.dataaccess.footballpool.TGameInfo[] gamesPerCity(java.lang.String sCityName) throws java.rmi.RemoteException;

    /**
     * Returns the total number of yellow cards given during this
     * tournament (so far)
     */
    public int yellowCardsTotal() throws java.rmi.RemoteException;

    /**
     * Returns the total number of red cards given during this tournament
     * (so far)
     */
    public int redCardsTotal() throws java.rmi.RemoteException;

    /**
     * Returns a combination of the total number of yellow and red
     * cards given during this tournament (so far)
     */
    public eu.dataaccess.footballpool.TCards yellowAndRedCardsTotal() throws java.rmi.RemoteException;

    /**
     * Returns an array with the status codes for the games
     */
    public eu.dataaccess.footballpool.TGameResultCode[] gameResultCodes() throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all the coaches and the
     * team information he/she is coaching
     */
    public eu.dataaccess.footballpool.TCoaches[] coaches() throws java.rmi.RemoteException;

    /**
     * Returns a number on how many times the given team competed
     * at a worldcup football
     */
    public int playedAtWorldCup(java.lang.String sTeamName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the team of this competition with the
     * number of times competed and the number of times won
     */
    public eu.dataaccess.footballpool.TTeamCompete[] teamsCompeteList() throws java.rmi.RemoteException;

    /**
     * Returns information of the next game
     */
    public eu.dataaccess.footballpool.TGameInfo nextGame() throws java.rmi.RemoteException;

    /**
     * Returns the date of the first game
     */
    public java.util.Date dateOfFirstGame() throws java.rmi.RemoteException;

    /**
     * Returns the date of the last game (usually the finals...)
     */
    public java.util.Date dateOfLastGame() throws java.rmi.RemoteException;

    /**
     * Returns the date of the last group game will be played. After
     * this date the quarter finals are played.
     */
    public java.util.Date dateLastGroupGame() throws java.rmi.RemoteException;

    /**
     * Returns information (dates and number of games) about the tournament
     */
    public eu.dataaccess.footballpool.TTournamentInfo tournamentInfo() throws java.rmi.RemoteException;

    /**
     * Returns the number of games in the tournament
     */
    public int numberOfGames() throws java.rmi.RemoteException;

    /**
     * Returns an array with the number of people signed up at that
     * day
     */
    public eu.dataaccess.footballpool.TSignupCount[] signupsPerDate() throws java.rmi.RemoteException;
}
