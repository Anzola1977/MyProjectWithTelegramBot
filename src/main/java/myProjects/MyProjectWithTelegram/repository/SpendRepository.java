package myProjects.MyProjectWithTelegram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import myProjects.MyProjectWithTelegram.entity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
