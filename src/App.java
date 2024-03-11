import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) throws Exception {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d2 = LocalDate.parse("10/05/2017", fmt);



		System.out.println();
		System.out.print("Data = " + fmt.format(d2));
		System.out.println();

	}

}
