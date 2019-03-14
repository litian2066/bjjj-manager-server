package net.greatsoft.bjjj.service.system;

import net.greatsoft.bjjj.entity.system.Org;
import net.greatsoft.bjjj.repository.system.OrgRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrgService {

    @Resource
    private OrgRepository orgRepository;

    public Org findOrgById(Long orgId) {
        return this.orgRepository.findOrgById(orgId);
    }
}
