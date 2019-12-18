package com.pspei;

import java.math.BigDecimal;

public class OrdenPagoPSDto {

	String ctaOrd;
	String nombreOrd;
	String rfcOrd;
	String nombreDestino;
	int idTipoCtaDestino;
	String ctaDestino;
	String rfcDestino;
	String conceptoPago;
	BigDecimal monto;
	BigDecimal iva;
	String refNum;
	String refCob;
	String cveRastreo;
	int bancoDestino;
	String firma;
	
	public String getCtaOrd() {
		return ctaOrd;
	}
	public void setCtaOrd(String ctaOrd) {
		this.ctaOrd = ctaOrd;
	}
	public String getNombreOrd() {
		return nombreOrd;
	}
	public void setNombreOrd(String nombreOrd) {
		this.nombreOrd = nombreOrd;
	}
	public String getRfcOrd() {
		return rfcOrd;
	}
	public void setRfcOrd(String rfcOrd) {
		this.rfcOrd = rfcOrd;
	}
	public String getNombreDestino() {
		return nombreDestino;
	}
	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}
	public int getIdTipoCtaDestino() {
		return idTipoCtaDestino;
	}
	public void setIdTipoCtaDestino(int idTipoCtaDestino) {
		this.idTipoCtaDestino = idTipoCtaDestino;
	}
	public String getCtaDestino() {
		return ctaDestino;
	}
	public void setCtaDestino(String ctaDestino) {
		this.ctaDestino = ctaDestino;
	}
	public String getRfcDestino() {
		return rfcDestino;
	}
	public void setRfcDestino(String rfcDestino) {
		this.rfcDestino = rfcDestino;
	}
	public String getConceptoPago() {
		return conceptoPago;
	}
	public void setConceptoPago(String conceptoPago) {
		this.conceptoPago = conceptoPago;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	public String getRefNum() {
		return refNum;
	}
	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}
	public String getRefCob() {
		return refCob;
	}
	public void setRefCob(String refCob) {
		this.refCob = refCob;
	}
	public String getCveRastreo() {
		return cveRastreo;
	}
	public void setCveRastreo(String cveRastreo) {
		this.cveRastreo = cveRastreo;
	}
	public int getBancoDestino() {
		return bancoDestino;
	}
	public void setBancoDestino(int bancoDestino) {
		this.bancoDestino = bancoDestino;
	}
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	public String toString() {
		return ctaOrd+" | "+nombreOrd+" | "+rfcOrd+" | "+ nombreDestino+" | "+ idTipoCtaDestino+" | "+ 
				ctaDestino+" | "+ rfcDestino+" | "+ conceptoPago+" | "+ 
				monto+" | "+ iva +" | "+refNum +" | "+refCob+" | "+ cveRastreo+" | "+ bancoDestino +" | "+firma;
		 
		
	}
		
}
