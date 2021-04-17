package br.com.cartorio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cartorio.model.Cartorio;
import br.com.cartorio.repository.CartorioRepository;

@Service
public class CartorioServiceImpl implements CartorioService{

	@Autowired
	private CartorioRepository cartorioRepository;
	
	
	@Override
	public List<Cartorio> getAllCartorios() {
		return cartorioRepository.findAll();
	}
	
	@Override
	public void saveCartorio(Cartorio cartorio) {
		this.cartorioRepository.save(cartorio);
		
	}
	
	@Override
	public Cartorio getCartorioById(long id) {
		Optional<Cartorio> optional = cartorioRepository.findById(id);
		Cartorio cartorio = null;
		if(optional.isPresent()) {
			cartorio = optional.get();
		}else {
			throw new RuntimeException("Cartório não encontrado pelo id :: " + id);
		}
		return cartorio;
	}
	
	@Override
	public void deleteCartorioById(long id) {
		this.cartorioRepository.deleteById(id);		
	}
}
