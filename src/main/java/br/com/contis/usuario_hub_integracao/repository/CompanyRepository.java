package br.com.contis.usuario_hub_integracao.repository;

import br.com.contis.usuario_hub_integracao.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

}
