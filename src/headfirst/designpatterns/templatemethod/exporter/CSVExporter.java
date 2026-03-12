package headfirst.designpatterns.templatemethod.exporter;

import java.util.Arrays;
import java.util.List;

public class CSVExporter extends DataExporter {
	public void formatData() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID,Username,Status\n");
		List<String[]> rawData = Arrays.asList(
			new String[]{"1", "User_Alpha", "Active"},
			new String[]{"2", "User_Beta", "Inactive"},
			new String[]{"3", "User_Gamma", "Active"},
			new String[]{"4", "User_Delta", "Pending"},
			new String[]{"5", "User_Epsilon", "Active"}
		);
		for (String[] row : rawData) {
			sb.append(String.join(",", row)).append("\n");
		}
		System.out.println(sb.toString());
	};
}
