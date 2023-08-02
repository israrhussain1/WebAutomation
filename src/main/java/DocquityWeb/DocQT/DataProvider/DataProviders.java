package DocquityWeb.DocQT.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "loginTest")
	public static Object[][] getLoginData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderSummaries")
	public static Object[][] getOptionsUnderSummariesData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/TestData/Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderSummariesDetailsTest")
	public static Object[][] getOptionsUnderSummariesDetailsData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(2); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderProceduralVideosDetailsTest")
	public static Object[][] getOptionsUnderProceduralVideosDetailsData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(3); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderGuidelineDetailsPageTest")
	public static Object[][] getOptionsUnderGuidelineDetailsPage() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(5); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderOriginalsArticlesDetailsPageTest")
	public static Object[][] getOptionsUnderOriginalsArticlesDetailsPageTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(6); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "RegistrationTestDataDoctor")
	public static Object[][] getRegistrationPageTestDataForDoctor() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(7); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RegistrationTestDataDentist")
	public static Object[][] getRegistrationPageTestDataForDentsit() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(8); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RegistrationTestDataMedicalStudent")
	public static Object[][] getRegistrationPageTestDataForMedicalStudent() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(9); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RegistrationTestDataDentalStudent")
	public static Object[][] getRegistrationPageTestDataForDentalStudent() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(10); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "loginTestDataNewUser")
	public static Object[][] getLoginTestDataForNewUser() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(11); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "RedirectionOptionsUnderLerningTest")
	public static Object[][] getRedirectionOptionsUnderLerning() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(12); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RedirectionOptionsUnderDiscussionsPageTest")
	public static Object[][] getRedirectionOptionsUnderDiscussions() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(13); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RedirectionOptionsUnderDocquityExclusiveTest")
	public static Object[][] getRedirectionOptionsUnderDocquityExclusive() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(14); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyAnotherUserPostTest")
	public static Object[][] getverifyAnotherUserPost() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(15); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "ToPostAsAnonymousTest")
	public static Object[][] getToPostAsAnonymous() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(16); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "ToDeleteUserPostTest")
	public static Object[][] getverifyToDeleteUserPost() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(17); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyToStartAPost")
	public static Object[][] getverifyToStartAPostTest() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(18);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderHeaderCalendarPageTest")
	public static Object[][] getverifyOptionsUnderHeaderCalendarPage() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(19); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "CMEPassTestData")
	public static Object[][] getCmePassTestData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(20); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}

		return data; // return data;
	}

	@DataProvider(name = "CMEFailTestData")
	public static Object[][] getCmeFailTestData() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(21); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}

		return data; // return data;
	}

	@DataProvider(name = "ConnectionPageTestData")
	public static Object[][] getConnectionsTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(22);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "SuggestionsSectionTestData")
	public static Object[][] getSuggestionsPageTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(23);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "ConnectionsSectionTestData")
	public static Object[][] getConnectionsPageTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(24);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "ConnectionPageLoginTD")
	public static Object[][] getRequiestSentPageTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(25);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RequestSentSectionTestData")
	public static Object[][] getRequiestSentSectionPageTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(26);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "ConnectionRequestAcceptTestData")
	public static Object[][] getConnectionRequestAcceptTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(27);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "CommunitySectionTestData")
	public static Object[][] getCommunitySectionTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(28);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "ShareLinkTestData")
	public static Object[][] getShareLinkTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(29); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderWebinarsPageTest")
	public static Object[][] getverifyOptionsUnderWebinarsPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(31); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderDStreamWebinarTest")
	public static Object[][] getverifyOptionsUnderDStreamWebinar() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(32); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderWebinarDetailsPageTest")
	public static Object[][] getverifyOptionsUnderWebinarDetailsPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(33); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderTypesOfWebinarPageTest")
	public static Object[][] getverifyOptionsUnderTypesOfWebinarPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(34); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	
	@DataProvider(name = "VerifySurveyUIPageTest")
	public static Object[][] getVerifySurveyUIPage() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(35); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifySurveyDetailsPageTest")
	public static Object[][] getverifySurveyDetailsPageTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(36); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyuserparticipatedInAnysurvey")
	public static Object[][] getverifyuserparticipatedInsurvey() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(37); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyOptionsUnderCompletedTabTest")
	public static Object[][] getverifyOptionsUnderCompletedTabTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(38); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyOptionsUnderClinicalCasesPageTest")
	public static Object[][] getverifyOptionsUnderClinicalCasesPageTest() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(39); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyClincalCasesDetailsPageTest")
	public static Object[][] getverifyClincalCasesDetailsPageTest() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(40); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "clickclinicalcasePageTest")
	public static Object[][] getclickclinicalcasePageTest() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(41); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "ChangeLanguageUnderSettings")
	public static Object[][] getChangeLanguageUnderSettingsUserMenu() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(42); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "OptionsUnderDiscussionPageTest")
	public static Object[][] getOptionsUnderDiscussionPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(43); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "OptionsUnderLearningPageTest")
	public static Object[][] getOptionsUnderLearning() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(44); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderDocquityExclusiveTest")
	public static Object[][] getverifyOptionsUnderDocquityExclusiveTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(45); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "RedirectionOptionsUnderHeaderPageTest")
	public static Object[][] getRedirectionOptionsUnderHeader() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(46); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyOptionsUnderUserDropdownTest")
	public static Object[][] getverifyOptionsUnderUserDropdown() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(47); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyRedirectionOptionsUnderUserDropdownTest")
	public static Object[][] getverifyRedirectionOptionsUnderUserDropdown() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(48); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "optionsUnderProceduralVideos")
	public static Object[][] getverifyoptionsUnderProceduralVideos() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(49); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyoptionsUnderOriginals")
	public static Object[][] getoptionsUnderOriginalsTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(50); // Collecting data from first sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "GlobalSearch_SearchContent_TestData")
	public static Object[][] getGlobalSearchTestData() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(51); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "GlobalSearch_VerifyContent_TestData2")
	public static Object[][] getGlobalSearchTestData2() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(52); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderOnlineEvent")
	public static Object[][] getverifyOptionsUnderOnlineEvent() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(53); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderOnlineEventDetailsTest")
	public static Object[][] getverifyOptionsUnderOnlineEventDetailsTest() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(54); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderEventItineraryPageTest")
	public static Object[][] getverifyOptionsUnderEventItineraryPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(55); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderSessionDetailsPageTest")
	public static Object[][] getverifyOptionsUnderSessionDetailsPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(56); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "OptionsUnderDoctalksDetails")
	public static Object[][] getOptionsUnderDoctalksDetails() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(57); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "OptionsUnderPharmaDetailsPage")
	public static Object[][] getOptionsUnderPharmaDetailsPage() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(58); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyOptionsUnderDoctalksTest")
	public static Object[][] getverifyOptionsUnderDoctalksPage() throws IOException {

		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(59); // Collecting data from 7th sheet in the workbook
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data;
	}

	@DataProvider(name = "verifyOptionsUnderChannelDetails")
	public static Object[][] getOptionsUnderPharmaDetailsPageTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(61); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "OptionsUnderchannels")
	public static Object[][] getOptionsUnderchannels() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(62); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}

	@DataProvider(name = "verifyOptionsUnderheaderTest")
	public static Object[][] getverifyOptionsUnderheaderTest() throws IOException {
		DataFormatter formattor = new DataFormatter();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//TestData//Staging_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(63); // Collecting data from third sheet in the workbook. For switching
		// between the sheets change the sheet number on line 56.
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount]; // Memory allocation to multi dimension array
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formattor.formatCellValue(cell);
			}
		}
		return data; // return data;
	}
}
