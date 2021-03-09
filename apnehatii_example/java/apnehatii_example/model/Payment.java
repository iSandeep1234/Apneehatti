package apnehatii_example.model;

import com.apneehatti.constant.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@ToString
@Table(name = "PAYMENT", schema = "LF")
public class Payment extends PersistedObject {

    private double totalAmount;
    private double serviceCharge;
    private double gstAmount;
    private double discountAmount;
    private String discountAppliedFor;
    private Status status;
}
