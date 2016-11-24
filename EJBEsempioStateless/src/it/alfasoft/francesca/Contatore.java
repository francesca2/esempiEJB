package it.alfasoft.francesca;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Contatore
 */
@Stateless

public class Contatore implements IContatoreLocale{

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
   

}
