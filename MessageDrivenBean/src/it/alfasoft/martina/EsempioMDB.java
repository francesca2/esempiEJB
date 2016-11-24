package it.alfasoft.martina;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Message-Driven Bean implementation class for: EsempioMDB
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				        propertyName = "destinationType", 
				        propertyValue = "javax.jms.Queue")
		})
public class EsempioMDB implements MessageListener {

    public void onMessage(Message message) {
        
    	
        
    }

}
