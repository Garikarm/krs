package audio_1;

/**
* ��������� ����� ��� ������� ������ ����������� 
*/
public class korporateCalc {
/**
* ������� ����� ��� ������� ������ ��� ������������� �������� 
*/
	public String getP(int t, int k, int d, double f){ 
		/**
*����������, ������� ����� ���������� � ������ 
*/
		double V = 0; 
		/**
* ������������ ��������� ���������� ���� ��� ������ ���������� 
*/
		String str;
		
		/**
* ������� ��� ������� ������ ����������� 
*/
		V = (f*t*d*k)/1024 ;
		
		/**
*���������� �� ����� 
*/
		V = V * 100; 
		
		/**
* ���������� �� ����� 
*/
		int i = (int) Math.round(V); 
	 
		/**
*���������� �� ����� 
*/
		V = (double)i / 100; 
		 /**
* ��������������� ������������ ������� �� ���� double � String (��� ������) 
*/
			str = Double.toString(V); 
		/**
* ���������� ������ ��������� 
*/
		return str; 
	}
}

