package phofis.tijun.model;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MasterFolderCompositeKey {
    private User user;
}
