package com.cbdcconsumer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.cbdcconsumer.dto.Token;


@RestController
@RequestMapping("api/v1/cbdcconsumer")
public class cbdcConsumerController {
	
	@Autowired
	DiscoveryClient ds;
	@Autowired
	RestTemplate rTemp;
	@GetMapping
	public List<Token> getAllToken(){
//		List<ServiceInstance>ss=ds.getInstances("CBDC");
//		ServiceInstance s1 =ss.get(0);
//		String url=s1.getUri().toString();
//		RestTemplate rTemp = new RestTemplate();
		List<Token> tt = rTemp.getForObject("http://CBDC/api/v1/cbdc", List.class);
		
		return tt;
		
	}
	@PostMapping
	public String createToken(@RequestBody Token tk){
//		List<ServiceInstance>ss=ds.getInstances("CBDC");
//		ServiceInstance s1 =ss.get(0);
//		String url=s1.getUri().toString();
//		RestTemplate rTemp = new RestTemplate();
		Token tt = rTemp.postForObject("http://CBDC/api/v1/cbdc",tk,Token.class);
		return "Ok created";
	}
	@PutMapping("{i}")
	public String updateToken(@PathVariable("i") long id,@RequestBody Token tk){
//		List<ServiceInstance>ss=ds.getInstances("CBDC");
//		ServiceInstance s1 =ss.get(0);
//		String url=s1.getUri().toString();
//		RestTemplate rTemp = new RestTemplate();
		Token tt = rTemp.postForObject("http://CBDC/api/v1/cbdc",tk,Token.class);
		return "Ok updated";
	}
	@GetMapping("{i}")
	public Token getToken(@PathVariable("i") long id){
//		List<ServiceInstance>ss=ds.getInstances("CBDC");
//		ServiceInstance s1 =ss.get(0);
//		String url=s1.getUri().toString();
//		RestTemplate rTemp = new RestTemplate();
		Token tt = rTemp.getForObject("http://CBDC/api/v1/cbdc/"+id,Token.class);
		return tt;
	}
	
}
