package service;
/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */

public class MontantNegatifException extends Exception {
	/**
	 * constructeur
	 * @param message prends le msg en param
	 */

	public MontantNegatifException(String message) {

		super(message);
		
	}
}