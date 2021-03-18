package br.com.williamsilva.greendogdelivery.repository;

import br.com.williamsilva.greendogdelivery.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
