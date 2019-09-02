package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordAssociations
 */
public class CRConsumerLoanFulfillmentArrangementInitiateInputModelConsumerLoanFulfillmentArrangementInstanceRecordAssociations   {
  private String associationType = null;

  private String associationObligationEntitlement = null;

  private String associationReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_t-Si4N1CEeGAp99n2TKigg_-919072642  bian-reference: LoanAgreement (as Agreement).AgreementInvolvement.InvolvementType  general-info: The type of association (e.g. guarantor, co-signer) 
   * @return associationType
  **/

  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the role, obligations or entitlements of the associated party 
   * @return associationObligationEntitlement
  **/

  public String getAssociationObligationEntitlement() {
    return associationObligationEntitlement;
  }

  public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633  bian-reference: LoanAgreement (as Agreement).AgreementInvolvement (as PartyRole).Party  general-info: Reference to the associated party 
   * @return associationReference
  **/

  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }


}

