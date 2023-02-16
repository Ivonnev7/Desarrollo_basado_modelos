package PizzasSucursal;

import java.util.*;

abstract public class Pizza {
	String nombre;
	List<String> toppings = new ArrayList<>();

	public String getnombre() {
		return nombre;
	}

	public void preparar() {
                System.out.println(" ---> ");
		System.out.println("Preparando pizza " + nombre);
	}

	public void hornear() {
                System.out.println(" ---> ");
		System.out.println("Horneando pizza " + nombre);
	}

	public void cortar() {
                System.out.println(" ---> ");
		System.out.println("Cortando en trozos iguales " + nombre);
	}

	public void cajas() {
                System.out.println(" ---> ");
		System.out.println("Empaquetando " + nombre);
                System.out.println(" ---> ");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
                System.out.println("Ingredientes de la pizza: " + toppings);
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}