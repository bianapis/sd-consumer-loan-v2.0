package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount   {
  private String accrualFeeType = null;

  private String accrualFeeCharge = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: AccuredFeeType  general-info: The fee or penalty type being tracked 
   * @return accrualFeeType
  **/

  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_FMxY4MTGEeChad0JzLk7QA_1441631849  bian-reference: AccuredFeeAmount `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_5NR-UJtsEeG3aNA_yZwEkA  bian-reference:  `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_FMxY4sTGEeChad0JzLk7QA_1442552065  bian-reference:   general-info: The accrued amount of fees and penalties 
   * @return accrualFeeCharge
  **/

  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


}

