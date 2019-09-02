package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveInputModel
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveInputModel   {
  private Object consumerLoanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String consumerLoanFulfillmentArrangementRetrieveActionRequest = null;

  private CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord consumerLoanFulfillmentArrangementInstanceReportRecord = null;

  private CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis consumerLoanFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return consumerLoanFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getConsumerLoanFulfillmentArrangementRetrieveActionTaskRecord() {
    return consumerLoanFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setConsumerLoanFulfillmentArrangementRetrieveActionTaskRecord(Object consumerLoanFulfillmentArrangementRetrieveActionTaskRecord) {
    this.consumerLoanFulfillmentArrangementRetrieveActionTaskRecord = consumerLoanFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return consumerLoanFulfillmentArrangementRetrieveActionRequest
  **/

  public String getConsumerLoanFulfillmentArrangementRetrieveActionRequest() {
    return consumerLoanFulfillmentArrangementRetrieveActionRequest;
  }

  public void setConsumerLoanFulfillmentArrangementRetrieveActionRequest(String consumerLoanFulfillmentArrangementRetrieveActionRequest) {
    this.consumerLoanFulfillmentArrangementRetrieveActionRequest = consumerLoanFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get consumerLoanFulfillmentArrangementInstanceReportRecord
   * @return consumerLoanFulfillmentArrangementInstanceReportRecord
  **/

  public CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord getConsumerLoanFulfillmentArrangementInstanceReportRecord() {
    return consumerLoanFulfillmentArrangementInstanceReportRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportRecord(CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord consumerLoanFulfillmentArrangementInstanceReportRecord) {
    this.consumerLoanFulfillmentArrangementInstanceReportRecord = consumerLoanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get consumerLoanFulfillmentArrangementInstanceAnalysis
   * @return consumerLoanFulfillmentArrangementInstanceAnalysis
  **/

  public CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis getConsumerLoanFulfillmentArrangementInstanceAnalysis() {
    return consumerLoanFulfillmentArrangementInstanceAnalysis;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysis(CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis consumerLoanFulfillmentArrangementInstanceAnalysis) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysis = consumerLoanFulfillmentArrangementInstanceAnalysis;
  }


}

