package com.pspei;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class PagoController {
	
	private static final Logger log = LogManager.getLogger(PagoController.class);
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@PostMapping("/Pago")
	public ResponseEntity<String> getPago(@Valid @RequestBody OrdenPagoPSDto ordenPagoPS, HttpServletRequest req) throws Exception{
		try {
			log.debug("Request recibido");
			System.out.println("Recibido");
			System.out.println("entity: " + objectMapper.writeValueAsString(ordenPagoPS));
			String header = req.getHeader("Authorization");
			System.out.println("Authorization: " + new String(Base64.getDecoder().decode(header)));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("Recibido correctamente", HttpStatus.ACCEPTED);
	}

}
