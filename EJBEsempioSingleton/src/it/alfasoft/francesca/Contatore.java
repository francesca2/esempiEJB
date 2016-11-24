package it.alfasoft.francesca;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class Contatore
 */
@Singleton
public class Contatore implements IContatoreLocale, SessionBean{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private int cnt;
    
    public Contatore(){
    	System.out.println("Creato!");
    }

    public int getCnt() {
	    return cnt;
    }

    public void setCnt(int cnt) {
	    this.cnt = cnt;
    }

	@Override
	public int incrementa() {
		
		return cnt++;
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}
   

}
