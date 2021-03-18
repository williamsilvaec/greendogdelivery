package br.com.williamsilva.greendogdelivery.repository;

import br.com.williamsilva.greendogdelivery.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
