package headfirst.designpatterns.templatemethod.exporter;

import java.util.Arrays;
import java.util.List;

public class HTMLExporter extends DataExporter {
	public void formatData() {
		StringBuilder sb = new StringBuilder();
		sb.append("<table border='1'>\n  <tr><th>ID</th><th>User</th><th>Status</th></tr>\n");
		List<String[]> rawData = Arrays.asList(
			new String[]{"1", "User_Alpha", "Active"},
			new String[]{"2", "User_Beta", "Inactive"},
			new String[]{"3", "User_Gamma", "Active"},
			new String[]{"4", "User_Delta", "Pending"},
			new String[]{"5", "User_Epsilon", "Active"}
		);
		for (String[] row : rawData) {
			sb.append("  <tr><td>")
				.append(String.join("</td><td>", row))
				.append("</td></tr>\n");
		}
		sb.append("</table>");
		System.out.println(sb.toString());
	};
}
