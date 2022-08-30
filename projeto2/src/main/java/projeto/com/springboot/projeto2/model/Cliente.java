package projeto.com.springboot.projeto2.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlID;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String dataDeNascimento;
    @Column(nullable = false)
    private String cpf;
   
    public Cliente(long id,String nome,String telefone,String email,String cpf,String dataDeNascimento){
        
    this.id =id;
    this.nome = nome;
    this.telefone = telefone;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
    this.email = email;
    }
}
