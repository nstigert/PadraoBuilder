public class CarroBuilder {

    private Carro carro;

    public CarroBuilder(){
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inexistente");
        }
        if (carro.getAnoFabricacao() == 0){
            throw new IllegalArgumentException("Ano inexistente");
        }
        if (carro.getMarca().equals("")){
            throw new IllegalArgumentException("Marca inexistente");
        }
        return carro;
    }

    public CarroBuilder setModelo(String modelo) {
        this.carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setAnoFabricacao(int anoFabricacao) {
        this.carro.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public CarroBuilder setMarca(String marca) {
        this.carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setNumPortas(int numPortas) {
        this.carro.setNumPortas(numPortas);
        return this;
    }

    public CarroBuilder setPreco(double preco) {
        this.carro.setPreco(preco);
        return this;
    }
}
