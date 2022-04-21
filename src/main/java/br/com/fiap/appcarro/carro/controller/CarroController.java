package br.com.fiap.appcarro.carro.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.appcarro.carro.dto.CarroDto;
import br.com.fiap.appcarro.model.Carro;
import br.com.fiap.appcarro.repository.CarroRepository;

public class CarroController{
	
	@Autowired
	private CarroRepository carroRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/carro")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("carro/index");
		           
		List<Carro> carroDaRepository = carroRepository.findAll();
		modelView.addObject("listarCarros", carroDaRepository);
		
		return modelView;
	}
	
	@GetMapping("/carro/criar")
	public ModelAndView criar(CarroDto carro) {
		ModelAndView modelView = new ModelAndView("carro/criar");
		return modelView;
	}
	
	@PostMapping("carro")
	public ModelAndView salvar(@Valid CarroDto carro, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("carro/criar");
		}
		Carro carroEntity = modelMapper.map(carro, Carro.class);
		carroRepository.save(carroEntity);
		return new ModelAndView("redirect:/carro");
	}
	
	@GetMapping("carro/{id}")
	public ModelAndView mostrar(@PathVariable Long id) {
		Optional<Carro> carro = carroRepository.findById(id);
		
		if(carro.isPresent()) {
			Carro carroGet = carro.get();
			ModelAndView modelView = new ModelAndView("carro/detalhe");
			modelView.addObject("carro", carroGet);
			return modelView;
		}
		System.out.println("não encontrado!");
		return new ModelAndView("redirect:/carro");
	}
	
	
}
	
