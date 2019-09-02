package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord
 */
public class BQDisbursementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String consumerLoanNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String loanOriginationDate = null;

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
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046  bian-reference: LoanAccount (as Account).AccountInvolvement (as Account Owner)  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/dictionaryModel/repositorySearch.xhtml#query=LEi/status=ANY/object=BUSINESS_ELEMENT  bian-reference: LoanAccount (as Account).AccountInvolvementAsPartyRole.Party.PartyIdentification(as LegalEntityIdentifier)  general-info: The legal entity reference for the borrower, likely to be the same as customer 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
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

