
package BehaviourPatterns.TemplatePattern.OrderProcessing;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    public String OrderId;
    public String CustomerName;
    public float OrderTotal;
    public List<OrderItem> Items;

}
