import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTextePublisher {
	List<Observer> observers = new ArrayList<>();
	public AnalyseurDeTextePublisher() {
		observers.add(new NombreMot());
		observers.add(new NombreLigne());
		observers.add(new NombreOccurenceMotParLigne("Belgium"));
		observers.add(new NombrePalindrome());
	}
	private void readFile()throws IOException{
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

	public static void main(String[] args) throws IOException {
	AnalyseurDeTextePublisher analyseurDeTextePublisher =new AnalyseurDeTextePublisher();
	analyseurDeTextePublisher.readFile();
	}
}
