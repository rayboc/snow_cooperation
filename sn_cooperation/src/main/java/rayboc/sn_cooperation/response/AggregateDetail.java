package rayboc.sn_cooperation.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AggregateDetail {

	private String sys_id;
	private String sys_updated_by;
	private String u_requestid;
	private String sys_created_on;
	private String u_bne_test_execute_flg;
	private String sys_mod_count;
	private String sys_updated_on;
	private String sys_tags;
	private String sys_created_by;

	public AggregateDetail() {

	}

	public String getSys_id() {
		return sys_id;
	}
	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}
	public String getSys_updated_by() {
		return sys_updated_by;
	}
	public void setSys_updated_by(String sys_updated_by) {
		this.sys_updated_by = sys_updated_by;
	}
	public String getU_requestid() {
		return u_requestid;
	}
	public void setU_requestid(String u_requestid) {
		this.u_requestid = u_requestid;
	}
	public String getSys_created_on() {
		return sys_created_on;
	}
	public void setSys_created_on(String sys_created_on) {
		this.sys_created_on = sys_created_on;
	}
	public String getU_bne_test_execute_flg() {
		return u_bne_test_execute_flg;
	}
	public void setU_bne_test_execute_flg(String u_bne_test_execute_flg) {
		this.u_bne_test_execute_flg = u_bne_test_execute_flg;
	}
	public String getSys_mod_count() {
		return sys_mod_count;
	}
	public void setSys_mod_count(String sys_mod_count) {
		this.sys_mod_count = sys_mod_count;
	}
	public String getSys_updated_on() {
		return sys_updated_on;
	}
	public void setSys_updated_on(String sys_updated_on) {
		this.sys_updated_on = sys_updated_on;
	}
	public String getSys_tags() {
		return sys_tags;
	}
	public void setSys_tags(String sys_tags) {
		this.sys_tags = sys_tags;
	}
	public String getSys_created_by() {
		return sys_created_by;
	}
	public void setSys_created_by(String sys_created_by) {
		this.sys_created_by = sys_created_by;
	}


	@Override
	public String toString() {
		return "getSys_created_by" + getSys_created_by() + " getSys_id" + getSys_id() +
				" getSys_mod_count" + getSys_mod_count() + " getSys_tags" + getSys_tags() +
				" getSys_updated_by" + getSys_updated_by() + " getU_bne_test_execute_flg" + getU_bne_test_execute_flg() +
				" getU_requestid" + getU_requestid();

	}





}
