package interfaces;

import java.io.IOException;

public interface MemoryControl {
	void save()throws IOException;
	void saveAs(String filePath) throws IOException ;
	void open(String filePath)throws IOException;
	void export(String filePath);
}
