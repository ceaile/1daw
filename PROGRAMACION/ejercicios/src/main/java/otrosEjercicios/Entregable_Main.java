/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 */
package otrosEjercicios;

/**
 *
 * @author Admin
 */
public class Entregable_Main {

    public static void main(String[] args) {
        
        //array videojuegos y series
        Videojuego arrayVj[] = new Videojuego[5];
        Serie arraySr[] = new Serie[5];
        
        Videojuego pokemon = new Videojuego("Pokemon", "Aventura", "GameFreak", 40);
        Videojuego persona = new Videojuego("Persona", "RPG", "Atlus", 80);
        Videojuego pokemonUnite = new Videojuego ("Unite", "MMORPG", "Tencent", 10);
        Videojuego godOfWar = new Videojuego("God of War", "accion", "Santa Monica Studios", 90);
        Videojuego skyrim = new Videojuego("Skyrim", "RPG", "Bethesda", 100);
        
        Serie sense8 = new Serie("Sense8", "sobrenatural", "Lilly y Lana Wachowski", 2);
        Serie chicasDelCable = new Serie("Las chicas del cable", "drama histórico", "Gema Neira", 4);
        Serie wooAbogada = new Serie("Woo, abogada extraordiaria", "comedia, drama", "Yoo In-Sik", 1);
        Serie thirtynine = new Serie("Treinta y nueve", "drama", "Kim Sang-ho", 1);
        Serie startUp = new Serie("Start-up", "romance", "Oh Choong-hwan", 1);
        
        arrayVj[0] = pokemon;
        arrayVj[1] = persona;
        arrayVj[2] = pokemonUnite;
        arrayVj[3] = godOfWar;
        arrayVj[4] = skyrim;
        
        arraySr[0] = sense8;
        arraySr[1] = chicasDelCable;
        arraySr[2] = wooAbogada;
        arraySr[3] = thirtynine;
        arraySr[4] = startUp;
        
        chicasDelCable.Entregar();
        startUp.Entregar();
        sense8.Entregar();
        
        pokemon.Entregar();
        skyrim.Entregar();
        
        
        int contVjEntregados = 0;
        int contSrEntregados = 0;
        
        int maxHorasVj = 0;
        int posMaxHoras = 0;
        
        int maxTemporadasSr = 0;
        int posMaxTemporadas = 0;
         
        for (int i = 0; i < arrayVj.length; i++){
            //contar los entregados
            if (arrayVj[i].isEntregado()) contVjEntregados++;
            
            //buscar el videojuego con mayor numero de horas y su posicion
            if (arrayVj[i].getHorasEstimadas() > maxHorasVj) {
                maxHorasVj = arrayVj[i].getHorasEstimadas();
                posMaxHoras = i;
            }   
        }
        
        for (int i = 0; i < arraySr.length; i++){
            //contar entregados
            if (arrayVj[i].isEntregado()) contSrEntregados++;
            
            //buscar serie con mas temporadas y su posicion
            if (arraySr[i].getNumTemporadas() > maxTemporadasSr){
                maxTemporadasSr = arraySr[i].getNumTemporadas();
                posMaxTemporadas = i;
            }
        }
        
        System.out.println("El total de videojuegos entregados es:" + contVjEntregados);
        System.out.println("El total de series entregadas es:" + contSrEntregados);
        
        System.out.println("Info sobre el juego con máximo numero de horas:");
        System.out.println(arrayVj[posMaxHoras].toString()); //resultado= skyrim
        System.out.println("");
        
        System.out.println("info sobre la serie con mayor numero de temporadas:");
        System.out.println(arraySr[posMaxTemporadas].toString()); //chicas cable
        
        
        
        
    }
}
