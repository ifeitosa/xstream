package analisador2.dumb;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("configuracao")
public class Configuracao {

	@XStreamAsAttribute
	private Integer atributoInteiro;
	@XStreamAsAttribute
	private String atributoString;
	@XStreamAsAttribute
	private Boolean atributoBooleano;

	private Regra[] regras;
	private Servidor[] servidores;
	private Grupo[] grupos;
	
	public Configuracao() {
		
	}

	public Integer getAtributoInteiro() {
		return atributoInteiro;
	}

	public void setAtributoInteiro(Integer atributoInteiro) {
		this.atributoInteiro = atributoInteiro;
	}

	public String getAtributoString() {
		return atributoString;
	}

	public void setAtributoString(String atributoString) {
		this.atributoString = atributoString;
	}

	public Boolean getAtributoBooleano() {
		return atributoBooleano;
	}

	public void setAtributoBooleano(Boolean atributoBooleano) {
		this.atributoBooleano = atributoBooleano;
	}
	
	

	public Regra[] getRegras() {
		return regras;
	}

	public void setRegras(Regra[] regras) {
		this.regras = regras;
	}

	public Servidor[] getServidores() {
		return servidores;
	}

	public void setServidores(Servidor[] servidores) {
		this.servidores = servidores;
	}

	public Grupo[] getGrupos() {
		return grupos;
	}

	public void setGrupos(Grupo[] grupos) {
		this.grupos = grupos;
	}

	
}
