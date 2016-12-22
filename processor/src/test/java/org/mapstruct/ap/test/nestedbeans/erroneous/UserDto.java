/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.nestedbeans.erroneous;

import java.util.List;
import java.util.Map;

public class UserDto {

    private String name;
    private CarDto car;
    private HouseDto house;
    private DictionaryDto dictionary;
    private List<ComputerDto> computers;
    private Map<String, CatDto> catNameMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarDto getCar() {
        return car;
    }

    public void setCar(CarDto car) {
        this.car = car;
    }

    public HouseDto getHouse() {
        return house;
    }

    public void setHouse(HouseDto house) {
        this.house = house;
    }

    public DictionaryDto getDictionary() {
        return dictionary;
    }

    public void setDictionary(DictionaryDto dictionary) {
        this.dictionary = dictionary;
    }

    public List<ComputerDto> getComputers() {
        return computers;
    }

    public void setComputers(List<ComputerDto> computers) {
        this.computers = computers;
    }

    public Map<String, CatDto> getCatNameMap() {
        return catNameMap;
    }

    public void setCatNameMap(
        Map<String, CatDto> catNameMap) {
        this.catNameMap = catNameMap;
    }
}