package it.alfasoft.martina;

import java.io.Serializable;
import javax.ejb.LocalBean;

@LocalBean
public interface IContatoreLocale extends Serializable{
	
	public abstract int getCnt();
    public abstract void setCnt(int cnt);
    public abstract int incrementa();
  
}
