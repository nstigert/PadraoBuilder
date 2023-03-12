import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setAnoFabricacao(2013)
                    .setMarca("Ford")
                    .build();
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Modelo inexistente", e.getMessage());
        }
            }

    @Test
    void deveRetornarExcecaoParaCarroSemAno() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Fiesta")
                    .setMarca("Ford")
                    .build();
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Ano inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setAnoFabricacao(2013)
                    .setModelo("Fiesta")
                    .build();
            fail();

        } catch (IllegalArgumentException e){
            assertEquals("Marca inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setAnoFabricacao(2013)
                .setModelo("Fiesta")
                .setMarca("Ford")
                .setPreco(1000.0)
                .setNumPortas(4)
                .build();

        assertNotNull(carro);
        assertEquals(2013, carro.getAnoFabricacao());
        assertEquals("Fiesta", carro.getModelo());
        assertEquals("Ford", carro.getMarca());
        assertEquals(1000.0, carro.getPreco());
        assertEquals(4, carro.getNumPortas());
    }
}