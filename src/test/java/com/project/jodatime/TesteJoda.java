package com.project.jodatime;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;



public class TesteJoda {
	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
	
	@Test
	public void jodaTimer() {
		assertNotEquals(d.format(new Date()), new Tempo().getHora(), 0.1);
	}

}
