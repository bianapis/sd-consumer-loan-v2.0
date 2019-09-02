package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRConsumerLoanFulfillmentArrangementRetrieveOutputModelConsumerLoanFulfillmentArrangementInstanceReportRecord   {
  private String consumerLoanFulfillmentArrangementInstanceReportData = null;

  private String consumerLoanFulfillmentArrangementInstanceReportType = null;

  private Object consumerLoanFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return consumerLoanFulfillmentArrangementInstanceReportData
  **/

  public String getConsumerLoanFulfillmentArrangementInstanceReportData() {
    return consumerLoanFulfillmentArrangementInstanceReportData;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReportData(String consumerLoanFulfillmentArrangementInstanceReportData) {
    this.consumerLoanFulfillmentArrangementInstanceReportData = consumerLoanFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return consumerLoanFulfillmentArrangementInstanceReport
  **/

  public Object getConsumerLoanFulfillmentArrangementInstanceReport() {
    return consumerLoanFulfillmentArrangementInstanceReport;
  }

  public void setConsumerLoanFulfillmentArrangementInstanceReport(Object consumerLoanFulfillmentArrangementInstanceReport) {
    this.consumerLoanFulfillmentArrangementInstanceReport = consumerLoanFulfillmentArrangementInstanceReport;
  }


}

