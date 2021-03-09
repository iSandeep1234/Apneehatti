package apnehatii_example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@ToString
@Table(name = "ROLE", schema = "LF")
public class Role extends PersistedObject {

    private String roleName;
}
