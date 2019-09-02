package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQWithdrawalUpdateInputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalUpdateInputModel
 */
public class BQWithdrawalUpdateInputModel   {
  private BQWithdrawalUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;

  private String consumerLoanFulfillmentArrangementInstanceReference = null;

  private String withdrawalInstanceReference = null;

  private BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private Object withdrawalUpdateActionTaskRecord = null;

  private String withdrawalUpdateActionRequest = null;


  /**
   * Get consumerLoanFulfillmentArrangementInstanceRecord
   * @return consumerLoanFulfillmentArrangementInstanceRecord
  **/

  public BQWithdrawalUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(BQWithdrawalUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
    this.consumerLoanFulfillmentArrangementInstanceRecord = consumerLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Consumer Loan Fulfillment Arrangement instance 
   * @return consumerLoanFulfillmentArrangementInstanceReference
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReference() {
    return consumerLoanFulfillmentArrangementInstanceReference;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReference(String consumerLoanFulfillmentArrangementInstanceReference) {
    this.consumerLoanFulfillmentArrangementInstanceReference = consumerLoanFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawal instance 
   * @return withdrawalInstanceReference
  **/

  public String getWithdrawalInstanceReference() {
    return withdrawalInstanceReference;
  }

  public void setWithdrawalInstanceReference(String withdrawalInstanceReference) {
    this.withdrawalInstanceReference = withdrawalInstanceReference;
  }


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalUpdateInputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return withdrawalUpdateActionTaskRecord
  **/

  public Object getWithdrawalUpdateActionTaskRecord() {
    return withdrawalUpdateActionTaskRecord;
  }

  public void setWithdrawalUpdateActionTaskRecord(Object withdrawalUpdateActionTaskRecord) {
    this.withdrawalUpdateActionTaskRecord = withdrawalUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return withdrawalUpdateActionRequest
  **/

  public String getWithdrawalUpdateActionRequest() {
    return withdrawalUpdateActionRequest;
  }

  public void setWithdrawalUpdateActionRequest(String withdrawalUpdateActionRequest) {
    this.withdrawalUpdateActionRequest = withdrawalUpdateActionRequest;
  }


}

