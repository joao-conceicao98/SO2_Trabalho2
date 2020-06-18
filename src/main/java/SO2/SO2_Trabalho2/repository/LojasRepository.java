package SO2.SO2_Trabalho2.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import SO2.SO2_Trabalho2.model.Lojas;

public interface LojasRepository extends CrudRepository<Lojas, Long> {
    List<Lojas> findById(int id);
}