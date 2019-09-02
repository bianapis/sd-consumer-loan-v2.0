package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveInputModelConsumerLoanFulfillmentArrangementInstanceAnalysis   {
  private String consumerLoanFulfillmentArrangementInstanceAnalysisReference = null;

  private String consumerLoanFulfillmentArrangementInstanceAnalysisReportType = null;

  private String consumerLoanFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return consumerLoanFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceAnalysisReference() {
    return consumerLoanFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysisReference(String consumerLoanFulfillmentArrangementInstanceAnalysisReference) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysisReference = consumerLoanFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return consumerLoanFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceAnalysisReportType() {
    return consumerLoanFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysisReportType(String consumerLoanFulfillmentArrangementInstanceAnalysisReportType) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysisReportType = consumerLoanFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return consumerLoanFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceAnalysisParameters() {
    return consumerLoanFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysisParameters(String consumerLoanFulfillmentArrangementInstanceAnalysisParameters) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysisParameters = consumerLoanFulfillmentArrangementInstanceAnalysisParameters;
  }


}

