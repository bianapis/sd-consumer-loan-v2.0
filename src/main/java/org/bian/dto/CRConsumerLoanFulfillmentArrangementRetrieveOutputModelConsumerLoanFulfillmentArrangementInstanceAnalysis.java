package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceAnalysis   {
  private String consumerLoanFulfillmentArrangementInstanceAnalysisData = null;

  private String consumerLoanFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object consumerLoanFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return consumerLoanFulfillmentArrangementInstanceAnalysisData
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceAnalysisData() {
    return consumerLoanFulfillmentArrangementInstanceAnalysisData;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysisData(String consumerLoanFulfillmentArrangementInstanceAnalysisData) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysisData = consumerLoanFulfillmentArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return consumerLoanFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getConsumerLoanFulfillmentArrangementInstanceAnalysisReport() {
    return consumerLoanFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceAnalysisReport(Object consumerLoanFulfillmentArrangementInstanceAnalysisReport) {
    this.consumerLoanFulfillmentArrangementInstanceAnalysisReport = consumerLoanFulfillmentArrangementInstanceAnalysisReport;
  }


}

