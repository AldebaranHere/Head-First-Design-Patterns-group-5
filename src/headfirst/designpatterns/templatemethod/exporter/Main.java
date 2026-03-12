package headfirst.designpatterns.templatemethod.exporter;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- CSV Export Demonstration ---");
		DataExporter csvExportTask = new CSVExporter();
		csvExportTask.exportData();

		System.out.println("--- HTML Export Demonstration ---");
		DataExporter htmlExportTask = new HTMLExporter();
		htmlExportTask.exportData();
	}

}
