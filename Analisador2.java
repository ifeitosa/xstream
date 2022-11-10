package analisador2.dumb;

import java.util.Arrays;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Analisador2 {
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.aliasSystemAttribute(null, "class");
		xstream.aliasPackage("", "analisador2.dumb");
		xstream.autodetectAnnotations(true);
		xstream.aliasAttribute(RegraSubnivel2.class, "inteiro", "inteiro");
		Configuracao configuracao = new Configuracao();
		Regra regra = new Regra();
		regra.setBooleanoDaRegra(true);
		regra.setInteiroDaRegra(12);
		regra.setStringDaRegra("texto da regra");
		configuracao.setRegras(new Regra[] {regra});
		RegraSubnivel1 nivel1 = new RegraSubnivel1();
		nivel1.setPropriedadeBooleana(false);
		nivel1.setPropriedadeInteira(12);
		nivel1.setPropriedadeString("Italo");
		
		RegraSubnivel2 nivel2 = new RegraSubnivel2();
		nivel2.setBooleano(true);
		nivel2.setInteiro(56);
		nivel2.setTexto("Texto de exemplo");
		
		regra.setSubnivel1(new RegraSubnivel1[] { nivel1 });
		regra.setSubnivel2(new RegraSubnivel2[] { nivel2 });
		Grupo grupo = new Grupo();
		grupo.setNomeGrupo("grupo");
		grupo.setNomeUsuario("usuário");
		regra.setGrupos(Arrays.asList(grupo));
		System.out.println(xstream.toXML(configuracao));
		
	}
}
