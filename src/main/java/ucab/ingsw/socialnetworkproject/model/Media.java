package ucab.ingsw.socialnetworkproject.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ToString
public class Media  implements Serializable {
    @Id
    private long id;

    private String url;
    private long albumId;
    private int type; //0=instagram 1=youtube 2=soundcloud
}
