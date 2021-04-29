package rayboc.sn_cooperation.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AggregateDetail {

	@JsonProperty("sys_id")
	private String sysId;

	@JsonProperty("sys_updated_by")
	private String sysUpdatedBy;

	@JsonProperty("u_requestid")
	private String uRequestid;

	@JsonProperty("sys_created_on")
	private String sysCreatedOn;

	@JsonProperty("u_bne_test_execute_flg")
	private String uBneTestExecuteFlg;

	@JsonProperty("sys_mod_count")
	private String sysModCount;

	@JsonProperty("sys_updated_on")
	private String sysUpdatedOn;

	@JsonProperty("sys_tags")
	private String sysTags;

	@JsonProperty("sys_created_by")
	private String sysCreatedBy;

}