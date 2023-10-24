package myProjects.MyProjectWithTelegram.repository;

import myProjects.MyProjectWithTelegram.entity.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
