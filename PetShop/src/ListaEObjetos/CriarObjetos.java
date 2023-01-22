package ListaEObjetos;

import Animal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CriarObjetos {
        static ArrayList<EsquemaVacinal> vacinasRamon = EsquemaVacinal.retornaEsquemaVacinal("AB");
        static ArrayList<EsquemaVacinal> vacinasMatilda = EsquemaVacinal.retornaEsquemaVacinal("AB");
        static ArrayList<EsquemaVacinal> vacinasDori = EsquemaVacinal.retornaEsquemaVacinal("A");

        public static Gato criaGato1(){
            return new Gato("Ramón", LocalDate.of(2018,5,10),
                    "SRD", Porte.PEQUENO, 5.1, EstadoAnimal.NORMAL, vacinasRamon, "Gato preguiçoso");
        }
        public static Gato criaGato2(){
            return new Gato("Matilda", LocalDate.of(2018,5,10),
                    "SRD", Porte.PEQUENO, 5.6, EstadoAnimal.NORMAL, vacinasMatilda, "Gata estressada");
        }
        public static Cachorro criaCachorro1(){
            return new Cachorro("Dori", LocalDate.of(2015,7,6), "Dálmata",
                    Porte.GRANDE, 11.7, EstadoAnimal.SUJO, vacinasDori, "Cachorra Carente");
        }
        public static List<EsquemaVacinal> retornaVacinas(){
            return vacinasDori;
        }
    }

