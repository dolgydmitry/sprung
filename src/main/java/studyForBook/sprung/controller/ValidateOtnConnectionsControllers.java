package studyForBook.sprung.controller;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import studyForBook.sprung.model.SampleOtnConnections;
import studyForBook.sprung.model.dtos.SampleOtnConnectionsDto;
import studyForBook.sprung.service.SampleOtnConnectionsService;
import studyForBook.sprung.service.SampleOtnConnectionsServiceImpl;

import javax.validation.Valid;
import java.io.IOException;

@RequestMapping(value = "/validate")
@RestController

public class ValidateOtnConnectionsControllers {

    private static final Logger logger = LoggerFactory.getLogger(ValidateOtnConnectionsControllers.class);

    private final SampleOtnConnectionsServiceImpl sampleOtnConnectionsServiceImpl;

    public ValidateOtnConnectionsControllers(SampleOtnConnectionsServiceImpl sampleOtnConnectionsServiceImpl) {
        this.sampleOtnConnectionsServiceImpl = sampleOtnConnectionsServiceImpl;
    }

//    @PostMapping("/add_new_service")
//    public ResponseEntity<SampleOtnConnections> createService(@RequestBody SampleOtnConnections otn_connect) {
//        logger.info("start create otn connection ", otn_connect);
//        SampleOtnConnections service = sampleOtnConnectionsServiceImpl.put(otn_connect);
//        return new ResponseEntity<>(service, HttpStatus.CREATED);
//    }

    @PostMapping("/add_new_service")
    public ResponseEntity<SampleOtnConnections> createService(@Valid @RequestBody SampleOtnConnectionsDto otn_connectDto) {
        logger.info("start validate OK " +  otn_connectDto.toString());
        SampleOtnConnections service = sampleOtnConnectionsServiceImpl.put(otn_connectDto.toOtnConnection());
        logger.info("create new otn connection " + service.toString());
        return new ResponseEntity<>(service, HttpStatus.CREATED);
    }

    @GetMapping("/show_all")
    public ResponseEntity<Iterable> showAll(){
        return new ResponseEntity<>(sampleOtnConnectionsServiceImpl.get(), HttpStatus.ACCEPTED);
    }

}
