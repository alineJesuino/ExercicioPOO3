package SistemaAmigo.ufpb.POO.Aline;

public class AmigoInexistenteException extends Throwable {
        public class AmigoJaExisteException extends Exception {

            public AmigoJaExisteException() {
                super("Já existe um amigo cadastrado com o mesmo e-mail.");
            }

            public AmigoJaExisteException(String message) {
                super(message);
            }


        }
}

