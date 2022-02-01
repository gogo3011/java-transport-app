package entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="client")
public class Client implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    
    @OneToMany
    @JoinColumn(name = "sender_id")
    private Set<Transport> sent;

    public Client() {
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Transport> getSent() {
        return sent;
    }

    public void setSent(Set<Transport> transports) {
        this.sent = transports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(sent, client.sent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sent);
    }
}
