package be.pxl.houses.service;

import be.pxl.houses.api.House;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseService {

    private final Map<String, House> houses = new HashMap<>();

    public void addHouse(House house) {
        houses.put(house.getCode(), house);
    }

    public List<House> getHouses() {
        return new ArrayList<>(houses.values());
    }

    public void updateHouse (String code, House data) {
        if (houses.containsKey(code)) {
            data.setCode(code);
            houses.put(code, data);
        }
    }

    private House findHouseByCode (String code){
        return houses.get(code);
    }

    public void deleteHouse (String code){
        houses.remove(code);
    }
}
