package br.com.belenzinhosp.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "ativ_prestador")
public class AtividadePrestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ativ_prest")
    private Integer id;

    @Column(name = "nome_ativ_prest")
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
