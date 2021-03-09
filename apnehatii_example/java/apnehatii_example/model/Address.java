package apnehatii_example.model;

import com.apneehatti.constant.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@ToString
@Table(name = "ADDRESS", schema = "LF")
public class Address extends PersistedObject {

    private String name;
    private String street1;
    private String street2;
    private String street3;
    private String city;
    private String state;
    private long pinCode;
    private Status status;
    private Boolean isDefault;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;
}
