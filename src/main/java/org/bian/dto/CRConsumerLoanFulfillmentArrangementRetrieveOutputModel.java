package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveOutputModel
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveOutputModel   {
  private CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord = null;

  private String consumerLoanFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object consumerLoanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String consumerLoanFulfillmentArrangementRetrieveActionResponse = null;

  private CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord consumerLoanFulfillmentArrangementInstanceReportRecord = null;

  private CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis consumerLoanFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get consumerLoanFulfillmentArrangementInstanceRecord
   * @return consumerLoanFulfillmentArrangementInstanceRecord
  **/

  public CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord getConsumerLoanFulfillmentArrangementInstanceRecord() {
    return consumerLoanFulfillmentArrangementInstanceRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceRecord(CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceRecord consumerLoanFulfillmentArrangementInstanceRecord) {
    this.consumerLoanFulfillmentArrangementInstanceRecord = consumerLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consumer Loan Fulfillment Arrangement instance retrieve service call 
   * @return consumerLoanFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getConsumerLoanFulfillmentArrangementRetrieveActionTaskReference() {
    return consumerLoanFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setConsumerLoanFulfillmentArrangementRetrieveActionTaskReference(String consumerLoanFulfillmentArrangementRetrieveActionTaskReference) {
    this.consumerLoanFulfillmentArrangementRetrieveActionTaskReference = consumerLoanFulfillmentArrangementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return consumerLoanFulfillmentArrangementRetrieveActionResponse
  **/

  public String getConsumerLoanFulfillmentArrangementRetrieveActionResponse() {
    return consumerLoanFulfillmentArrangementRetrieveActionResponse;
  }

  public void setConsumerLoanFulfillmentArrangementRetrieveActionResponse(String consumerLoanFulfillmentArrangementRetrieveActionResponse) {
    this.consumerLoanFulfillmentArrangementRetrieveActionResponse = consumerLoanFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get consumerLoanFulfillmentArrangementInstanceReportRecord
   * @return consumerLoanFulfillmentArrangementInstanceReportRecord
  **/

  public CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord getConsumerLoanFulfillmentArrangementInstanceReportRecord() {
    return consumerLoanFulfillmentArrangementInstanceReportRecord;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportRecord(CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord consumerLoanFulfillmentArrangementInstanceReportRecord) {
    this.consumerLoanFulfillmentArrangementInstanceReportRecord = consumerLoanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get consumerLoanFulfillmentArrangementInstanceAnalysis
   * @return consumerLoanFulfillmentArrangementInstanceAnalysis
  **/

  public CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis getConsumerLoanFulfillmentArrangementInstanceAnalysis() {
    return consumerLoanFulfillmentArrangementInstanceAnalysis;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysis(CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis consumerLoanFulfillmentArrangementInstanceAnalysis) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysis = consumerLoanFulfillmentArrangementInstanceAnalysis;
  }


}

