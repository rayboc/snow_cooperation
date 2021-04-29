package rayboc.sn_cooperation.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AggregateRequest {

	@JsonProperty("u_requestid")
	private String uRequestId;

	@JsonProperty("u_bne_test_execute_flg")
	private String uBneTestExecuteFlg;

	public AggregateRequest(String uRequestId, String uBneTestExecuteFlg) {
		this.uRequestId = uRequestId;
		this.uBneTestExecuteFlg = uBneTestExecuteFlg;
	}

}
