package fete.bird;

import fete.bird.entity.Order;
import fete.bird.entity.RootContainer;
import fete.bird.interfaces.IOrderRepository;
import io.micronaut.microstream.RootProvider;
import io.micronaut.microstream.annotations.StoreParams;
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
        return createOrder(root, order);
    }

    @StoreParams("orders")
    protected Order createOrder(Map<UUID, Order> orders, Order order) {
        orders.put(order.id(), order);
        return order;
    }
}
