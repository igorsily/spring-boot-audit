package com.igorsily.audit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnityService {

    private final UnityRepository unityRepository;

    public Unity save(Unity unity){
        return  this.unityRepository.save(unity);
    }

    public Unity update(Unity unity){
        return  this.unityRepository.save(unity);
    }
}
