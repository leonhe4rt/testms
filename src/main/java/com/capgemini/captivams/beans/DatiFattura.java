package com.capgemini.captivams.beans;

import java.io.Serializable;

public class DatiFattura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String classificationTemplate;
	private String nomefile;
	private String dataFattura;
	private String numeroFattura;
	private String importoFattura;
	private String cfpIvaFattura;
	private String codiceFiscale;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassificationTemplate() {
		return classificationTemplate;
	}

	public void setClassificationTemplate(String classificationTemplate) {
		this.classificationTemplate = classificationTemplate;
	}

	public String getNomefile() {
		return nomefile;
	}

	public void setNomefile(String nomefile) {
		this.nomefile = nomefile;
	}

	public String getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(String dataFattura) {
		this.dataFattura = dataFattura;
	}

	public String getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(String numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public String getImportoFattura() {
		return importoFattura;
	}

	public void setImportoFattura(String importoFattura) {
		this.importoFattura = importoFattura;
	}

	public String getCfpIvaFattura() {
		return cfpIvaFattura;
	}

	public void setCfpIvaFattura(String cfpIvaFattura) {
		this.cfpIvaFattura = cfpIvaFattura;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

}
