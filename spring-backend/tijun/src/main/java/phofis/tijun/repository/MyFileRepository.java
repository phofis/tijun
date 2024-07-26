package phofis.tijun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phofis.tijun.model.MyFile;
@Repository
public interface MyFileRepository extends JpaRepository<MyFile, Long> {
}
