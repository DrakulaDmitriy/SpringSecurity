package web.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role", unique = true)
    private String userRole;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String getAuthority() {
        return userRole;
    }

    @Override
    public String toString() {
        return userRole;
    }
}