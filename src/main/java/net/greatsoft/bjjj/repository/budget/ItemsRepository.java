package net.greatsoft.bjjj.repository.budget;

import net.greatsoft.bjjj.entity.budget.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, String> {
    
}
