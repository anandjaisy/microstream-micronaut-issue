package fete.bird;

import fete.bird.entity.Order;
import fete.bird.entity.RootContainer;
import fete.bird.interfaces.IOrderRepository;
import io.micronaut.microstream.RootProvider;
import jakarta.inject.Singleton;

import java.util.Map;
import java.util.UUID;

@Singleton
public class OrderRepository implements IOrderRepository {
    private final RootProvider<RootContainer> rootProvider;

    public OrderRepository(RootProvider<RootContainer> rootProvider) {
        this.rootProvider = rootProvider;
    }

    @Override
    public Order create(Order order) {
        Map<UUID, Order> root = rootProvider.root().getOrders();
        root.put(order.id(), order);
        //var test =new Order(UUID.randomUUID(), "Hello", "Test", "asdasd");
        return order;
    }
}
