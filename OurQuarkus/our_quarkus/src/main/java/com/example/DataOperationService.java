package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class DataOperationService {
    @Inject
    EntityManager em;

    @Transactional
    public Sample createSample(Long id, String name, String description) {
        Sample sample = new Sample();

        sample.id = id;
        sample.name = name;
        sample.description = description;
        sample.created_date = sample.updated_date = LocalDateTime.now();

        em.persist(sample);
        return sample;
    }

    public List<Sample> getAllSample(){
        return Sample.listAll();
    }

    public Sample getSample(Long id) {
        return em.find(Sample.class, id);
    }

    public Sample modifySample(Long id, String name, String description){
        Sample sample = getSample(id);
        sample.name = name;
        sample.description = description;
        sample.updated_date = LocalDateTime.now();
        em.merge(sample);
        return sample;
    }

    public void deleteSample(Long id){
        Sample sample = getSample(id);
        if(sample != null)
            em.remove(sample);
    }
}
