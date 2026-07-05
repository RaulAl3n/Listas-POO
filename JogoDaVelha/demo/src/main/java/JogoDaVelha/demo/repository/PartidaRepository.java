package JogoDaVelha.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JogoDaVelha.demo.model.Partida;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {

}