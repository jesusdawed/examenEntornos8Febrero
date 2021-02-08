package examenED8feb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InstitutoTest {
Instituto Alonso;
	@Before
	public void setUp() throws Exception {
		String jf[]= {"Eleuterio","Fernando","Marta"};
		Alonso=new Instituto("�vila",100,true,"Emilio S�nchez",jf);
	}

	@Test
	public void testInstituto() {
		Instituto VascoDeLaZarza=new Instituto();
		assertNull(VascoDeLaZarza.getLocalidad());
		assertEquals(0,VascoDeLaZarza.getNumeroDeClases());
		assertEquals(false, VascoDeLaZarza.getEsPublico());
		assertNull(VascoDeLaZarza.getDirector());
		assertNull(VascoDeLaZarza.getJefeEstudios());
	}

	@Test
	public void testInstitutoStringIntString() {
		Instituto Santayana=new Instituto("�vila",50,"Sandra");
		assertEquals("�vila",Santayana.getLocalidad());
		assertEquals(50,Santayana.getNumeroDeClases());
		assertEquals(false,Santayana.getEsPublico());
		assertEquals("Sandra",Santayana.getDirector());
		assertNull(Santayana.getJefeEstudios());
	}

	@Test
	public void testInstitutoStringIntBooleanStringStringArray() {
		String jf[]= {"Domingo","Paula","Carlos"};
		Instituto Milagrosa=new Instituto("�vila",20,true,"Amadeo",jf);
		assertEquals("�vila",Milagrosa.getLocalidad());
		assertEquals(20,Milagrosa.getNumeroDeClases());
		assertEquals(true,Milagrosa.getEsPublico());
		assertEquals("Amadeo",Milagrosa.getDirector());
		assertNull(Milagrosa.getJefeEstudios());
	}

	@Test
	public void testGetLocalidad() {
		assertEquals("�vila",Alonso.getLocalidad());
	}

	@Test
	public void testSetLocalidad() {
		Alonso.setLocalidad("Madrid");
		assertEquals("Madrid",Alonso.getLocalidad());
	}

	@Test
	public void testGetNumeroDeClases() {
		assertEquals(100,Alonso.getNumeroDeClases());
	}

	@Test
	public void testSetNumeroDeClases() {
		Alonso.setNumeroDeClases(200);
		assertEquals(200,Alonso.getNumeroDeClases());
	}

	@Test
	public void testGetEsPublico() {
		assertEquals(true,Alonso.getEsPublico());
	}

	@Test
	public void testSetEsPublico() {
		Alonso.setEsPublico(false);
		assertEquals(false,Alonso.getEsPublico());
	}

	@Test
	public void testGetDirector() {
		assertEquals("Emilio S�nchez",Alonso.getDirector());
	}

	@Test
	public void testSetDirector() {
		Alonso.setDirector(null);
		assertNull(Alonso.getDirector());
	}

	@Test
	public void testGetJefeEstudios() {
		assertNull(Alonso.getJefeEstudios());
	}

	@Test
	public void testSetJefeEstudio() {
		String jf2[]= {"Rub�n","Javier","Manuel"};
		Alonso.setJefeEstudio(jf2);
		assertArrayEquals(jf2, Alonso.getJefeEstudios());
	}

	@Test
	public void testToString() {
		assertEquals("El instituto en localidad �vila tiene 100 clases y publico es true, tiene como director a Emilio S�nchez y tiene los siguientes jefes de estudio: null","El instituto en localidad "+Alonso.getLocalidad()+" tiene "+Alonso.getNumeroDeClases()+" clases y publico es "+Alonso.getEsPublico()+", tiene como director a "+Alonso.getDirector()+" y tiene los siguientes jefes de estudio: "+Alonso.getJefeEstudios());
	}

}
