package rayboc.sn_cooperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import rayboc.sn_cooperation.response.AggregateResult;
import rayboc.sn_cooperation.service.AggregateService;

@Controller
public class AggregateController {

	@Autowired
	AggregateService aggregateService;

	@GetMapping("/")
	public String create() {
		AggregateResult aggregateResult = aggregateService.getAggregate();
		System.out.println(aggregateResult.getAggregateResponse().get(0));
		return "index";
	}

}
