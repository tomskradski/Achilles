package com.radar.achilles.persist.repo;

import com.radar.achilles.persist.entity.AchillesItemEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Skradski on 7/27/2017.
 */
public interface AchillesItemEntityRepo extends CrudRepository<AchillesItemEntity, Long> {

    AchillesItemEntity findByItemId(Integer itemId);
}
