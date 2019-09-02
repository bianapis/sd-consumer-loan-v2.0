package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRestructuringInitiateInputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateInputModel
 */
public class BQRestructuringInitiateInputModel   {
  private BQRestructuringInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;

  private String consumerLoanFulfillmentArrangementInstanceReference = null;

  private Object restructuringInitiateActionRecord = null;

  private BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord = null;


  /**
   * Get consumerLoanFulfillmentArrangementInstanceRecord
   * @return consumerLoanFulfillmentArrangementInstanceRecord
  **/

  public BQRestructuringInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(BQRestructuringInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return restructuringInitiateActionRecord
  **/

  public Object getRestructuringInitiateActionRecord() {
    return restructuringInitiateActionRecord;
  }

  public void setRestructuringInitiateActionRecord(Object restructuringInitiateActionRecord) {
    this.restructuringInitiateActionRecord = restructuringInitiateActionRecord;
  }


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateInputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


}

