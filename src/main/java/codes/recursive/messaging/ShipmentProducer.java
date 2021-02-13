package codes.recursive.messaging;

import codes.recursive.domain.Shipment;
import io.micronaut.runtime.context.scope.ThreadLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ThreadLocal
public class ShipmentProducer {

    private static final Logger LOG = LoggerFactory.getLogger(ShipmentProducer.class);
    
    public void sendMessage(String key, Shipment shipment) {
        LOG.info("Sending message with key {} received!", key);
        LOG.info("Sending message with shipment {} received!", shipment.getId());
    }
}