public class Rectangulo {
//*Creamos nuestras variables
	public int Base;
	public int Altura;

	Rectangulo(int Base, int Altura)
	{
		this.Base = Base;
		this.Altura = Altura;
	}
//*Llamamos el valor de Base
	int getBase ()
	{
		return Base;
	}
//*Llamamos el valor de Base pero con void por eso es "set"
	void setBase (int Base)
	{
		this.Base = Base;
	}
//*Llamamos el valor de Altura
	int getAltura ()
	{
		return Altura;
	}
//*Llamamos el valor de Altura pero con void por eso es "set"
	void setAltura (int Altura)
	{
		this.Altura = Altura;
	}
//*Calcularemos el area multiplicando nuestras variables Base y Area
	int getArea()
	{
		return Base*Altura;
	}
//*Calcularemos el perimetro utizilando la formula (Base*2)+(Altura*2)
//*Formula obtenida del fuente http://www.ditutor.com/geometria/perimetro_rectangulo.html
	int getPerimetro()
	{
		return ((Base*2)+(Altura*2));
	}

	public static void main(String[] args) {


	}

}