package analisador2.dumb;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("nivel2")
public class RegraSubnivel2 {
	@XStreamAsAttribute
	private Integer inteiro;
	@XStreamAsAttribute
	private String texto;
	@XStreamAsAttribute
	private Boolean booleano;
	
	public RegraSubnivel2() {
		
	}

	public Integer getInteiro() {
		return inteiro;
	}

	public void setInteiro(Integer inteiro) {
		this.inteiro = inteiro;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Boolean getBooleano() {
		return booleano;
	}

	public void setBooleano(Boolean booleano) {
		this.booleano = booleano;
	}
	
	

}
