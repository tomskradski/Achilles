package com.radar.achilles.persist.repo;

import com.radar.achilles.persist.entity.WalMartItemEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Skradski on 5/10/2017.
 */
public interface WalMartEntityRepo extends CrudRepository<WalMartItemEntity, Long>{
}
