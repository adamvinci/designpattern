import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTextePublisher {
	private static List<Observer> observers = new ArrayList<>();


	public static void main(String[] args) throws IOException {
		observers.add(new NombreMot());
		observers.add(new NombreLigne());
		observers.add(new NombreOccurenceMotParLigne("Belgium"));
		observers.add(new NombrePalindrome());
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader("seance1/src/input.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			String finalLigne = ligne;
			observers.forEach(observer -> observer.traiterLigne(finalLigne));
		}
		lecteurAvecBuffer.close();
		observers.forEach(Observer::printResult);


	}
}
