package src.funcionariosStarlabs.model;

public class NodeCargo {
    public Cargo cargo;
    public NodeCargo leftChild;
    public NodeCargo rightChild;

    public NodeCargo(Cargo cargo) {
        this.cargo = cargo;
        this.leftChild = null;
        this.rightChild = null;
    }
}
