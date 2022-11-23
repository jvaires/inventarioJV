package br.edu.uni7.tecnicas.repository;

import br.edu.uni7.tecnicas.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
}
