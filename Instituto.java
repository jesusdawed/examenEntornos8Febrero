package examenED8feb;

public class Instituto {
	/*Crea la clase Instituto que contendrá los atributos localidad, número de clases, un atributo booleano que indique si es público, 
	 *el nombre del director y un array de jefe de estudios. Cread getters, setters, constructores y toString. Realiza las pruebas unitarias
	 * con JUnit. Cuantas más pruebas y mayor sea el detalle de cada una de ellas, mayor nota obtendrás*/
	private String localidad;
	private int numeroDeClases;
	private boolean esPublico;
	private String director;
	private String[] jefeEstudios;
	Instituto(){
		this.localidad=null;
		this.numeroDeClases=0;
		this.esPublico=false;
		this.director=null;
		this.jefeEstudios=null;
	}
	Instituto(String l,int nC,String d){
		this.localidad=l;
		this.numeroDeClases=nC;
		this.esPublico=false;
		this.director=d;
		this.jefeEstudios=null;
	}
	Instituto(String l,int nC,boolean eP,String d,String jE[]){
		this.localidad=l;
		this.numeroDeClases=nC;
		this.esPublico=eP;
		this.director=d;
		String jefeEstudios[]=new String[jE.length];
		for (int i = 0; i < jE.length; i++) {
			jefeEstudios[i]=jE[i];
		}
	}
	public String getLocalidad() {
		return this.localidad;
	}
	public void setLocalidad(String l) {
		this.localidad=l;
	}
	public int getNumeroDeClases() {
		return this.numeroDeClases;
	}
	public void setNumeroDeClases(int nC) {
		this.numeroDeClases=nC;
	}
	public boolean getEsPublico() {
		return this.esPublico;
	}
	public void setEsPublico(boolean eP) {
		this.esPublico=eP;
	}
	public String getDirector() {
		return this.director;
	}
	public void setDirector(String d) {
		this.director=d;
	}
	public String[] getJefeEstudios() {
		return this.jefeEstudios;
	}
	public void setJefeEstudio(String jf[]) {
		this.jefeEstudios=jf;
	}
	public String toString() {
		return "El instituto en localidad "+this.localidad+" tiene "+this.numeroDeClases+" clases y publico es "+this.esPublico+", tiene como director a "+this.director+" y tiene los siguientes jefes de estudio: "+this.getJefeEstudios(); 
	}
}
