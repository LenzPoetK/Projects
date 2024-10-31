package br.com.logic_blocks.logic_blocks_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="users") //dando nome à tabela
@Entity //indicando que vai ser uma tabela do banco
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //é sempre acompanhado do @Entity
    @Id //serve para especificar que esse campo ficará reservado para a primary key
    @GeneratedValue(strategy=GenerationType.SEQUENCE) //Serve para dizer que o campo Id irá se auto-incrementar
    @Column(name="user_id")
    private Long id;

    @JsonProperty("user_name")
    @Column(name="user_name", length=200, nullable=true)
    private String name;

    @JsonProperty("user_email")
    @Column(name="user_email", length=50, nullable=true)
    private String email;

    @JsonProperty("user_password")
    @Column(name="user_password", columnDefinition="TEXT", nullable=true)
    private String password;
}
