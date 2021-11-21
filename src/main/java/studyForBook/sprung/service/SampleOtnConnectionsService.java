package studyForBook.sprung.service;

import studyForBook.sprung.model.SampleOtnConnections;

import java.io.IOException;

public interface SampleOtnConnectionsService {

    SampleOtnConnections put(SampleOtnConnections otn_connect) throws IOException;

    Iterable<SampleOtnConnections> get();

}
