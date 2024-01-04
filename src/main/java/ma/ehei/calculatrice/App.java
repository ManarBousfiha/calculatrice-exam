package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculatrice.add(5, 5));
		Calculatrice calculatrice = new Calculatrice();
        int resultatAddition = calculatrice.addition(5, 7);
        System.out.println("Résultat de l'addition : " + resultatAddition);
    
	}
}
