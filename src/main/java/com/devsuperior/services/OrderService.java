package com.devsuperior.services;

import com.devsuperior.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountValue = order.getBasic() * (order.getDiscount() / 100.0);
        return order.getBasic() - discountValue + shippingService.shipment(order.getBasic());
    }
}
