/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ConsumerLoanApiService {

	SDConsumerLoanActivateOutputModel activate(SDConsumerLoanActivateInputModel request);
	
	SDConsumerLoanConfigureOutputModel configure(String sdReferenceId, SDConsumerLoanConfigureInputModel request);
	
	CRConsumerLoanFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRConsumerLoanFulfillmentArrangementControlInputModel request);
	
	BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request);
	
	BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	BQWithdrawalExecuteOutputModel executeWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalExecuteInputModel request);
	
	SDConsumerLoanFeedbackOutputModel feedback(String sdReferenceId, SDConsumerLoanFeedbackInputModel request);
	
	CRConsumerLoanFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRConsumerLoanFulfillmentArrangementInitiateInputModel request);
	
	BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request);
	
	BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request);
	
	BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request);
	
	BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request);
	
	BQWithdrawalRequestOutputModel requestWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalRequestInputModel request);
	
	CRConsumerLoanFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQDisbursementRetrieveOutputModel retrieveDisbursement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWithdrawalRetrieveOutputModel retrieveWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDConsumerLoanRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRConsumerLoanFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerLoanFulfillmentArrangementUpdateInputModel request);
	
	BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request);
	
	BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request);
	
	BQWithdrawalUpdateOutputModel updateWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalUpdateInputModel request);
	
}
