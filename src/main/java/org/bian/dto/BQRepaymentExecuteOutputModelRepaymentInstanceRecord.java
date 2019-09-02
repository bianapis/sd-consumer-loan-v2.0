package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentExecuteOutputModelRepaymentInstanceRecord
 */
public class BQRepaymentExecuteOutputModelRepaymentInstanceRecord   {
  private String repaymentTransactionValueDate = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The value date for the repayment transaction 
   * @return repaymentTransactionValueDate
  **/

  public String getRepaymentTransactionValueDate() {
    return repaymentTransactionValueDate;
  }

  public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
  }


}

