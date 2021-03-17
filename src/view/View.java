package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Videos trending por país y categoría (req1)");
			System.out.println("2. Video Trending de país (req2)");
			System.out.println("3. Video Trending por categoría (req3)");
			System.out.println("4. Videos con más likes por país y tag (req4)");
			System.out.println("5. cerrar");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {
			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			System.out.println(modelo);
		}
}