package tn.esprit.datacatalog.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMetaData;

    private String nomNaturel;
    private int size;
    private String champs;

    // Constructors, getters, setters, etc.

    // Assume you have getters and setters for all fields

    public int getIdMetaData() {
        return idMetaData;
    }

    public void setIdMetaData(int idMetaData) {
        this.idMetaData = idMetaData;
    }

    public String getNomNaturel() {
        return nomNaturel;
    }

    public void setNomNaturel(String nomNaturel) {
        this.nomNaturel = nomNaturel;
    }

    public int getsize() {
        return size;
    }

    public void setsize(int size) {
        this.size = size;
    }

    public String getChamps() {
        return champs;
    }

    public void setChamps(String champs) {
        this.champs = champs;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    DataObject dataobject;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Policy> policys;

    @OneToOne
    private Documentation documentation ;
    @ManyToOne(cascade = CascadeType.ALL)
    Lineage lineage;



}
