package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction   {
  private String transactionFeeType = null;

  private String transactionFeeCharge = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeType  general-info: The fee or penalty type applied 
   * @return transactionFeeType
  **/

  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_FMxY4MTGEeChad0JzLk7QA_1441631849  bian-reference: FeeAmount `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_FMxY4sTGEeChad0JzLk7QA_1442552065  bian-reference:  `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_5NR-UJtsEeG3aNA_yZwEkA  bian-reference:   general-info: The derived fee or penalty amount applied 
   * @return transactionFeeCharge
  **/

  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }


}

