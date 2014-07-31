
public class PentagonoRegular {
//*Definimos nuestra variable
		int Lado;

		PentagonoRegular (int Lado)
		{
			this.Lado = Lado;
		}
//*Llamamos nuestra variable Lado
		int getLado ()
		{
			return Lado;
		}
//*Llamamos nuestra variable Lado pero con void por eso es "set"
		void setLado(int Lado)
		{
			this.Lado = Lado;
		}
//*Calculamos el perimetro multiplicando el Lado*5
//* Formula obtenida de fuente externa http://www.ditutor.com/geometria/perimetro_pentagono.html
		int getPerimetro ()
		{
			return Lado*5;
		}

		public static void main(String[] args) {


		}

	}

