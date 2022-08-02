package customer.bpeventhandler.handlers;

import com.sap.cds.services.cds.CdsCreateEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.Before;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import org.springframework.stereotype.Component;


@Component
@ServiceName("BPService")
public class EventPayloadHandler implements EventHandler {
   
 @On(event = CqnService.EVENT_CREATE, entity = "BPService.eventPayload")
 public void onCreate(CdsCreateEventContext context)   
{
System.out.println(context);
}

@Before(event = CqnService.EVENT_CREATE, entity = "BPService.eventPayload")
public void beforeCreate(CdsCreateEventContext context)   
{
    System.out.println(context);
}

}
