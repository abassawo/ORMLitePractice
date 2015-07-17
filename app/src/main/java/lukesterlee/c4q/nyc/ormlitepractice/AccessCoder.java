package lukesterlee.c4q.nyc.ormlitepractice;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by c4q-Abass on 7/16/15.
 */
@DatabaseTable
public class AccessCoder {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private int picture;

    @DatabaseField
    private String name;

    @DatabaseField
    private String gender;


    public AccessCoder(int picture, String name, String gender){
    this.picture = picture;
        this.name = name;
        this.gender = gender;
    }

    public AccessCoder(){
        this.name = "";
    }
}
