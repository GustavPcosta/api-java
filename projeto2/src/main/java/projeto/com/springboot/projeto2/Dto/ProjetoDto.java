package projeto.com.springboot.projeto2.Dto;

public class ProjetoDto {

    @NotBlank
    private String projetoNome;
    @NotBlank
    @Size(max = 20)
    private String Email;
    @NotBlanck
    private String dataNascimento;
    @NotBlanck
    @Size(max = 11)
    private String cpf;
    @NotBlanck
    private String telefone;
    public Object getEmail;

}
