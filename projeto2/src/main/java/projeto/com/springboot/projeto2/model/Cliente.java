package projeto.com.springboot.projeto2.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlID;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Data
public class Cliente implements Serializable{
private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false,unique = true,length =10)
    private String nome;
    @Column(nullable = false,unique = true,length = 7)
    private String telefone;
    @Column(nullable = false,unique = true,length =11)
    private String email;
    @Column(nullable = false,unique = true,length = 20)
    private String dataDeNascimento;
    @Column(nullable = false, unique = true,length = 10)
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
