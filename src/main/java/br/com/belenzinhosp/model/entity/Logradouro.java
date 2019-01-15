package br.com.belenzinhosp.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "logradouros_belem")
public class Logradouro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_logr")
    private Integer id;

    @Column(name = "nome_logr")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
