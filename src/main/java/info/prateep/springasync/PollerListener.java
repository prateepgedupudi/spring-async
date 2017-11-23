package info.prateep.springasync;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.Map;


@MessageEndpoint
public class PollerListener {
    private static final Logger LOG = LoggerFactory.getLogger(PollerListener.class);
    @ServiceActivator(inputChannel = "dataChannel")
    public void process(Message<List<Map<String, Object>>> msg){
        if(msg!= null && msg.getPayload()!= null){
            LOG.info("Message: {}", msg);

        }

    }

}
