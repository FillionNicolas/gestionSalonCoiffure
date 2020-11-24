package com.mgestion_rdv.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@RefreshScope
public class ApplicationPropertiesConfiguration {
	private int limitDeReservations;

	public int getLimitDeReservations() {
		return limitDeReservations;
	}

	public void setLimitDeReservations(int limitDeReservations) {
		this.limitDeReservations = limitDeReservations;
	}
	
	private int limitDePrestations;

	public int getLimitDePrestations() {
		return limitDePrestations;

	}

	public void setLimitDePrestations(int limitDePrestations) {
		this.limitDePrestations = limitDePrestations;
	}

	private int limitDeSalons;

	public int getLimitDeSalons() {
		return limitDeSalons;
	}

	public void setLimitDeSalons(int limitDeSalons) {
		this.limitDeSalons = limitDeSalons;
	}
	
}
