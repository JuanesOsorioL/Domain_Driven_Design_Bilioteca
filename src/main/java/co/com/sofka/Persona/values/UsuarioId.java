package co.com.sofka.Persona.values;


import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity {

        private UsuarioId(String value){
            super(value);
        }

        public UsuarioId(){

        }

        public static UsuarioId of(String value){
            return new UsuarioId(value);
        }
}
