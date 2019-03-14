package net.greatsoft.bjjj.repository.system;

import net.greatsoft.bjjj.entity.system.UserSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSystemRepository extends JpaRepository<UserSystem, Long> {

    UserSystem findUserByDisplayNameAndPassword(String username, String password);
}
