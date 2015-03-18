package service.cards.tch.com;

public class CardManagementEPProxy implements service.cards.tch.com.CardManagementEP {
  private String _endpoint = null;
  private service.cards.tch.com.CardManagementEP cardManagementEP = null;
  
  public CardManagementEPProxy() {
    _initCardManagementEPProxy();
  }
  
  public CardManagementEPProxy(String endpoint) {
    _endpoint = endpoint;
    _initCardManagementEPProxy();
  }
  
  private void _initCardManagementEPProxy() {
    try {
      cardManagementEP = (new service.cards.tch.com.CardManagementWSLocator()).getCardManagementEPPort();
      if (cardManagementEP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cardManagementEP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cardManagementEP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cardManagementEP != null)
      ((javax.xml.rpc.Stub)cardManagementEP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.cards.tch.com.CardManagementEP getCardManagementEP() {
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP;
  }
  
  public service.cards.tch.com.types.WSCarrierInfo getCarrierInfo(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCarrierInfo(clientId);
  }
  
  public int createNewPolicy(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.createNewPolicy(clientId);
  }
  
  public void deleteOverride(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.deleteOverride(clientId, cardNumber);
  }
  
  public service.cards.tch.com.types.WSCard getCard(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCard(clientId, cardNumber);
  }
  
  public service.cards.tch.com.types.WSCard getCardByDriverId(java.lang.String clientId, java.lang.String driverId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCardByDriverId(clientId, driverId);
  }
  
  public service.cards.tch.com.types.WSSmartPayDriver getSmartPayDriver(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getSmartPayDriver(clientId, cardNumber);
  }
  
  public service.cards.tch.com.types.WSCardDescription[] getCardDescriptions(java.lang.String clientId, java.util.Calendar createdSince) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCardDescriptions(clientId, createdSince);
  }
  
  public service.cards.tch.com.types.WSCashRecord[] getCashHistory(java.lang.String clientId, java.lang.String cardNumber, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCashHistory(clientId, cardNumber, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSCashRecord[] getPayrollCashHistory(java.lang.String clientId, java.lang.String cardNumber, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getPayrollCashHistory(clientId, cardNumber, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSContract[] getContracts(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getContracts(clientId);
  }
  
  public double[] getCurrentCashAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCurrentCashAmounts(clientId, cardNumbers);
  }
  
  public double[] getCurrentPayrollCashAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCurrentPayrollCashAmounts(clientId, cardNumbers);
  }
  
  public service.cards.tch.com.types.WSMoneyCodeHistRec getMoneyCode(java.lang.String clientId, java.lang.String alphaCode) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getMoneyCode(clientId, alphaCode);
  }
  
  public service.cards.tch.com.types.WSMoneyCodeUse[] getMoneyCodeUse(java.lang.String clientId, int contractId, int masterContractId, java.util.Calendar begDate, java.util.Calendar endDate, boolean issued) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getMoneyCodeUse(clientId, contractId, masterContractId, begDate, endDate, issued);
  }
  
  public service.cards.tch.com.types.WSMoneyCodeHistRec[] getMoneyCodes(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getMoneyCodes(clientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSPolicy getPolicy(java.lang.String clientId, int policyNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getPolicy(clientId, policyNumber);
  }
  
  public service.cards.tch.com.types.WSPolicyDescription[] getPolicyDescriptions(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getPolicyDescriptions(clientId);
  }
  
  public service.cards.tch.com.types.WSProductGroup[] getProductGroups(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getProductGroups(clientId);
  }
  
  public service.cards.tch.com.types.WSProduct[] getProducts(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getProducts(clientId);
  }
  
  public service.cards.tch.com.types.WSTransLocation[] getTransLocations(java.lang.String clientId, int[] locationIds) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTransLocations(clientId, locationIds);
  }
  
  public service.cards.tch.com.types.WSTransLocation[] getTransLocationsForPolicy(java.lang.String clientId, int policyNum) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTransLocationsForPolicy(clientId, policyNum);
  }
  
  public service.cards.tch.com.types.WSTransLocation[] getTransLocationsForCard(java.lang.String clientId, java.lang.String cardNum) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTransLocationsForCard(clientId, cardNum);
  }
  
  public service.cards.tch.com.types.WSLocationGroup[] getLocationGroups(java.lang.String clientId, java.lang.String cardNum, int policyNum) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getLocationGroups(clientId, cardNum, policyNum);
  }
  
  public service.cards.tch.com.types.WSTransaction[] getTransactions(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTransactions(clientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSTransactionExt[] getTransactionsExt(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTransactionsExt(clientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSTransaction[] getChildTransactions(java.lang.String parentClientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getChildTransactions(parentClientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSTransaction[] getOneCarrierChildTransaction(java.lang.String parentClientId, int childCarrierId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getOneCarrierChildTransaction(parentClientId, childCarrierId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSMoneyCode issueMoneyCode(java.lang.String clientId, int contractId, int masterContractId, double amount, boolean feeType, java.lang.String issuedTo, java.lang.String notes, java.lang.String currency) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.issueMoneyCode(clientId, contractId, masterContractId, amount, feeType, issuedTo, notes, currency);
  }
  
  public void loadCash(java.lang.String clientId, java.lang.String cardNumber, double amount, java.lang.String refNumber, boolean payroll) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.loadCash(clientId, cardNumber, amount, refNumber, payroll);
  }
  
  public void loadCashDriverId(java.lang.String clientId, java.lang.String driverId, double amount, java.lang.String refNumber, boolean payroll) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.loadCashDriverId(clientId, driverId, amount, refNumber, payroll);
  }
  
  public java.lang.String login(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.login(user, password);
  }
  
  public void logout(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.logout(clientId);
  }
  
  public void removeCard(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.removeCard(clientId, cardNumber);
  }
  
  public void setCard(java.lang.String clientId, service.cards.tch.com.types.WSCard card) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.setCard(clientId, card);
  }
  
  public void setSmartPayDriver(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayDriver smartPayDriver) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.setSmartPayDriver(clientId, smartPayDriver);
  }
  
  public void setPolicy(java.lang.String clientId, service.cards.tch.com.types.WSPolicy policy) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.setPolicy(clientId, policy);
  }
  
  public void createSmartPayTransferAccount(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayTransferDefinition account) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.createSmartPayTransferAccount(clientId, account);
  }
  
  public service.cards.tch.com.types.WSSmartPayTransferAccount[] getSmartPayTransferAccounts(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getSmartPayTransferAccounts(clientId, cardNumber);
  }
  
  public void deleteSmartPayTransferAccount(java.lang.String clientId, int accountId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.deleteSmartPayTransferAccount(clientId, accountId);
  }
  
  public void setSmartPayTransferAccount(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayTransferAccount account) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.setSmartPayTransferAccount(clientId, account);
  }
  
  public void transferCard(java.lang.String clientId, java.lang.String fromCard, java.lang.String toCard) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.transferCard(clientId, fromCard, toCard);
  }
  
  public void createSmartPayScheduledTransfer(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayScheduledTransferDefinition transferDefinition) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.createSmartPayScheduledTransfer(clientId, transferDefinition);
  }
  
  public service.cards.tch.com.types.WSSmartPayScheduledTransfer[] getSmartPayScheduledTransfers(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getSmartPayScheduledTransfers(clientId, cardNumber);
  }
  
  public void deleteSmartPayScheduledTransfer(java.lang.String clientId, int transferId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.deleteSmartPayScheduledTransfer(clientId, transferId);
  }
  
  public void voidMoneyCode(java.lang.String clientId, java.lang.String moneyCode) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.voidMoneyCode(clientId, moneyCode);
  }
  
  public java.lang.String[] getPromptTypes(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getPromptTypes(clientId);
  }
  
  public service.cards.tch.com.types.WSTransSummary transSummary(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.transSummary(clientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSMoneyCodeSummary moneyCodeSummary(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.moneyCodeSummary(clientId, begDate, endDate);
  }
  
  public service.cards.tch.com.types.WSCardSummary[] getCardSummaries(java.lang.String clientId, service.cards.tch.com.types.WSCardSummaryReq request) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCardSummaries(clientId, request);
  }
  
  public service.cards.tch.com.types.WSCreditLimits getCreditLimits(java.lang.String clientId, int contractId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCreditLimits(clientId, contractId);
  }
  
  public service.cards.tch.com.types.WSTranReject[] getTranRejects(java.lang.String clientId, service.cards.tch.com.types.WSTranRejectSearch search) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getTranRejects(clientId, search);
  }
  
  public service.cards.tch.com.types.WSLastMileage[] getLastMileage(java.lang.String clientId, service.cards.tch.com.types.WSLastMileageSearch search) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getLastMileage(clientId, search);
  }
  
  public void overrideLastMileage(java.lang.String clientId, java.lang.String unit, java.lang.String code, int mileage) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.overrideLastMileage(clientId, unit, code, mileage);
  }
  
  public service.cards.tch.com.types.WSLocation[] searchLocation(java.lang.String clientId, service.cards.tch.com.types.WSLocationSearch search) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.searchLocation(clientId, search);
  }
  
  public service.cards.tch.com.types.WSGeoPriceLocation[] getGeoPriceLocations(java.lang.String clientId, java.lang.String cardNumber, java.lang.String latitude, java.lang.String longitude, java.lang.String searchRange, boolean taxFlag) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getGeoPriceLocations(clientId, cardNumber, latitude, longitude, searchRange, taxFlag);
  }
  
  public service.cards.tch.com.types.WSGeoPriceLocation[] getInterstatePriceLocations(java.lang.String clientId, java.lang.String cardNumber, java.lang.String interstates, java.lang.String states, boolean taxFlag) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getInterstatePriceLocations(clientId, cardNumber, interstates, states, taxFlag);
  }
  
  public boolean verifyUser(java.lang.String user, java.lang.String code) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.verifyUser(user, code);
  }
  
  public int doSmartPayAchTransfer(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayAchTransfer transfer) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.doSmartPayAchTransfer(clientId, transfer);
  }
  
  public boolean verifySmartPayTransfer(java.lang.String clientId, service.cards.tch.com.types.WSVerifySmartPayTransfer amounts) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.verifySmartPayTransfer(clientId, amounts);
  }
  
  public service.cards.tch.com.types.WSSmartPayTransferHistory[] smartPayTransferHistory(java.lang.String clientId, java.lang.String cardNumber, int count) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.smartPayTransferHistory(clientId, cardNumber, count);
  }
  
  public void cancelPendingTransfer(java.lang.String clientId, long ppdDetailId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.cancelPendingTransfer(clientId, ppdDetailId);
  }
  
  public service.cards.tch.com.types.WSMobileSecurity[] getMobileRoles(java.lang.String clientId, java.lang.String application) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getMobileRoles(clientId, application);
  }
  
  public java.lang.String[] ivrLogin(java.lang.String carrierId, java.lang.String passwd, java.lang.String userId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.ivrLogin(carrierId, passwd, userId);
  }
  
  public void managedFuelAction(java.lang.String clientId, service.cards.tch.com.types.WSManagedFuel managedFuel) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.managedFuelAction(clientId, managedFuel);
  }
  
  public void managedFuelDriverAction(java.lang.String clientId, service.cards.tch.com.types.WSManagedFuelDriver managedFuelDriver) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.managedFuelDriverAction(clientId, managedFuelDriver);
  }
  
  public service.cards.tch.com.types.WSAllCashAvail[] getCurrentCashAllAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.getCurrentCashAllAmounts(clientId, cardNumbers);
  }
  
  public service.cards.tch.com.types.WSRegisteredCheckAuthorizationResponse registerCheck(java.lang.String clientId, service.cards.tch.com.types.WSRegisterCheckAuthorization registerCheckAuthorizaiton) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.registerCheck(clientId, registerCheckAuthorizaiton);
  }
  
  public void registerCardPosition(java.lang.String clientId, java.lang.String cardNum, java.lang.String latitude, java.lang.String longitude, java.lang.String unitNum, java.lang.String source) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.registerCardPosition(clientId, cardNum, latitude, longitude, unitNum, source);
  }
  
  public boolean doesCardPosition(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.doesCardPosition(clientId);
  }
  
  public void validCard(java.lang.String cardNumber, java.lang.String pin, java.lang.String driverId, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder carrierId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.validCard(cardNumber, pin, driverId, result, carrierId);
  }
  
  public java.util.Calendar serverTime(java.lang.String clientId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    return cardManagementEP.serverTime(clientId);
  }
  
  public void signupScale(java.lang.String cardNumber, java.lang.String driverId, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder carrierId) throws java.rmi.RemoteException{
    if (cardManagementEP == null)
      _initCardManagementEPProxy();
    cardManagementEP.signupScale(cardNumber, driverId, result, carrierId);
  }
  
  
}