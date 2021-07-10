package br.ce.crateus.santander.aulaazure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}

interface ClienteRepository extends MongoRepository<Client, String>{

}

@Component
class CosmosMongoExemplo{
	CosmosMongoExemplo(ClienteRepository repository){
		repository.save(new Client(null, "jander martins", "06571078325"));
		repository.findAll().forEach(System.out::println);
	}
}




@Document
@Data
class Client {

	@Id
	private String id;
	private String nome;
	private String cpf;

	public Client(String id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
}