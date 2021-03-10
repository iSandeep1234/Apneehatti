package apnehatii_example.model;

import com.apneehatti.constant.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@Table(name = "ORDER", schema = "LF")
public class Order extends PersistedObject

{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;
    private int quantity;
    private double price;
    private double totalAmount;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAYMENT_ID", nullable = false)
    private Payment payment;
    private Status status;
    private String paidBy;
    

    
    
}
