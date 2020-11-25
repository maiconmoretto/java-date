import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TesteData {

	public static void main(String[] args) {	
			dataJava8();
			dataChronoUnit();
			
	}
	
	public static void dataJava8() {
		LocalDate data1 = LocalDate.of(1987, 11, 28);
		LocalDate data2 = LocalDate.of(2020, 11, 24);
		
		System.out.println("diferenca em dias: " + 
				Period.between(data1, data2).getDays()
		);
		System.out.println("diferenca em mes: " + 
				Period.between(data1, data2).getMonths()
		);
		System.out.println("diferenca em anos: " + 
				Period.between(data1, data2).getYears()
		);
	} 
	
	public static void dataChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(1989, 06, 02, 11, 0);
		LocalDateTime data2 = LocalDateTime.of(2020, 11, 24, 21, 16);
		
		long diff = ChronoUnit.HOURS.between(data1, data2);
		
		System.out.println("diferenca em horas: " + diff);		
		
	}

}
