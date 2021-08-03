package br.com.x10d;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapProxy {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public Object getDados(Object request) {
		
		template = new WebServiceTemplate(marshaller);
		
		String uri = "https://hoaqcrm001fst.fastshop.com.br:8443/sap/bc/srt/rfc/sap/zwsportal_extract_activities/400/zwsportal_extract_activities/zwsportal_extract_activities";
		
		Object resp = (Object)template.marshalSendAndReceive(uri, request);
		
		return resp;
	}

}
