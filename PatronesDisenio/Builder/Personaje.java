package PatronesDisenio.Builder;

public class Personaje {
    private String nombre;
    private String clase;
    private int salud;
    private int fuerza;
    private int inteligencia;

    private Personaje() {}
    

    //Builder interno
    public static class Builder {
        private Personaje personaje;

        public Builder() {
            personaje = new Personaje();
        }

        public Builder conNombre(String nombre) {
            personaje.nombre = nombre;
            return this;
        }

        public Builder conClase(String clase) {
            personaje.clase = clase;
            return this;
        }

        public Builder conSalud(int salud) {
            personaje.salud = salud;
            return this;
        }

        public Builder conFuerza(int fuerza) {
            personaje.fuerza = fuerza;
            return this;
        }

        public Builder conInteligencia(int inteligencia) {
            personaje.inteligencia = inteligencia;
            return this;
        }

        public Personaje build() {
            return personaje;
        }
    }
}
