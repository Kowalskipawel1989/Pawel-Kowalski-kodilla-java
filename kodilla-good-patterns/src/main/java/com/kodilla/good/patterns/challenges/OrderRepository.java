package com.kodilla.good.patterns.challenges;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDateTime;

public interface OrderRepository {
   boolean createOrder(User user, LocalDateTime from, LocalDateTime shipment);
}
