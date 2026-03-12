package headfirst.designpatterns.templatemethod.exporter;

import java.util.Arrays;
import java.util.List;

public abstract class DataExporter {

	public final void exportData() {
		readFromDatabase();
		formatData();
		saveToFile();
	}

	private void readFromDatabase() {
		System.out.println("Reading from database.");
		List<String[]> rawData = Arrays.asList(
			new String[]{"1", "User_Alpha", "Active"},
			new String[]{"2", "User_Beta", "Inactive"},
			new String[]{"3", "User_Gamma", "Active"},
			new String[]{"4", "User_Delta", "Pending"},
			new String[]{"5", "User_Epsilon", "Active"}
		);
		System.out.println("[DB] Retrieved " + rawData.size() + " rows.");
		for (String[] row : rawData) {
			System.out.println(row[0] + " " + row[1] + " " + row[2]);
		}
	}

	protected abstract void formatData();

	private void saveToFile() {
		System.out.println("Writing formatted content to physical file storage.");
		System.out.println("Export Complete.\n");
	}
}
