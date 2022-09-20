package com.igorsily.audit;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@JaversSpringDataAuditable
public interface UnityRepository  extends JpaRepository<Unity, UUID> {
}
