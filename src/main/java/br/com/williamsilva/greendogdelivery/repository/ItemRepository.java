package br.com.williamsilva.greendogdelivery.repository;

import br.com.williamsilva.greendogdelivery.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
