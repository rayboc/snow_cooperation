package rayboc.sn_cooperation.service;

import java.util.Base64;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import rayboc.sn_cooperation.response.AggregateResult;

@Service
public class AggregateService {

	@Autowired
	RestTemplate restTemplate;

	private static ResourceBundle rb = ResourceBundle.getBundle("application");

	public AggregateResult getAggregate() {

		String url = rb.getString("snow.url") + "?sysparm_limit=1";
		// 認証情報の生成
		String auth = rb.getString("snow.rest_user");
		String base64Credentials = Base64.getEncoder().encodeToString(auth.getBytes());

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Credentials);
		HttpEntity<String> req = new HttpEntity<>(headers);

		ResponseEntity<AggregateResult> res = restTemplate.exchange(url, HttpMethod.GET, req, AggregateResult.class);

		return res.getBody();

	}

}
