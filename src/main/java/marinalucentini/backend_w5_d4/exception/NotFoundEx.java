package marinalucentini.backend_w5_d4.exception;

public class NotFoundEx extends RuntimeException {

        public NotFoundEx(long id) {
            super("Il record con id " + id + " non è stato trovato!");

    }
}
