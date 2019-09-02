package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementControlInputModelConsumerLoanFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementControlInputModel
 */
public class CRConsumerLoanFulfillmentArrangementControlInputModel   {
  private String consumerLoanServicingSessionReference = null;

  private String consumerLoanFulfillmentArrangementInstanceReference = null;

  private Object consumerLoanFulfillmentArrangementControlActionTaskRecord = null;

  private CRConsumerLoanFulfillmentArrangementControlInputModelConsumerLoanFulfillmentArrangementControlActionRequest consumerLoanFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return consumerLoanFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getConsumerLoanFulfillmentArrangementControlActionTaskRecord() {
    return consumerLoanFulfillmentArrangementControlActionTaskRecord;
  }

  public void setConsumerLoanFulfillmentArrangementControlActionTaskRecord(Object consumerLoanFulfillmentArrangementControlActionTaskRecord) {
    this.consumerLoanFulfillmentArrangementControlActionTaskRecord = consumerLoanFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get consumerLoanFulfillmentArrangementControlActionRequest
   * @return consumerLoanFulfillmentArrangementControlActionRequest
  **/

  public CRConsumerLoanFulfillmentArrangementControlInputModelConsumerLoanFulfillmentArrangementControlActionRequest getConsumerLoanFulfillmentArrangementControlActionRequest() {
    return consumerLoanFulfillmentArrangementControlActionRequest;
  }

  public void setConsumerLoanFulfillmentArrangementControlActionRequest(CRConsumerLoanFulfillmentArrangementControlInputModelConsumerLoanFulfillmentArrangementControlActionRequest consumerLoanFulfillmentArrangementControlActionRequest) {
    this.consumerLoanFulfillmentArrangementControlActionRequest = consumerLoanFulfillmentArrangementControlActionRequest;
  }


}

