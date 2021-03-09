package apnehatii_example.model;

import com.apneehatti.constant.Size;
import com.apneehatti.constant.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@Table(name = "PRODUCT", schema = "LF")
public class Product extends Persistence {

    private String productName;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", nullable = false)
    private ProductCategory productCategory;
    private double price;
    private int quantity;
    private Size size;
    private String image; //Need to change the type based on our confirmation
    private Status status;
}
