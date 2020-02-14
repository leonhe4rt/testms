package com.capgemini.captivams.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.captivams.beans.DatiFattura;
import com.capgemini.captivams.beans.DatiScansione;
import com.capgemini.captivams.service.DatiFatturaService;

@RestController
@RequestMapping("/captivams")
public class CaptivaController {

	@Autowired
	private DatiFatturaService datiFatturaService;
	
	private static final Logger logger = LogManager.getLogger(CaptivaController.class);

	@RequestMapping(value = "/invioDatiScansione", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE }, 
    produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
	public boolean invioDatiScansione(@RequestBody DatiScansione datiScansione) {
		
		if (datiScansione != null) {
			
			logger.debug("SCANSIONE FILE: " + datiScansione.getNomeFile() + " AVVENUTA CON SUCCESSO");
			
			return true;
		}
		else {
				
			logger.debug("ERRORE SCANSIONE FILE");
			
			return false;
		}
	}
	
	@RequestMapping(value = "/getDatiFattura", method = RequestMethod.GET)
	public DatiFattura invioDatiScansione() {
		
		return datiFatturaService.getDatiFattura();
	}
	

}
