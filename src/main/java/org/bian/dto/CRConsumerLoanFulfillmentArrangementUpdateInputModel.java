package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementUpdateInputModel
 */
public class CRConsumerLoanFulfillmentArrangementUpdateInputModel   {
  private String consumerLoanServicingSessionReference = null;

  private String consumerLoanFulfillmentArrangementInstanceReference = null;

  private CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;

  private Object consumerLoanFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get consumerLoanFulfillmentArrangementInstanceRecord
   * @return consumerLoanFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
    this.consumerLoanFulfillmentArrangementInstanceRecord = consumerLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consumerLoanFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getConsumerLoanFulfillmentArrangementUpdateActionTaskRecord() {
    return consumerLoanFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setConsumerLoanFulfillmentArrangementUpdateActionTaskRecord(Object consumerLoanFulfillmentArrangementUpdateActionTaskRecord) {
    this.consumerLoanFulfillmentArrangementUpdateActionTaskRecord = consumerLoanFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

