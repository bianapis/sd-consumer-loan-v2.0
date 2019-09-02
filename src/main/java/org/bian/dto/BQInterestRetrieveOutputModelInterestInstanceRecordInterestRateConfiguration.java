package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration   {
  private String interestRateType = null;

  private String interestRate = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestArrangement.RateType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_Fb9rccTGEeChad0JzLk7QA_1124003257  bian-reference: InterestArrangement.RateType  general-info: Applicable rate type 
   * @return interestRateType
  **/

  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestArrangement.RateType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-sTGEeChad0JzLk7QA_-1579176164  bian-reference: InterestModality `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879  bian-reference:  `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_Fb9rccTGEeChad0JzLk7QA_1124003257  bian-reference: InterestArrangement.RateType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXgCMMTGEeChad0JzLk7QA_-398781619  bian-reference: InterestArrangement.RateTypeValue  general-info: The interest rate value to be applied (note could be variable) 
   * @return interestRate
  **/

  public String getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }


}

