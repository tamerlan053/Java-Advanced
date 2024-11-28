package be.pxl.houses.api;

import be.pxl.houses.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping
    public void createHouse(@RequestBody House house) {
        houseService.addHouse(house);
    }

    @GetMapping
    public List<House> getAllHouses() {
        return houseService.getHouses();
    }

    @PutMapping("/{code}")
    public void updateHouse(@PathVariable String code, @RequestBody House house) {
        houseService.updateHouse(code, house);
    }

    @DeleteMapping("/{code}")
    public void deleteHouse(@PathVariable String code) {
        houseService.deleteHouse(code);
    }
}
