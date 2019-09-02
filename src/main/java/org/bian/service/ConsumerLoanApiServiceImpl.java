/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ConsumerLoanApiServiceImpl implements ConsumerLoanApiService {

	public SDConsumerLoanActivateOutputModel activate(SDConsumerLoanActivateInputModel request){
		return JsonReader.read("activate-SDConsumerLoanActivateOutputModel.json",new TypeReference<SDConsumerLoanActivateOutputModel>(){});
	}
	
	public SDConsumerLoanConfigureOutputModel configure(String sdReferenceId, SDConsumerLoanConfigureInputModel request){
		return JsonReader.read("configure-SDConsumerLoanConfigureOutputModel.json",new TypeReference<SDConsumerLoanConfigureOutputModel>(){});
	}
	
	public CRConsumerLoanFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRConsumerLoanFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRConsumerLoanFulfillmentArrangementControlOutputModel.json",new TypeReference<CRConsumerLoanFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request){
		return JsonReader.read("exchange-BQRestructuringExchangeOutputModel.json",new TypeReference<BQRestructuringExchangeOutputModel>(){});
	}
	
	public BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request){
		return JsonReader.read("execute-BQRepaymentExecuteOutputModel.json",new TypeReference<BQRepaymentExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public BQWithdrawalExecuteOutputModel executeWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalExecuteInputModel request){
		return JsonReader.read("execute-BQWithdrawalExecuteOutputModel.json",new TypeReference<BQWithdrawalExecuteOutputModel>(){});
	}
	
	public SDConsumerLoanFeedbackOutputModel feedback(String sdReferenceId, SDConsumerLoanFeedbackInputModel request){
		return JsonReader.read("feedback-SDConsumerLoanFeedbackOutputModel.json",new TypeReference<SDConsumerLoanFeedbackOutputModel>(){});
	}
	
	public CRConsumerLoanFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRConsumerLoanFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRConsumerLoanFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRConsumerLoanFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request){
		return JsonReader.read("initiate-BQRestructuringInitiateOutputModel.json",new TypeReference<BQRestructuringInitiateOutputModel>(){});
	}
	
	public BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceRequestOutputModel.json",new TypeReference<BQMaintenanceRequestOutputModel>(){});
	}
	
	public BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request){
		return JsonReader.read("request-BQRepaymentRequestOutputModel.json",new TypeReference<BQRepaymentRequestOutputModel>(){});
	}
	
	public BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request){
		return JsonReader.read("request-BQRestructuringRequestOutputModel.json",new TypeReference<BQRestructuringRequestOutputModel>(){});
	}
	
	public BQWithdrawalRequestOutputModel requestWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalRequestInputModel request){
		return JsonReader.read("request-BQWithdrawalRequestOutputModel.json",new TypeReference<BQWithdrawalRequestOutputModel>(){});
	}
	
	public CRConsumerLoanFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRConsumerLoanFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRConsumerLoanFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDisbursementRetrieveOutputModel retrieveDisbursement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDisbursementRetrieveOutputModel.json",new TypeReference<BQDisbursementRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceRetrieveOutputModel.json",new TypeReference<BQMaintenanceRetrieveOutputModel>(){});
	}
	
	public BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepaymentRetrieveOutputModel.json",new TypeReference<BQRepaymentRetrieveOutputModel>(){});
	}
	
	public BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRestructuringRetrieveOutputModel.json",new TypeReference<BQRestructuringRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public BQWithdrawalRetrieveOutputModel retrieveWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWithdrawalRetrieveOutputModel.json",new TypeReference<BQWithdrawalRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDConsumerLoanRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDConsumerLoanRetrieveOutputModel.json",new TypeReference<SDConsumerLoanRetrieveOutputModel>(){});
	}
	
	public CRConsumerLoanFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRConsumerLoanFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRConsumerLoanFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRConsumerLoanFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request){
		return JsonReader.read("update-BQRepaymentUpdateOutputModel.json",new TypeReference<BQRepaymentUpdateOutputModel>(){});
	}
	
	public BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request){
		return JsonReader.read("update-BQRestructuringUpdateOutputModel.json",new TypeReference<BQRestructuringUpdateOutputModel>(){});
	}
	
	public BQWithdrawalUpdateOutputModel updateWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalUpdateInputModel request){
		return JsonReader.read("update-BQWithdrawalUpdateOutputModel.json",new TypeReference<BQWithdrawalUpdateOutputModel>(){});
	}
	
}
