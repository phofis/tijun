package phofis.tijun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phofis.tijun.model.MasterFolder;
import phofis.tijun.model.MasterFolderCompositeKey;

@Repository
public interface MasterFolderRepository extends JpaRepository<MasterFolder, MasterFolderCompositeKey> {
}
