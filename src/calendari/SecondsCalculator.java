package calendari;

public class SecondsCalculator
{
	public long SegonsFins(int dia, int mes, int any, int hora, int minut, int segon);
	
	private boolean IsAnyTraspas(int any);
	
	private int DiesDelMes(int mes, int any)
	{
		int dies[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		return dies[mes-1];
	}

	
	// Mètodes publics per poder fer testing
	
	public int getDiesDelMes(int mes, int any) {return DiesDelMes(mes,any);}
}
