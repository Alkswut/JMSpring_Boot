package web.service;

import web.entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Role getRoleById(Long id);

    List<Role> getRolesList();

    Set<Role> getSetRoles(List<String> roles);
}