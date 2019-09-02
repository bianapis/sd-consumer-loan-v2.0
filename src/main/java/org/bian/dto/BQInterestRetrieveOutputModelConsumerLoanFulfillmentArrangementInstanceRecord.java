package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord
 */
public class BQInterestRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String consumerLoanNumber = null;

  private String loanType = null;

  private String loanAmount = null;

  private String loanCurrency = null;

  private String loanRateType = null;

  private String loanApplicableRate = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String loanOriginationDate = null;

  private String loanMaturityDate = null;

  private String loanOutstandingBalance = null;

  private CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627305  bian-reference: LoanProduct  general-info: Reference to the loan product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725  bian-reference: LoanAccount (as Account).AccountIdentification  general-info: The associated loan account number in any suitable format 
   * @return consumerLoanNumber
  **/

  public String getConsumerLoanNumber() {
    return consumerLoanNumber;
  }

  public void setConsumerLoanNumber(String consumerLoanNumber) {
    this.consumerLoanNumber = consumerLoanNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific type of loan (e.g. term, revolving, evergreen) 
   * @return loanType
  **/

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ  bian-reference: LoanAgreement.LoanAmount  general-info: The amount of the loan 
   * @return loanAmount
  **/

  public String getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(String loanAmount) {
    this.loanAmount = loanAmount;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ  bian-reference: LoanAccount (as Account).AccountCurrency  general-info: The currency for the loan account 
   * @return loanCurrency
  **/

  public String getLoanCurrency() {
    return loanCurrency;
  }

  public void setLoanCurrency(String loanCurrency) {
    this.loanCurrency = loanCurrency;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fd5lKcTGEeChad0JzLk7QA_-958104524/elements/_FeNHIMTGEeChad0JzLk7QA_-12422289  bian-reference: LoanArrangement(as InterestArrangement).InterestType  general-info: The rate type to be applied to the loan 
   * @return loanRateType
  **/

  public String getLoanRateType() {
    return loanRateType;
  }

  public void setLoanRateType(String loanRateType) {
    this.loanRateType = loanRateType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXgCNMTGEeChad0JzLk7QA_-129916673  bian-reference: LoanArrangement(as InterestArrangement).InterestRate  general-info: The applicable rate for the loan 
   * @return loanApplicableRate
  **/

  public String getLoanApplicableRate() {
    return loanApplicableRate;
  }

  public void setLoanApplicableRate(String loanApplicableRate) {
    this.loanApplicableRate = loanApplicableRate;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: LoanArrangement(as InterestArrangement).InterestType  general-info: The type of interest to be applied (e.g. prime plus) 
   * @return interestType
  **/

  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-sTGEeChad0JzLk7QA_-1579176164  bian-reference: LoanArrangement(as InterestArrangement).InterestModality  general-info: The accrual method applied to interest calculations 
   * @return interestAccrualMethod
  **/

  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FPv0acTGEeChad0JzLk7QA_-150026816/elements/_Fey9AMTGEeChad0JzLk7QA_300376414  bian-reference: LoanArrangement.OriginationDate  general-info: The origination date for the loan 
   * @return loanOriginationDate
  **/

  public String getLoanOriginationDate() {
    return loanOriginationDate;
  }

  public void setLoanOriginationDate(String loanOriginationDate) {
    this.loanOriginationDate = loanOriginationDate;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FPv0acTGEeChad0JzLk7QA_-150026816/elements/_FP5lYcTGEeChad0JzLk7QA_-943816417  bian-reference: LoanArrangement.MaturityDate  general-info: The planned maturity date of the loan 
   * @return loanMaturityDate
  **/

  public String getLoanMaturityDate() {
    return loanMaturityDate;
  }

  public void setLoanMaturityDate(String loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhMTGEeChad0JzLk7QA_-552935123  bian-reference: LoanAccount (as Account).AccountBalance  general-info: The outstanding balance 
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

