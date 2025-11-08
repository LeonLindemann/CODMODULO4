package SesCuatro;

public class MainSesCuatro {
    public static void main(String[] args) {
        /*Persona oPersona = new Persona("Juan",27);
        Carro auto = new Carro();
        oPersona.conducir(auto);*/

        Persona oPersona = new Persona("Juan",27);

        
        System.out.println(oPersona.getNombre());
        oPersona.setNombre("Elias");
        System.out.println(oPersona.getNombre());
        //System.out.println(oPersona.nombre);
        
    }
}
