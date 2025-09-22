package br.com.contis.usuario_hub_integracao.repository;

import br.com.contis.usuario_hub_integracao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    boolean existsByEmail(String email);

    List<User> findByCompanyId(String companyId);
}
