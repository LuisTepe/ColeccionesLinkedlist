import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
public class coleccion {
    public static void ColeccionNumeros(){
        int sum=0;
        float prom;
        LinkedList col = new LinkedList();
        System.out.println("Generando numeros aleatorios");
        for(int i=0 ; i<25 ; i++){
            col.add((int)(Math.random()*101));
            System.out.print(col.get(i)+" ");
            sum += (int) col.get(i);
        }
        col.sort(Comparator.naturalOrder());
        prom=(float) sum/25;
        System.out.println(" ");
        System.out.println("LinkedList ordenada:");
        for(int i=0 ; i<25 ; i++){
            System.out.println(col.get(i)+" ");
        }
        System.out.println("La suma de los elementos es : "+sum);
        System.out.println("El promedio de los elementos es: "+prom);

    }
    public static void ColeccionCadena(){
        LinkedList col = new LinkedList();
        Random random= new Random();
        String setOfCharacters = "abcdefghijklmniopqrstuvwxyz";
        int randomInt=0;
        char randomChar;
        System.out.println("");
        System.out.println("LinkedList");
        for(int i=0 ; i<10 ; i++){
            randomInt = random.nextInt(setOfCharacters.length());
            col.add(setOfCharacters.charAt(randomInt));
            System.out.println(col.get(i));
        }
        Collections.reverse(col);
        System.out.println("");
        System.out.println("LinkedList Invertida");
        for(int i=0 ; i<10 ; i++){
            System.out.println(col.get(i));
        }
    }
    public static void main(String[] args){
        ColeccionNumeros();
        ColeccionCadena();
    }
}
