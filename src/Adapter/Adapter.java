package Adapter;

public class Adapter extends CSVReader implements FileReader{

	@Override
	public void read(String filename) {
		ReadCSV(filename);
	}
}
