package SO2.SO2_Trabalho2.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import SO2.SO2_Trabalho2.model.Login;

public interface LoginRepository extends CrudRepository<Login, Long> {
    List<Login> findById(int id);

    List<Login> findAll();

    // @Query(value = "SELECT * FROM public.login WHERE utilizador = '?1' AND
    // password = '?2'")
    Login findByUtilizadorAndPassword(String utilizador, String password);
}