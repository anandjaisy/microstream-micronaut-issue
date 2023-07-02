package fete.bird;

import fete.bird.entity.Order;
import fete.bird.interfaces.IOrderRepository;
import jakarta.inject.Singleton;

import java.util.UUID;

@Singleton
public class OrderRepository implements IOrderRepository {
    @Override
    public Order create(Order order) {
        var test =new Order(UUID.randomUUID(), "Hello", "Test", "asdasd");
        return test;
    }
}
