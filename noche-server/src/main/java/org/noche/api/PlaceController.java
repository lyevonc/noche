package org.noche.api;

import dto.Line;
import dto.LocationInfo;
import dto.PlaceInfo;
import dto.Rank;
import org.noche.model.places.Bar;
import org.noche.model.places.Club;
import org.noche.model.places.Location;
import org.noche.model.places.Place;
import org.noche.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class PlaceController {

    //api/.../{event} => pathVariable
    // api?name=bla  => request param
    // POST with entity JSON => request body

    /* --- Static members --- */

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceController.class);

    /* --- Members --- */

    @Autowired
    private PlaceService placeService;

    /* --- Public methods --- */
    @RequestMapping(value = "/liat", method = RequestMethod.GET)
    public String check() {
        return "CHECK";
    }

    @RequestMapping(value = "/liat2", method = RequestMethod.GET)
    public void createBar() {
        Location l = new Location(31.222, 32.1111, "bat yam");
        placeService.saveLocation(l);
        Bar b = new Bar("check", l, "21:00-00:00", "wwww.web.com", "050-481006", Rank.HOT);
        placeService.saveBar(b);
    }

    @RequestMapping(value = "/createPlace/{kind}/{name}/", method = RequestMethod.GET)
    public void createPlace(@PathVariable(value = "name") String name2, @PathVariable(value = "kind") String kind) {

        switch (kind) {
            case "Bar": {
                /*Bar temp= new Bar(name2);
                placeService.saveBar(temp);
            }
            case "Club":
            {
                Club temp = new Club(name2,"roey cohen");
                placeService.saveClub(temp);*/
            }

        }
      /*  Bar bar = new Bar(Line.HAPPY_HOUR);

        bar.setName(name2);
        placeService.savePlace(temp);*/
//        Bar place = new Place(name2);
//        placeService.savePlace(place);
    }

//    @RequestMapping(value = "/createPlace", method = RequestMethod.GET)
//    public void createPlace2(@RequestParam(value = "name") String name) {
////        Place place = new Place(name);
////        placeService.savePlace(place);
//    }


//    @RequestMapping(value = "/createPlace", method = RequestMethod.POST)
//    public void createPlace3(@RequestBody Place place) {
//        placeService.savePlace(place);
//    }

//    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
//    public PlaceInfo findPlaceByName(@RequestParam(value = "name") String name) {
//        Place place = placeService.findByName(name);
//        LOGGER.info(place.getName());
//        return place.getInfo();
//    }
//
//    @RequestMapping(value = "/findPlacesByLocation", method = RequestMethod.POST)
//    public Collection<PlaceInfo> findPlacesByLocation(@RequestBody LocationInfo locationInfo) {
//        Collection<PlaceInfo> infos = new ArrayList<>();
//        List<Place> places = placeService.findAllPlacesByCity(locationInfo.getCity());
//        infos.addAll(places.stream().map(Place::getInfo).collect(Collectors.toList()));
//        return infos;
//    }

    @RequestMapping(value = "/getAllPlaces", method = RequestMethod.GET)
    public List<Bar> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    @RequestMapping(value = "/getAllBars", method = RequestMethod.GET)
    public List<Bar> getAllBars() {
        return placeService.getAllBars();
    }

    @RequestMapping(value = "/getFrontUrlBars", method = RequestMethod.GET)
    public List<String> getFrontUrlBars() {
        return placeService.getAllBarsFrontUrl();
    }

}