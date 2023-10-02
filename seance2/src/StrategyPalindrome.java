import java.io.*;
import java.util.StringTokenizer;

public class StrategyPalindrome implements Strategy{

	private boolean estPalindrome(String mot) {
		if (mot == null)
			return false;
		StringBuilder stringbuffer = new StringBuilder(mot);
		return mot.equals(stringbuffer.reverse().toString());
	}

	@Override
	public boolean imprimerSi(String s) {
		return estPalindrome(s);
	}

}
