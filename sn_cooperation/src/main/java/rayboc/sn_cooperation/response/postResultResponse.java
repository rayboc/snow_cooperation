package rayboc.sn_cooperation.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class postResultResponse {

	@JsonProperty("result")
	private AggregateDetail aggregateDetail;

}
