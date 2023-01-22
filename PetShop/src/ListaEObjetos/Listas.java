package ListaEObjetos;

import PetShop.Alimento;
import PetShop.Remedio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static Remedio gabapentina = new Remedio(101,"Gabapentina 50mg", new BigDecimal("90.00"));
    public static Remedio beneflora = new Remedio(201,"Beneflora VET", new BigDecimal("27.70"));
    public static Remedio amitriptilina = new Remedio(301,"Amitriptilina 6,25mg", new BigDecimal("17.40"));
    public static Alimento racaoGolden = new Alimento(101,"Ração Golden", new BigDecimal("79.00"));
    public static Alimento petiscoWhiskas = new Alimento(201,"Petisco Whiskas", new BigDecimal("7.10"));
    public static Alimento petiscoFriskies = new Alimento(202,"Petisco Friskies", new BigDecimal("6.20"));
    public static Alimento sacheChuru = new Alimento(301,"Sachê Churu", new BigDecimal("12.30"));

    public static ArrayList<Remedio> criaListaRemedios(){
        ArrayList<Remedio> remediosEmEstoque = new ArrayList<>();
        remediosEmEstoque.add(gabapentina);
        remediosEmEstoque.add(beneflora);
        remediosEmEstoque.add(amitriptilina);
        Collections.sort(remediosEmEstoque);
        return remediosEmEstoque;
    }
    public static ArrayList<Alimento> criaListaAlimentos() {
        ArrayList<Alimento> alimentosEmEstoque = new ArrayList<>();
        alimentosEmEstoque.add(petiscoFriskies);
        alimentosEmEstoque.add(petiscoWhiskas);
        alimentosEmEstoque.add(sacheChuru);
        alimentosEmEstoque.add(racaoGolden);
        Collections.sort(alimentosEmEstoque);
        return alimentosEmEstoque;
    }

}
