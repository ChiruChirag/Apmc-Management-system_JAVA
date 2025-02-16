package codingTechniques.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import codingTechniques.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

	List<Issue> findByFinalCropsId(Long finalCropId, Sort sort);
    // Add custom query methods if needed

	List<Issue> findByFinalCropsIdOrderBySender(Long finalCropId);
}
