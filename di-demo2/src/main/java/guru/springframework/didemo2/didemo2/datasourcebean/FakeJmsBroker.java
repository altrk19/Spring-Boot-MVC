package guru.springframework.didemo2.didemo2.datasourcebean;

public class FakeJmsBroker {
    private String jmsUser;
    private String jmsPassword;
    private String jmsUrl;

    public String getJmsUser() {
        return jmsUser;
    }

    public void setJmsUser(String jmsUser) {
        this.jmsUser = jmsUser;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
