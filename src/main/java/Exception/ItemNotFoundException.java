package Exception;

import Entities.TipoPostazione;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(TipoPostazione tipoPostazione) {
        super("La postazione " + tipoPostazione + " non è stata trovata");
    }
}
