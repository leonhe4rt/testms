package com.capgemini.captivams.service;

import org.springframework.stereotype.Service;

import com.capgemini.captivams.beans.DatiFattura;

@Service
public class DatiFatturaServiceImpl implements DatiFatturaService{

	@Override
	public DatiFattura getDatiFattura() {


		DatiFattura datiFattura = new DatiFattura();
		
		datiFattura.setId(1);
		datiFattura.setNomefile("Fattura1.pdf");
		datiFattura.setClassificationTemplate("FatturaRest_SAR_48");
		datiFattura.setDataFattura("28/01/2020");
		datiFattura.setNumeroFattura("44DF5-5");
		datiFattura.setCfpIvaFattura("SANRAFF48");
		datiFattura.setImportoFattura("45.00");
		datiFattura.setCodiceFiscale("A1B2JOHNDOE80");
		
		return datiFattura;
	}

}
