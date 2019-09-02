package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisbursementRetrieveOutputModelDisbursementInstanceRecord
 */
public class BQDisbursementRetrieveOutputModelDisbursementInstanceRecord   {
  private String disbursementPayeeReference = null;

  private String disbursementPayeeProductInstanceReference = null;

  private String disbursementPayeeBankReference = null;

  private String disbursementAmount = null;

  private String disbursementCurrency = null;

  private String disbursementValueDate = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083  bian-reference: PaymentTransactionPayeeReference  general-info: Reference to the party to whom the payment is made 
   * @return disbursementPayeeReference
  **/

  public String getDisbursementPayeeReference() {
    return disbursementPayeeReference;
  }

  public void setDisbursementPayeeReference(String disbursementPayeeReference) {
    this.disbursementPayeeReference = disbursementPayeeReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA  bian-reference: PaymentTransactionPayeeAccountReference  general-info: Reference to the account to which the payment is made 
   * @return disbursementPayeeProductInstanceReference
  **/

  public String getDisbursementPayeeProductInstanceReference() {
    return disbursementPayeeProductInstanceReference;
  }

  public void setDisbursementPayeeProductInstanceReference(String disbursementPayeeProductInstanceReference) {
    this.disbursementPayeeProductInstanceReference = disbursementPayeeProductInstanceReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935  bian-reference: PaymentTransactionPayeeBankReference  general-info: Reference to the bank where the payee account is held 
   * @return disbursementPayeeBankReference
  **/

  public String getDisbursementPayeeBankReference() {
    return disbursementPayeeBankReference;
  }

  public void setDisbursementPayeeBankReference(String disbursementPayeeBankReference) {
    this.disbursementPayeeBankReference = disbursementPayeeBankReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionAmount  general-info: The amount of the payment 
   * @return disbursementAmount
  **/

  public String getDisbursementAmount() {
    return disbursementAmount;
  }

  public void setDisbursementAmount(String disbursementAmount) {
    this.disbursementAmount = disbursementAmount;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionCurrency  general-info: The currency of the payment 
   * @return disbursementCurrency
  **/

  public String getDisbursementCurrency() {
    return disbursementCurrency;
  }

  public void setDisbursementCurrency(String disbursementCurrency) {
    this.disbursementCurrency = disbursementCurrency;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The value date for the payment transaction 
   * @return disbursementValueDate
  **/

  public String getDisbursementValueDate() {
    return disbursementValueDate;
  }

  public void setDisbursementValueDate(String disbursementValueDate) {
    this.disbursementValueDate = disbursementValueDate;
  }


}

