package fete.bird.api;

import fete.bird.entity.Order;
import fete.bird.interfaces.IOrderRepository;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Controller("/order")
public class OrderController {
private final IOrderRepository iOrderRepository;

    public OrderController(IOrderRepository iOrderRepository) {
        this.iOrderRepository = iOrderRepository;
    }

    @Post
    public Order post(Order model) {
        var result =iOrderRepository.create(model);
        return result;
    }
    @Put
    public Order put(Order model) {
        return iOrderRepository.create(model);
    }

    @Get
    Collection<Order> list() {
        return List.of(new Order(UUID.randomUUID(), "Hello", "Test", "asdasd"));
    }
}
