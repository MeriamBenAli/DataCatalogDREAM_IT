package tn.esprit.datacatalog.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicy;

    private String name;
    private String rules;

    // Constructors, getters, setters, etc.

    // Assume you have getters and setters for all fields

    public int getIdPolicy() {
        return idPolicy;
    }

    public void setIdPolicy(int idPolicy) {
        this.idPolicy = idPolicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @ManyToMany(mappedBy="policys", cascade = CascadeType.ALL)
    private Set<MetaData> metadatas;
}


