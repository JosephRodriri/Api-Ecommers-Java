package co.edu.ucc.jose.Estado;

public class GestorEstados {
    private PedidoMemento estadoGuardado;

    public void guardar(PedidoMemento memento) {
        this.estadoGuardado = memento;
    }

    public PedidoMemento recuperar() {
        return estadoGuardado;
    }
}
