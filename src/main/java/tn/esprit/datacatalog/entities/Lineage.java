package tn.esprit.datacatalog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
public class Lineage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLineage;

    private Map<String, String> accessPoints; // Assuming user is represented by String
    private Date date;
    private Action action;

    // Constructors, getters, setters, etc.

    // Assume you have getters and setters for all fields

    public int getIdLineage() {
        return idLineage;
    }

    public void setIdLineage(int idLineage) {
        this.idLineage = idLineage;
    }

    public Map<String, String> getAccessPoints() {
        return accessPoints;
    }

    public void setAccessPoints(Map<String, String> accessPoints) {
        this.accessPoints = accessPoints;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
