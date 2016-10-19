package be.teknyske.contactsselectionapplication;

import java.io.Serializable;

/**
 * Created by cerseilannister on 13/10/16.
 */

public class ContactObject implements Serializable{

    private String name;
    private String phone;
    private String website;

    public ContactObject(String name, String phone, String website) {
        this.name = name;
        this.phone = phone;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}
