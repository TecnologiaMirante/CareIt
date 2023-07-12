package com.pmoc.mirante.models.roles;

import com.pmoc.mirante.enums.RoleName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

@Entity
@Table(name = "TB_ROLE")
@Getter
@Setter
public class RoleModel implements GrantedAuthority, Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;
    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }
}
