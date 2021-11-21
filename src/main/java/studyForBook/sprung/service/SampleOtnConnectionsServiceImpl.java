package studyForBook.sprung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studyForBook.sprung.model.SampleOtnConnections;
import studyForBook.sprung.repository.SampleOtnConnectionsRepository;

import java.io.IOException;

@Service
public class SampleOtnConnectionsServiceImpl implements SampleOtnConnectionsService{

    @Autowired
    private SampleOtnConnectionsRepository sampleOtnConnectionsRepository;

    @Override
    public SampleOtnConnections put(SampleOtnConnections otn_connect) {
        otn_connect = sampleOtnConnectionsRepository.save(otn_connect);
        return otn_connect;
    }

    @Override
    public Iterable<SampleOtnConnections> get() {
        return sampleOtnConnectionsRepository.findAll();
    }


}
