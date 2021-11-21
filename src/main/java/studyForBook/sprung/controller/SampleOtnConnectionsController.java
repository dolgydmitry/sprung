package studyForBook.sprung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import studyForBook.sprung.model.Input;
import studyForBook.sprung.model.SampleOtnConnections;
import studyForBook.sprung.model.dtos.SampleOtnConnectionsDto;
import studyForBook.sprung.repository.SampleOtnConnectionsRepository;

import javax.validation.Valid;

@RestController
public class SampleOtnConnectionsController {

    @Autowired
    private SampleOtnConnectionsRepository sampleOtnConnectionsRepository;

    @RequestMapping(name = "/otn_connections", method = RequestMethod.GET, path = "/otn_connections")
    public Iterable<SampleOtnConnections> getConnections() {return sampleOtnConnectionsRepository.findAll();}

    @RequestMapping(
            name = "/otn_connections",
            method = RequestMethod.POST,
            path = "/otn_connections",
            consumes = {"application/json"})
    public SampleOtnConnections createOtnConnection(@Valid @RequestBody SampleOtnConnections otn_conn) {
        otn_conn = sampleOtnConnectionsRepository.save(otn_conn);
        return otn_conn;
    }

//    @RequestMapping(
//            name = "/otn_connections",
//            method = RequestMethod.POST,
//            path = "/otn_connections",
//            consumes = {"application/json"})
//    public ResponseEntity<SampleOtnConnections> validate(@Valid @RequestBody SampleOtnConnectionsDto otn_conn) {
//        SampleOtnConnections sampleOtnConnections = otn_conn.toOtnConnection();
//        sampleOtnConnections = sampleOtnConnectionsRepository.save(otn_conn);
//        return otn_conn;
//    }

//    @PostMapping("/testvalid")
//    public boolean isVali(@Valid @RequestBody SampleOtnConnections otn_conn) {
//        return isVali();
//    }

}
