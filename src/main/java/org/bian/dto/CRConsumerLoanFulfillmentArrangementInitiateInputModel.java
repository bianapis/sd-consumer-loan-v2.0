package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementInitiateInputModel
 */
public class CRConsumerLoanFulfillmentArrangementInitiateInputModel   {
  private String consumerLoanServicingSessionReference = null;

  private Object consumerLoanFulfillmentArrangementInitiateActionRecord = null;

  private String consumerLoanFulfillmentArrangementInstanceStatus = null;

  private CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return consumerLoanServicingSessionReference
  **/

  public String getConsumerLoanServicingSessionReference() {
    return consumerLoanServicingSessionReference;
  }

  public void setConsumerLoanServicingSessionReference(String consumerLoanServicingSessionReference) {
    this.consumerLoanServicingSessionReference = consumerLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return consumerLoanFulfillmentArrangementInitiateActionRecord
  **/

  public Object getConsumerLoanFulfillmentArrangementInitiateActionRecord() {
    return consumerLoanFulfillmentArrangementInitiateActionRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInitiateActionRecord(Object consumerLoanFulfillmentArrangementInitiateActionRecord) {
    this.consumerLoanFulfillmentArrangementInitiateActionRecord = consumerLoanFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Consumer Loan Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return consumerLoanFulfillmentArrangementInstanceStatus
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceStatus() {
    return consumerLoanFulfillmentArrangementInstanceStatus;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceStatus(String consumerLoanFulfillmentArrangementInstanceStatus) {
    this.consumerLoanFulfillmentArrangementInstanceStatus = consumerLoanFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get consumerLoanFulfillmentArrangementInstanceRecord
   * @return consumerLoanFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
    this.consumerLoanFulfillmentArrangementInstanceRecord = consumerLoanFulfillmentArrangementInstanceRecord;
  }


}

