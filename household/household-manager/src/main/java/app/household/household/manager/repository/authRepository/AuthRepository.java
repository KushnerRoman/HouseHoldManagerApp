package app.household.household.manager.repository.authRepository;

import app.household.household.manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AuthRepository extends JpaRepository<User, Long> {

    public boolean existsByEmail(String email);

}
