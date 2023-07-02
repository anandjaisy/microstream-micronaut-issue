package fete.bird.interfaces;

import fete.bird.entity.Order;
import io.micronaut.core.annotation.Introspected;

@Introspected
public interface IOrderRepository {
    Order create(Order order);
}
