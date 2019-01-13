package br.com.belenzinhosp.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_comercio")
public class TipoComercio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_com")
    private Integer id;

    @Column(name = "com_nome")
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
