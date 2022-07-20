package entity;

public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long stuId;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getstuId() {
        return stuId;
    }

    public void setstuId(Long userId) {
        this.stuId = stuId;
    }

    public Contact() {
    }

    public Contact(Long cId, String email, String contactName, Long stuId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.stuId = stuId;
    }
}
