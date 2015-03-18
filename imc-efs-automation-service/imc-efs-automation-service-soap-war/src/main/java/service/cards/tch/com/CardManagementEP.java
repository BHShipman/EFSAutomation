/**
 * CardManagementEP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.cards.tch.com;

public interface CardManagementEP extends java.rmi.Remote {
    public service.cards.tch.com.types.WSCarrierInfo getCarrierInfo(java.lang.String clientId) throws java.rmi.RemoteException;
    public int createNewPolicy(java.lang.String clientId) throws java.rmi.RemoteException;
    public void deleteOverride(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCard getCard(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCard getCardByDriverId(java.lang.String clientId, java.lang.String driverId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSSmartPayDriver getSmartPayDriver(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCardDescription[] getCardDescriptions(java.lang.String clientId, java.util.Calendar createdSince) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCashRecord[] getCashHistory(java.lang.String clientId, java.lang.String cardNumber, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCashRecord[] getPayrollCashHistory(java.lang.String clientId, java.lang.String cardNumber, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSContract[] getContracts(java.lang.String clientId) throws java.rmi.RemoteException;
    public double[] getCurrentCashAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException;
    public double[] getCurrentPayrollCashAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMoneyCodeHistRec getMoneyCode(java.lang.String clientId, java.lang.String alphaCode) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMoneyCodeUse[] getMoneyCodeUse(java.lang.String clientId, int contractId, int masterContractId, java.util.Calendar begDate, java.util.Calendar endDate, boolean issued) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMoneyCodeHistRec[] getMoneyCodes(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSPolicy getPolicy(java.lang.String clientId, int policyNumber) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSPolicyDescription[] getPolicyDescriptions(java.lang.String clientId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSProductGroup[] getProductGroups(java.lang.String clientId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSProduct[] getProducts(java.lang.String clientId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransLocation[] getTransLocations(java.lang.String clientId, int[] locationIds) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransLocation[] getTransLocationsForPolicy(java.lang.String clientId, int policyNum) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransLocation[] getTransLocationsForCard(java.lang.String clientId, java.lang.String cardNum) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSLocationGroup[] getLocationGroups(java.lang.String clientId, java.lang.String cardNum, int policyNum) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransaction[] getTransactions(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransactionExt[] getTransactionsExt(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransaction[] getChildTransactions(java.lang.String parentClientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransaction[] getOneCarrierChildTransaction(java.lang.String parentClientId, int childCarrierId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMoneyCode issueMoneyCode(java.lang.String clientId, int contractId, int masterContractId, double amount, boolean feeType, java.lang.String issuedTo, java.lang.String notes, java.lang.String currency) throws java.rmi.RemoteException;
    public void loadCash(java.lang.String clientId, java.lang.String cardNumber, double amount, java.lang.String refNumber, boolean payroll) throws java.rmi.RemoteException;
    public void loadCashDriverId(java.lang.String clientId, java.lang.String driverId, double amount, java.lang.String refNumber, boolean payroll) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;
    public void logout(java.lang.String clientId) throws java.rmi.RemoteException;
    public void removeCard(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public void setCard(java.lang.String clientId, service.cards.tch.com.types.WSCard card) throws java.rmi.RemoteException;
    public void setSmartPayDriver(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayDriver smartPayDriver) throws java.rmi.RemoteException;
    public void setPolicy(java.lang.String clientId, service.cards.tch.com.types.WSPolicy policy) throws java.rmi.RemoteException;
    public void createSmartPayTransferAccount(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayTransferDefinition account) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSSmartPayTransferAccount[] getSmartPayTransferAccounts(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public void deleteSmartPayTransferAccount(java.lang.String clientId, int accountId) throws java.rmi.RemoteException;
    public void setSmartPayTransferAccount(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayTransferAccount account) throws java.rmi.RemoteException;
    public void transferCard(java.lang.String clientId, java.lang.String fromCard, java.lang.String toCard) throws java.rmi.RemoteException;
    public void createSmartPayScheduledTransfer(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayScheduledTransferDefinition transferDefinition) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSSmartPayScheduledTransfer[] getSmartPayScheduledTransfers(java.lang.String clientId, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public void deleteSmartPayScheduledTransfer(java.lang.String clientId, int transferId) throws java.rmi.RemoteException;
    public void voidMoneyCode(java.lang.String clientId, java.lang.String moneyCode) throws java.rmi.RemoteException;
    public java.lang.String[] getPromptTypes(java.lang.String clientId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTransSummary transSummary(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMoneyCodeSummary moneyCodeSummary(java.lang.String clientId, java.util.Calendar begDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCardSummary[] getCardSummaries(java.lang.String clientId, service.cards.tch.com.types.WSCardSummaryReq request) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSCreditLimits getCreditLimits(java.lang.String clientId, int contractId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSTranReject[] getTranRejects(java.lang.String clientId, service.cards.tch.com.types.WSTranRejectSearch search) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSLastMileage[] getLastMileage(java.lang.String clientId, service.cards.tch.com.types.WSLastMileageSearch search) throws java.rmi.RemoteException;
    public void overrideLastMileage(java.lang.String clientId, java.lang.String unit, java.lang.String code, int mileage) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSLocation[] searchLocation(java.lang.String clientId, service.cards.tch.com.types.WSLocationSearch search) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSGeoPriceLocation[] getGeoPriceLocations(java.lang.String clientId, java.lang.String cardNumber, java.lang.String latitude, java.lang.String longitude, java.lang.String searchRange, boolean taxFlag) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSGeoPriceLocation[] getInterstatePriceLocations(java.lang.String clientId, java.lang.String cardNumber, java.lang.String interstates, java.lang.String states, boolean taxFlag) throws java.rmi.RemoteException;
    public boolean verifyUser(java.lang.String user, java.lang.String code) throws java.rmi.RemoteException;
    public int doSmartPayAchTransfer(java.lang.String clientId, service.cards.tch.com.types.WSSmartPayAchTransfer transfer) throws java.rmi.RemoteException;
    public boolean verifySmartPayTransfer(java.lang.String clientId, service.cards.tch.com.types.WSVerifySmartPayTransfer amounts) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSSmartPayTransferHistory[] smartPayTransferHistory(java.lang.String clientId, java.lang.String cardNumber, int count) throws java.rmi.RemoteException;
    public void cancelPendingTransfer(java.lang.String clientId, long ppdDetailId) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSMobileSecurity[] getMobileRoles(java.lang.String clientId, java.lang.String application) throws java.rmi.RemoteException;
    public java.lang.String[] ivrLogin(java.lang.String carrierId, java.lang.String passwd, java.lang.String userId) throws java.rmi.RemoteException;
    public void managedFuelAction(java.lang.String clientId, service.cards.tch.com.types.WSManagedFuel managedFuel) throws java.rmi.RemoteException;
    public void managedFuelDriverAction(java.lang.String clientId, service.cards.tch.com.types.WSManagedFuelDriver managedFuelDriver) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSAllCashAvail[] getCurrentCashAllAmounts(java.lang.String clientId, java.lang.String[] cardNumbers) throws java.rmi.RemoteException;
    public service.cards.tch.com.types.WSRegisteredCheckAuthorizationResponse registerCheck(java.lang.String clientId, service.cards.tch.com.types.WSRegisterCheckAuthorization registerCheckAuthorizaiton) throws java.rmi.RemoteException;
    public void registerCardPosition(java.lang.String clientId, java.lang.String cardNum, java.lang.String latitude, java.lang.String longitude, java.lang.String unitNum, java.lang.String source) throws java.rmi.RemoteException;
    public boolean doesCardPosition(java.lang.String clientId) throws java.rmi.RemoteException;
    public void validCard(java.lang.String cardNumber, java.lang.String pin, java.lang.String driverId, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder carrierId) throws java.rmi.RemoteException;
    public java.util.Calendar serverTime(java.lang.String clientId) throws java.rmi.RemoteException;
    public void signupScale(java.lang.String cardNumber, java.lang.String driverId, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder carrierId) throws java.rmi.RemoteException;
}
