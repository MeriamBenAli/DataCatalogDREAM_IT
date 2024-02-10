package tn.esprit.datacatalog.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;


@Entity
public class DataObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDataObject;
    MetaData metaData ;

    @ManyToMany(mappedBy="dataobjects", cascade = CascadeType.ALL)
    private Set<Folder> folders;

    @ManyToMany(mappedBy="dataobjects", cascade = CascadeType.ALL)
    private Set<User> users;
}

