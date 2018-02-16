package eu.dataaccess.footballpool;

public class InfoSoapTypeProxy implements eu.dataaccess.footballpool.InfoSoapType {
  private String _endpoint = null;
  private eu.dataaccess.footballpool.InfoSoapType infoSoapType = null;
  
  public InfoSoapTypeProxy() {
    _initInfoSoapTypeProxy();
  }
  
  public InfoSoapTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfoSoapTypeProxy();
  }
  
  private void _initInfoSoapTypeProxy() {
    try {
      infoSoapType = (new eu.dataaccess.footballpool.InfoLocator()).getInfoSoap();
      if (infoSoapType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infoSoapType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infoSoapType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infoSoapType != null)
      ((javax.xml.rpc.Stub)infoSoapType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public eu.dataaccess.footballpool.InfoSoapType getInfoSoapType() {
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType;
  }
  
  public eu.dataaccess.footballpool.TPlayerNames[] allPlayerNames(boolean bSelected) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayerNames(bSelected);
  }
  
  public java.lang.String[] allDefenders(java.lang.String sCountryName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allDefenders(sCountryName);
  }
  
  public java.lang.String[] allGoalKeepers(java.lang.String sCountryName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allGoalKeepers(sCountryName);
  }
  
  public java.lang.String[] allForwards(java.lang.String sCountryName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allForwards(sCountryName);
  }
  
  public java.lang.String[] allMidFields(java.lang.String sCountryName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allMidFields(sCountryName);
  }
  
  public eu.dataaccess.footballpool.TTopGoalScorer[] topGoalScorers(int iTopN) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.topGoalScorers(iTopN);
  }
  
  public eu.dataaccess.footballpool.TTopSelectedGoalScorer[] topSelectedGoalScorers(int iTopN) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.topSelectedGoalScorers(iTopN);
  }
  
  public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithYellowOrRedCards(boolean bSortedByName, boolean bSortedByYellowCards, boolean bSortedByRedCards) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayersWithYellowOrRedCards(bSortedByName, bSortedByYellowCards, bSortedByRedCards);
  }
  
  public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithYellowCards(boolean bSortedByName, boolean bSortedByYellowCards) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayersWithYellowCards(bSortedByName, bSortedByYellowCards);
  }
  
  public eu.dataaccess.footballpool.TPlayersWithCards[] allPlayersWithRedCards(boolean bSortedByName, boolean bSortedByRedCards) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayersWithRedCards(bSortedByName, bSortedByRedCards);
  }
  
  public eu.dataaccess.footballpool.TCardInfo[] allCards() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allCards();
  }
  
  public java.lang.String[] cities() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.cities();
  }
  
  public java.lang.String[] stadiumNames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumNames();
  }
  
  public java.lang.String stadiumURL(java.lang.String sStadiumName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumURL(sStadiumName);
  }
  
  public eu.dataaccess.footballpool.TStadiumInfo stadiumInfo(java.lang.String sStadiumName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumInfo(sStadiumName);
  }
  
  public eu.dataaccess.footballpool.TStadiumInfo[] allStadiumInfo() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allStadiumInfo();
  }
  
  public eu.dataaccess.footballpool.TFullTeamInfo fullTeamInfo(java.lang.String sTeamName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.fullTeamInfo(sTeamName);
  }
  
  public eu.dataaccess.footballpool.TTeamInfo[] teams() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.teams();
  }
  
  public int groupCount() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupCount();
  }
  
  public eu.dataaccess.footballpool.TGroupInfo[] groups() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groups();
  }
  
  public eu.dataaccess.footballpool.TTeamInfo[] groupCompetitors(java.lang.String sPoule) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupCompetitors(sPoule);
  }
  
  public eu.dataaccess.footballpool.TGroupsCompetitors[] allGroupCompetitors() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allGroupCompetitors();
  }
  
  public eu.dataaccess.footballpool.TGoal[] goalsScored(int iGameId) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.goalsScored(iGameId);
  }
  
  public eu.dataaccess.footballpool.TGameInfo gameInfo(int iGameId) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gameInfo(iGameId);
  }
  
  public eu.dataaccess.footballpool.TGameInfo[] allGames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allGames();
  }
  
  public eu.dataaccess.footballpool.TCountryInfo[] countryNames(boolean bWithCompetitors) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.countryNames(bWithCompetitors);
  }
  
  public int gamesPlayed() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gamesPlayed();
  }
  
  public eu.dataaccess.footballpool.TGameInfo[] gamesPerCity(java.lang.String sCityName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gamesPerCity(sCityName);
  }
  
  public int yellowCardsTotal() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.yellowCardsTotal();
  }
  
  public int redCardsTotal() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.redCardsTotal();
  }
  
  public eu.dataaccess.footballpool.TCards yellowAndRedCardsTotal() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.yellowAndRedCardsTotal();
  }
  
  public eu.dataaccess.footballpool.TGameResultCode[] gameResultCodes() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gameResultCodes();
  }
  
  public eu.dataaccess.footballpool.TCoaches[] coaches() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.coaches();
  }
  
  public int playedAtWorldCup(java.lang.String sTeamName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.playedAtWorldCup(sTeamName);
  }
  
  public eu.dataaccess.footballpool.TTeamCompete[] teamsCompeteList() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.teamsCompeteList();
  }
  
  public eu.dataaccess.footballpool.TGameInfo nextGame() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.nextGame();
  }
  
  public java.util.Date dateOfFirstGame() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.dateOfFirstGame();
  }
  
  public java.util.Date dateOfLastGame() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.dateOfLastGame();
  }
  
  public java.util.Date dateLastGroupGame() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.dateLastGroupGame();
  }
  
  public eu.dataaccess.footballpool.TTournamentInfo tournamentInfo() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.tournamentInfo();
  }
  
  public int numberOfGames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.numberOfGames();
  }
  
  public eu.dataaccess.footballpool.TSignupCount[] signupsPerDate() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.signupsPerDate();
  }
  
  
}