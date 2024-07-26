package phofis.tijun.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@IdClass(MasterFolderCompositeKey.class)
public class MasterFolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Id
    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    @OneToMany
    private List<MyFile> myFiles;
}
