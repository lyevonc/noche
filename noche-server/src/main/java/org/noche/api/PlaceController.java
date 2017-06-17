package org.noche.api;

import dto.*;
import org.apache.commons.lang.ObjectUtils;
import org.noche.algo.Distance;
import org.noche.model.places.*;
import org.noche.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


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
    @RequestMapping(value = "/getAllPlaces", method = RequestMethod.GET)
    public List<Bar> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    /* --- Test Sestion --- */
@RequestMapping(value = "/getClosestPlaces")
public double distance ()
{
Location user = new Location(32.028517, 34.747297,"bat yam");
Location place =new Location(32.022664, 34.744241,"bat yam");
    return new Distance().Calc(user,place);
}
    @RequestMapping(value = "/liat/{lat}/{lon}/"/*, method = RequestMethod.GET*/)
    public double check(@PathVariable(value = "lat")double lat,@PathVariable(value = "lon")double lon,
                        @PathVariable(value = "city")String city) {
    Location temp = new Location(lat,lon,"bat yam");

 placeService.saveLocation(temp);
 System.out.println(temp);
        return lat-lon;
    }
    /* --- Bar Section -- */
    @RequestMapping(value = "/getAllBars", method = RequestMethod.GET)
    public List<Bar> getAllBars() {
        return placeService.getAllBars();
    }
    @RequestMapping(value = "/createBar", method = RequestMethod.GET)
    public void createBar() {
        Location l = new Location(31.222, 32.1111, "bat yam");
        placeService.saveLocation(l);
       /* Bar b = new Bar("check", l, "21:00-00:00", "wwww.web.com", "050-481006", Rank.HOT);*/
       // placeService.saveBar(b);
    }
@RequestMapping(value = "createRest/{name}/{lat}/{lon}/{city}/{open}/{web}/{phone}/{rank}/{type}/{iskosher}/")
    public void createRest(@PathVariable(value= "name")String name, @PathVariable(value = "lat") double lat,
                           @PathVariable(value = "lon")double lon, @PathVariable(value = "open") String open,
                           @PathVariable(value = "phone") String phone, @PathVariable(value = "web")String web,
                           @PathVariable (value = "iskosher")boolean iskosher, @PathVariable (value ="city")String city,
                           @PathVariable(value = "type")RestaurantType type,@PathVariable(value = "rank")float rank)
    {
    Location lo = new Location(lat,lon,city);
    placeService.saveLocation(lo);
        Restaurant save = new Restaurant(name,lo,open,web,phone,rank, null, null,type,iskosher);
    placeService.saveRestaurant(save);
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

    @RequestMapping(value = "/getFrontUrlBars", method = RequestMethod.GET)
    public List<String> getFrontUrlBars() {
        return placeService.getAllBarsFrontUrl();
    }

    @RequestMapping(value = "/createClub")
    public void createClub ()
    {
        Club c = new Club();
        placeService.saveClub(c);
    }
}
