package net.greatsoft.bjjj.repository.system;

import net.greatsoft.bjjj.entity.system.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Org, Long> {

    public Org findOrgById(Long orgId);
}
