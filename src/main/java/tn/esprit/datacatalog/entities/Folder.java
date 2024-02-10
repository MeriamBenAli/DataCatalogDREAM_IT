package tn.esprit.datacatalog.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;


@Entity
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFolder;
    private double size ;
    private int content ;
    private String folderName  ;
    private String createdBy ;
    private Date date ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DataObject> dataobjects;
}
