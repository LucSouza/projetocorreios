package com.projetocorreios.apirest.resources;
import java.util.List;
import com.projetocorreios.apirest.models.Tracking;
import com.projetocorreios.apirest.repository.TrackingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Track;


@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Tracking")
@CrossOrigin(origins = "*")
public class TrackingResource {

    @Autowired
    TrackingRepository trackingRepository;

    @GetMapping("/trackings")
    @ApiOperation(value="Lista os tracking")
    public List<Tracking> listaTrackings(){

        return trackingRepository.findAll();

    }
    @GetMapping("/tracking/{trackingCode}")
    @ApiOperation(value="Lista um tracking")
    public Tracking acharTracking(@PathVariable(value = "trackingCode") long trackingCode){

        return trackingRepository.findById(trackingCode);

    }
    @PostMapping("/tracking")
    @ApiOperation(value="Adiciona um tracking")
    public Tracking cadastraTracking(@RequestBody Tracking tracking){
        return trackingRepository.save(tracking);
    }

    @DeleteMapping("/tracking")
    @ApiOperation(value="Deleta um tracking")
    public void deleteTracking(@RequestBody Tracking tracking) {
        trackingRepository.delete(tracking);
    }
    @PutMapping("/tracking")
    @ApiOperation(value="Modifica um Tracking")
    public Tracking atualizarTracking(@RequestBody Tracking tracking)
    {
        return trackingRepository.save(tracking);
    }
}
