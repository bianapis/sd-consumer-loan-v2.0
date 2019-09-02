package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelRepaymentInstanceRecord
 */
public class BQRepaymentRetrieveOutputModelRepaymentInstanceRecord   {
  private String repaymentTransactionType = null;

  private String repaymentTransactionPayerReference = null;

  private String repaymentTransactionPayerProductInstanceReference = null;

  private String repaymentTransactionPayerBankReference = null;

  private String repaymentTransactionAmount = null;

  private String repaymentTransactionCurrency = null;

  private String repaymentTransactionValueDate = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FColc8TGEeChad0JzLk7QA_1437769975  bian-reference: PaymentTransactionType  general-info: The type of repayment (e.g. scheduled repayment, balloon/early termination) 
   * @return repaymentTransactionType
  **/

  public String getRepaymentTransactionType() {
    return repaymentTransactionType;
  }

  public void setRepaymentTransactionType(String repaymentTransactionType) {
    this.repaymentTransactionType = repaymentTransactionType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083  bian-reference: PaymentTransactionPayeeReference  general-info: Reference to the payer 
   * @return repaymentTransactionPayerReference
  **/

  public String getRepaymentTransactionPayerReference() {
    return repaymentTransactionPayerReference;
  }

  public void setRepaymentTransactionPayerReference(String repaymentTransactionPayerReference) {
    this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA  bian-reference: PaymentTransactionPayeeAccountReference  general-info: Reference to the account where the payment is made from 
   * @return repaymentTransactionPayerProductInstanceReference
  **/

  public String getRepaymentTransactionPayerProductInstanceReference() {
    return repaymentTransactionPayerProductInstanceReference;
  }

  public void setRepaymentTransactionPayerProductInstanceReference(String repaymentTransactionPayerProductInstanceReference) {
    this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935  bian-reference: PaymentTransactionPayeeBankReference  general-info: Reference to the payer's bank 
   * @return repaymentTransactionPayerBankReference
  **/

  public String getRepaymentTransactionPayerBankReference() {
    return repaymentTransactionPayerBankReference;
  }

  public void setRepaymentTransactionPayerBankReference(String repaymentTransactionPayerBankReference) {
    this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionPrincipleAmount  general-info: The amount of the repayment 
   * @return repaymentTransactionAmount
  **/

  public String getRepaymentTransactionAmount() {
    return repaymentTransactionAmount;
  }

  public void setRepaymentTransactionAmount(String repaymentTransactionAmount) {
    this.repaymentTransactionAmount = repaymentTransactionAmount;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionTransferCurrency  general-info: The currency used for the repayment 
   * @return repaymentTransactionCurrency
  **/

  public String getRepaymentTransactionCurrency() {
    return repaymentTransactionCurrency;
  }

  public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
    this.repaymentTransactionCurrency = repaymentTransactionCurrency;
  }


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

