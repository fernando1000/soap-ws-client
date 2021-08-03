package br.com.x10d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	private SoapProxy soapClient;
	
	@PostMapping("/consultaDados")
	public Object getDados(@RequestBody Object request) {
		return soapClient.getDados(request);
	}
}
