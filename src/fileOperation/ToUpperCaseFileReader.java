package fileOperation;

public class ToUpperCaseFileReader extends AbstractFileReader {

	protected ToUpperCaseFileReader(String filePath) {
		super(filePath);		
	}

	@Override
	protected String parseLine(String line) {
		return line.toUpperCase();
	}
}
