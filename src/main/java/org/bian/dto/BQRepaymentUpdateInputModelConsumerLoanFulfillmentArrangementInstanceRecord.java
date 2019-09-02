package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord
 */
public class BQRepaymentUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord   {
  private String loanOutstandingBalance = null;

  private CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


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

