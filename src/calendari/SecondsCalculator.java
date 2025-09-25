package calendari;

public class SecondsCalculator
{
	public long SegonsFins(int dia, int mes, int any, int hora, int minut, int segon)
	{
		long nSegonsTotal = 0;
		long nSegonsAny = 0;
		
		for (int iAny = 1980; iAny<any; ++iAny)
		{
			int nDiesAny = 365;

			if(IsAnyTraspas(iAny))
				nDiesAny = 366;

			nSegonsAny = nDiesAny*24*60*60;
			nSegonsTotal += nSegonsAny;
		}
		
		return nSegonsTotal;
	}
	
	private boolean IsAnyTraspas(int any)
	{
		boolean bTraspas = false;
		
		// Multiple de 4
		if(any%4==0)
		{
			bTraspas = true;
			
			// Multiple de 100
			if(any%100==0)
			{
				bTraspas = false;
				
				// Multiple de 400
				if(any%400==0)
				{
					bTraspas = true;
				}
			}
		}
		
		return bTraspas;
	}
	
	private int DiesDelMes(int mes, int any)
	{
		int n_dies = 0;
		int dies[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if(mes!=2)
			n_dies = dies[mes-1];
		else
		{
			if(IsAnyTraspas(any))
				n_dies = 29;
			else
				n_dies = 28;
		}
		
		return n_dies;
	}

	
	// Mètodes publics per poder fer testing
	
	public int getDiesDelMes(int mes, int any) {return DiesDelMes(mes,any);}
	public boolean getIsAnyTraspas(int any) {return IsAnyTraspas(any);}
}
