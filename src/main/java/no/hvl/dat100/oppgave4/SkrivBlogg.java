package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		File fil = new File(mappe, filnavn);
		
		try (FileWriter filewriter = new FileWriter(fil)) {
			filewriter.write(samling.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		
		try (Scanner scanner = new Scanner(fil)) {
			if (scanner.hasNextLine()) {
				return true;
			} else {
				return false;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
