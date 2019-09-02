package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceReportRecord   {
  private String consumerLoanFulfillmentArrangementInstanceReportReference = null;

  private String consumerLoanFulfillmentArrangementInstanceReportType = null;

  private String consumerLoanFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return consumerLoanFulfillmentArrangementInstanceReportReference
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReportReference() {
    return consumerLoanFulfillmentArrangementInstanceReportReference;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportReference(String consumerLoanFulfillmentArrangementInstanceReportReference) {
    this.consumerLoanFulfillmentArrangementInstanceReportReference = consumerLoanFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return consumerLoanFulfillmentArrangementInstanceReportType
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReportType() {
    return consumerLoanFulfillmentArrangementInstanceReportType;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportType(String consumerLoanFulfillmentArrangementInstanceReportType) {
    this.consumerLoanFulfillmentArrangementInstanceReportType = consumerLoanFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return consumerLoanFulfillmentArrangementInstanceReportParameters
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReportParameters() {
    return consumerLoanFulfillmentArrangementInstanceReportParameters;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportParameters(String consumerLoanFulfillmentArrangementInstanceReportParameters) {
    this.consumerLoanFulfillmentArrangementInstanceReportParameters = consumerLoanFulfillmentArrangementInstanceReportParameters;
  }


}

