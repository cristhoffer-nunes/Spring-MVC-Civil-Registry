package br.com.cartorio.service;

import java.util.List;

import br.com.cartorio.model.Cartorio;

public interface CartorioService {

	List<Cartorio> getAllCartorios();
	void saveCartorio(Cartorio cartorio);
	Cartorio getCartorioById(long id);
	void deleteCartorioById(long id);
}
