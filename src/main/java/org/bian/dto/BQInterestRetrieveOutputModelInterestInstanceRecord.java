package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord;
import org.bian.dto.BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecord
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecord   {
  private String interestRateType = null;

  private String interestRateApplicationSchedule = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration interestRateConfiguration = null;

  private BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestArrangement.RateType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_Fb9rccTGEeChad0JzLk7QA_1124003257  bian-reference: InterestArrangement.RateType  general-info: The type of rate calculation that can be applied 
   * @return interestRateType
  **/

  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-sTGEeChad0JzLk7QA_-1579176164  bian-reference: InterestModality  general-info: The processing schedule for applying interest rates to the account 
   * @return interestRateApplicationSchedule
  **/

  public String getInterestRateApplicationSchedule() {
    return interestRateApplicationSchedule;
  }

  public void setInterestRateApplicationSchedule(String interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
  }


  /**
   * Get interestRateConfiguration
   * @return interestRateConfiguration
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration getInterestRateConfiguration() {
    return interestRateConfiguration;
  }

  public void setInterestRateConfiguration(BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
  }


  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  **/

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }


}

