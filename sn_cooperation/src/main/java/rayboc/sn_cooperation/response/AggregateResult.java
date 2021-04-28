package rayboc.sn_cooperation.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggregateResult {

	@JsonProperty("result")
	private List< AggregateDetail> aggregateResponse;

	public List<AggregateDetail> getAggregateResponse() {
		return aggregateResponse;
	}

	public void setAggregateResponse(List<AggregateDetail> aggregateResponse) {
		this.aggregateResponse = aggregateResponse;
	}

}
