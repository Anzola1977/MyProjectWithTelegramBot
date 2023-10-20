package myProjects.MyProjectWithTelegram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import myProjects.MyProjectWithTelegram.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}