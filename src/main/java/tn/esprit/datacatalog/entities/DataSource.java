package tn.esprit.datacatalog.entities;

import javax.persistence.*;

@Entity
public class DataSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDataSource;

    private String name;
    private String type;
    private String localisation;
     private  String format ;

    public int getIdDataSource() {
        return idDataSource;
    }

    public void setIdDataSource(int idDataSource) {
        this.idDataSource = idDataSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    DataObject dataobject;
}

