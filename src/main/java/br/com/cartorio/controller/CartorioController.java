package br.com.cartorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.cartorio.model.Cartorio;
import br.com.cartorio.service.CartorioService;

@Controller
public class CartorioController {

	@Autowired
	private CartorioService cartorioService;
	
	// Lista de cartórios
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listCartorios", cartorioService.getAllCartorios());
		return "index";
	}
	
	//Criar atributo de modelo para vincular os dados do formulário
	@GetMapping("/showNewCartorioForm")
	public String showNewCartorioForm(Model model) {
		Cartorio cartorio = new Cartorio();
		model.addAttribute("cartorio",cartorio);
		return "new_cartorio";
	}
	
	@PostMapping("/saveCartorio")
	public String saveCartorio(@ModelAttribute("cartorio") Cartorio cartorio) {
		//salvar cartório no database
		cartorioService.saveCartorio(cartorio);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id")  long id, Model model) {
		//Selecionar cartório do service
		Cartorio cartorio = cartorioService.getCartorioById(id);
		
		//Definir funcionário como um atributo de modelo para preencher previamente o formulário
		model.addAttribute("cartorio", cartorio);
		return "update_cartorio";
	}
	
	@GetMapping("/deleteCartorio/{id}")
	public String deleteCartorio(@PathVariable (value = "id")  long id) {
		// Chamando o método para excluir um cartorio
		
		this.cartorioService.deleteCartorioById(id);
		return "redirect:/";
	}
}
