package br.com.amigodaspatinhas;

import java.time.LocalDate;

import br.com.amigodaspatinhas.animais.Animal;
import br.com.amigodaspatinhas.animais.Diagnostico;
import br.com.amigodaspatinhas.animais.Doenca;
import br.com.amigodaspatinhas.animais.FotoAnimal;
import br.com.amigodaspatinhas.animais.Vacina;
import br.com.amigodaspatinhas.animais.Vacinacao;
import br.com.amigodaspatinhas.usuarios.Administrador;
import br.com.amigodaspatinhas.usuarios.UsuarioComum;
import br.com.amigodaspatinhas.usuarios.Voluntario;
import br.com.amigodaspatinhas.util.Endereco;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Adoção Animal ===\n");

        // ===== ADMINISTRADOR =====
        Administrador admin = new Administrador("Alice", "alice@email.com", "admin123", 1);
        admin.criarConta(admin.getNome(), admin.getEmail(), admin.getSenha());
        admin.login("alice@email.com", "admin123");
        admin.gerenciarSistema();
        admin.logout();

        System.out.println("\n----------------\n");

        // ===== USUÁRIO COMUM =====
        Endereco enderecoUsuario = new Endereco(
            "Rua das Flores", 123, "Centro", "Fortaleza", "CE", "60000-000"
        );
        LocalDate nascimentoUsuario = LocalDate.of(2000, 4, 10); // 10/04/2000
        UsuarioComum usuario = new UsuarioComum(
            "Bob", "bob@email.com", "user123",
            "12345678900", "RG123456",
            "85 99999-9999", enderecoUsuario,
            nascimentoUsuario
        );
        usuario.criarConta(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
        usuario.login(usuario.getEmail(), usuario.getSenha());
        usuario.getEndereco().validar();

        System.out.println("\n----------------\n");

        // ===== VOLUNTÁRIO =====
        Endereco enderecoVoluntario = new Endereco(
            "Av. Principal", 456, "Bairro Novo", "Fortaleza", "CE", "60123-000"
        );
        Voluntario voluntario = new Voluntario(
            "Carla", "carla@email.com", "98765432100",
            "85 98888-7777", enderecoVoluntario,
            1, // status ativo
            15 // disponibilidade (horas semanais)
        );
        voluntario.cuidarAnimal();

        System.out.println("\n----------------\n");

        // ===== ANIMAL COMPLETO =====
        FotoAnimal foto = new FotoAnimal(
            "https://site.com/toby.jpg", "Toby brincando no parque"
        );
        LocalDate nascimentoAnimal = LocalDate.of(2020, 6, 15); // 15/06/2020
        Animal animal = new Animal(
            "Toby", "Cão", "Médio", 'M',
            nascimentoAnimal,
            true, // castrado
            0,    // status adoção: disponível
            foto
        );
        animal.exibirInformacoes();

        System.out.println("\n----------------\n");

        // ===== VACINAÇÃO =====
        LocalDate validadeVacina = LocalDate.of(2026, 12, 31); // 31/12/2026
        Vacina vacina = new Vacina("Raiva", "PetPharma", validadeVacina);
        Vacinacao vacinacao = new Vacinacao(LocalDate.now(), vacina); // dataAplicacao = hoje
        vacinacao.registrar();

        System.out.println("\n----------------\n");

        // ===== DOENÇA E DIAGNÓSTICO =====
        Doenca doenca = new Doenca("Cinomose", "Doença viral que afeta cães");
        doenca.exibir();

        Diagnostico diagnostico = new Diagnostico(LocalDate.now(), "Animal saudável e pronto para adoção.");
        diagnostico.diagnosticar();

        System.out.println("\n----------------\n");

        // ===== SOLICITAÇÃO DE ADOÇÃO =====
        usuario.solicitarAdocao(animal); // Usuário solicita adoção do animal

        System.out.println("\n----------------\n");

        System.out.println("=== Fim da simulação do sistema ===");
    }
}