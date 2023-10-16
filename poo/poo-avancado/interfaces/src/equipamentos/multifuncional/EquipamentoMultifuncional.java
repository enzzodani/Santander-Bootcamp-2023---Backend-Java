package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Impressora;
import equipamentos.digitalizadora.Digitalizadora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    public void copiar() {
        System.out.println("Copiando via Multi");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via multi");
    }
    public void imprimir() {
        System.out.println("Imprimindo via Multi");
    }
}
