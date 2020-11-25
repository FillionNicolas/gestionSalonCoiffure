package com.mreclamation.service;

import java.util.List;

import com.mreclamation.entities.Avis;

public interface IAvisService {

	public List<Avis> findAllAvis();//LouisTypo : getAviss()

	public Avis findOneAvis(Long idAvis);//Louise Typo: getAvis(Long idAvis)

	public Avis saveAvis(Avis avis);

	void deleteAvis(Long idAvis);
}
