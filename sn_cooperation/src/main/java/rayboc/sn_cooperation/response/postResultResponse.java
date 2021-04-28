package rayboc.sn_cooperation.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class postResultResponse {

	@JsonProperty("result")
	private AggregateDetail aggregateResponse;

	public AggregateDetail getAggregateResponse() {
		return aggregateResponse;
	}

	public void setAggregateResponse(AggregateDetail aggregateResponse) {
		this.aggregateResponse = aggregateResponse;
	}

}
