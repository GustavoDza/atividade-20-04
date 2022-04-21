package br.com.fiap.appcarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.appcarro.model.Carro;


@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
