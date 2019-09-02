package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementInitiateOutputModelConsumerLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementInitiateOutputModel
 */
public class CRConsumerLoanFulfillmentArrangementInitiateOutputModel   {
  private String consumerLoanFulfillmentArrangementInstanceReference = null;

  private String consumerLoanFulfillmentArrangementInitiateActionReference = null;

  private Object consumerLoanFulfillmentArrangementInitiateActionRecord = null;

  private String consumerLoanFulfillmentArrangementInstanceStatus = null;

  private CRConsumerLoanFulfillmentArrangementInitiateOutputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consumer Loan Fulfillment Arrangement instance 
   * @return consumerLoanFulfillmentArrangementInstanceReference
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReference() {
    return consumerLoanFulfillmentArrangementInstanceReference;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReference(String consumerLoanFulfillmentArrangementInstanceReference) {
    this.consumerLoanFulfillmentArrangementInstanceReference = consumerLoanFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return consumerLoanFulfillmentArrangementInitiateActionReference
  **/

  public String getConsumerLoanFulfillmentArrangementInitiateActionReference() {
    return consumerLoanFulfillmentArrangementInitiateActionReference;
  }

  public void setConsumerLoanFulfillmentArrangementInitiateActionReference(String consumerLoanFulfillmentArrangementInitiateActionReference) {
    this.consumerLoanFulfillmentArrangementInitiateActionReference = consumerLoanFulfillmentArrangementInitiateActionReference;
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

  public CRConsumerLoanFulfillmentArrangementInitiateOutputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(CRConsumerLoanFulfillmentArrangementInitiateOutputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
    this.consumerLoanFulfillmentArrangementInstanceRecord = consumerLoanFulfillmentArrangementInstanceRecord;
  }


}

