package analisador2.dumb;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Regra {
	
	@XStreamAsAttribute
	private Integer inteiroDaRegra;
	@XStreamAsAttribute
	private String stringDaRegra;
	@XStreamAsAttribute
	private Boolean booleanoDaRegra;
	
	@XStreamAlias("niveis1")
	private RegraSubnivel1[] subnivel1;
	@XStreamAlias("niveis2")
	private RegraSubnivel2[] subnivel2;
	
	@XStreamImplicit
	private List<Grupo> grupos;
	
	public Regra() {
		
	}

	public Integer getInteiroDaRegra() {
		return inteiroDaRegra;
	}

	public void setInteiroDaRegra(Integer inteiroDaRegra) {
		this.inteiroDaRegra = inteiroDaRegra;
	}

	public String getStringDaRegra() {
		return stringDaRegra;
	}

	public void setStringDaRegra(String stringDaRegra) {
		this.stringDaRegra = stringDaRegra;
	}

	public Boolean getBooleanoDaRegra() {
		return booleanoDaRegra;
	}

	public void setBooleanoDaRegra(Boolean booleanoDaRegra) {
		this.booleanoDaRegra = booleanoDaRegra;
	}

	public RegraSubnivel1[] getSubnivel1() {
		return subnivel1;
	}

	public void setSubnivel1(RegraSubnivel1[] subniveis1) {
		this.subnivel1 = subniveis1;
	}

	public RegraSubnivel2[] getSubnivel2() {
		return subnivel2;
	}

	public void setSubnivel2(RegraSubnivel2[] subniveis2) {
		this.subnivel2 = subniveis2;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	
	

}
