package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementUpdateOutputModel
 */
public class CRConsumerLoanFulfillmentArrangementUpdateOutputModel   {
  private CRConsumerLoanFulfillmentArrangementUpdateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;

  private String consumerLoanFulfillmentArrangementUpdateActionTaskReference = null;

  private Object consumerLoanFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return consumerLoanFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getConsumerLoanFulfillmentArrangementUpdateActionTaskReference() {
    return consumerLoanFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setConsumerLoanFulfillmentArrangementUpdateActionTaskReference(String consumerLoanFulfillmentArrangementUpdateActionTaskReference) {
    this.consumerLoanFulfillmentArrangementUpdateActionTaskReference = consumerLoanFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

