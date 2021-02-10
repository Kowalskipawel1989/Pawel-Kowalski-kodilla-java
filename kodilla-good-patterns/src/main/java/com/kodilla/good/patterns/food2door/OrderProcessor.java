package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProducer());
        if(isOrdered){
            informationService.information(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProducer());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducer(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducer(), false);
        }
    }
}
