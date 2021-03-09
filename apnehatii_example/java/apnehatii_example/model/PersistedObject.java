package apnehatii_example.model;

import com.apneehatti.constant.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@MappedSuperclass
public class PersistedObject implements Serializable {

    private static final long serialVersionVID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATETIME", nullable = false, updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DE_SERIALIZATION_FORMAT)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATETIME", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DE_SERIALIZATION_FORMAT)
    private Date updatedDate;
}
