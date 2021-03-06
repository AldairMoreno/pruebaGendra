package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "zipcodemex") 
public class zipcoderest {
 
	@Id
	private long zip_code;
	private String d_asenta;	
	private String d_tipo_asenta;
	private String D_mnpio;
	private String d_estado;
	private String d_ciudad;
	private Integer d_CP;
	private Integer c_estado;
	private Integer c_oficina;
	private String c_CP;
	private Integer c_tipo_asenta;
	private Integer c_mnpio;
	private Integer id_asenta_cpcons;
	private String d_zona;
	private Integer c_cve_ciudad;
	
	//Generate Constructor
	public zipcoderest(long zip_code, String d_asenta, String d_tipo_asenta, String d_mnpio, String d_estado,
			String d_ciudad, Integer d_CP, Integer c_estado, Integer c_oficina, String c_CP, Integer c_tipo_asenta,
			Integer c_mnpio, Integer id_asenta_cpcons, String d_zona, Integer c_cve_ciudad) {
		this.zip_code = zip_code;
		this.d_asenta = d_asenta;
		this.d_tipo_asenta = d_tipo_asenta;
		D_mnpio = d_mnpio;
		this.d_estado = d_estado;
		this.d_ciudad = d_ciudad;
		this.d_CP = d_CP;
		this.c_estado = c_estado;
		this.c_oficina = c_oficina;
		this.c_CP = c_CP;
		this.c_tipo_asenta = c_tipo_asenta;
		this.c_mnpio = c_mnpio;
		this.id_asenta_cpcons = id_asenta_cpcons;
		this.d_zona = d_zona;
		this.c_cve_ciudad = c_cve_ciudad;
	}
	
	//Getters and Setters
	public long getZip_code() {
		return zip_code;
	}
	public void setZip_code(long zip_code) {
		this.zip_code = zip_code;
	}
	public String getD_asenta() {
		return d_asenta;
	}
	public void setD_asenta(String d_asenta) {
		this.d_asenta = d_asenta;
	}
	public String getD_tipo_asenta() {
		return d_tipo_asenta;
	}
	public void setD_tipo_asenta(String d_tipo_asenta) {
		this.d_tipo_asenta = d_tipo_asenta;
	}
	public String getD_mnpio() {
		return D_mnpio;
	}
	public void setD_mnpio(String d_mnpio) {
		D_mnpio = d_mnpio;
	}
	public String getD_estado() {
		return d_estado;
	}
	public void setD_estado(String d_estado) {
		this.d_estado = d_estado;
	}
	public String getD_ciudad() {
		return d_ciudad;
	}
	public void setD_ciudad(String d_ciudad) {
		this.d_ciudad = d_ciudad;
	}
	public Integer getD_CP() {
		return d_CP;
	}
	public void setD_CP(Integer d_CP) {
		this.d_CP = d_CP;
	}
	public Integer getC_estado() {
		return c_estado;
	}
	public void setC_estado(Integer c_estado) {
		this.c_estado = c_estado;
	}
	public Integer getC_oficina() {
		return c_oficina;
	}
	public void setC_oficina(Integer c_oficina) {
		this.c_oficina = c_oficina;
	}
	public String getC_CP() {
		return c_CP;
	}
	public void setC_CP(String c_CP) {
		this.c_CP = c_CP;
	}
	public Integer getC_tipo_asenta() {
		return c_tipo_asenta;
	}
	public void setC_tipo_asenta(Integer c_tipo_asenta) {
		this.c_tipo_asenta = c_tipo_asenta;
	}
	public Integer getC_mnpio() {
		return c_mnpio;
	}
	public void setC_mnpio(Integer c_mnpio) {
		this.c_mnpio = c_mnpio;
	}
	public Integer getId_asenta_cpcons() {
		return id_asenta_cpcons;
	}
	public void setId_asenta_cpcons(Integer id_asenta_cpcons) {
		this.id_asenta_cpcons = id_asenta_cpcons;
	}
	public String getD_zona() {
		return d_zona;
	}
	public void setD_zona(String d_zona) {
		this.d_zona = d_zona;
	}
	public Integer getC_cve_ciudad() {
		return c_cve_ciudad;
	}
	public void setC_cve_ciudad(Integer c_cve_ciudad) {
		this.c_cve_ciudad = c_cve_ciudad;
	}
	
	
	
}
