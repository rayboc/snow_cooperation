package rayboc.sn_cooperation.service;

import java.util.Base64;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import rayboc.sn_cooperation.request.AggregateRequest;
import rayboc.sn_cooperation.response.AggregateResult;
import rayboc.sn_cooperation.response.postResultResponse;

@Service
public class AggregateService {

	@Autowired
	RestTemplate restTemplate;

	private static ResourceBundle rb = ResourceBundle.getBundle("application");
	private String url = rb.getString("snow.url");
	private String auth = rb.getString("snow.rest_user");
	private String base64Credentials = Base64.getEncoder().encodeToString(auth.getBytes());


	public AggregateResult getAggregate() {

		url += "?sysparm_limit=1";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Credentials);
		HttpEntity<String> req = new HttpEntity<>(headers);

		ResponseEntity<AggregateResult> res = restTemplate.exchange(url, HttpMethod.GET, req, AggregateResult.class);

		return res.getBody();

	}

	public postResultResponse createAggregate() {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Credentials);
		RequestEntity<AggregateRequest> req = RequestEntity.post(url)
				.headers(headers)
				.body(new AggregateRequest("TEST20210428-12", "true"));

		ResponseEntity<postResultResponse> res = restTemplate.exchange(url, HttpMethod.POST, req, postResultResponse.class);

		return res.getBody();

	}

}
