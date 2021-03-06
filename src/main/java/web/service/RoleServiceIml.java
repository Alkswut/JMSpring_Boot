package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.RoleRepository;
import web.entity.Role;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceIml implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceIml(RoleRepository roleDao) {
        this.roleRepository = roleDao;
    }

    @Transactional
    @Override
    public Role getRoleById(Long id) {
        return roleRepository.getById(id);
    }

    @Transactional
    @Override
    public List<Role> getRolesList() {
        return roleRepository.findAll();
    }

    @Transactional
    @Override
    public Set<Role> getSetRoles(List<String> roles) {
        Set<Role> setRoles = new HashSet<>();
        for (String id : roles) {
            setRoles.add(getRoleById(Long.parseLong(id)));
        }
        return setRoles;
    }
}
