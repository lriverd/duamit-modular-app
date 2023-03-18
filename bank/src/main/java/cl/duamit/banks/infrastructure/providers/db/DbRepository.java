package cl.duamit.banks.infrastructure.providers.db;

import cl.duamit.banks.infrastructure.providers.db.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbRepository extends JpaRepository<Bank, String> {
}
