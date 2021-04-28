package rayboc.sn_cooperation.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggregateRequest {

	@JsonProperty("u_requestid")
	private String uRequestId;

	@JsonProperty("u_bne_test_execute_flg")
	private String uBneTestExecuteFlg;

	public AggregateRequest(String uRequestId, String uBneTestExecuteFlg) {
		this.uRequestId = uRequestId;
		this.uBneTestExecuteFlg = uBneTestExecuteFlg;
	}

	public String getuRequestId() {
		return uRequestId;
	}

	public void setuRequestId(String uRequestId) {
		this.uRequestId = uRequestId;
	}

	public String getuBneTestExecuteFlg() {
		return uBneTestExecuteFlg;
	}

	public void setuBneTestExecuteFlg(String uBneTestExecuteFlg) {
		this.uBneTestExecuteFlg = uBneTestExecuteFlg;
	}


}
