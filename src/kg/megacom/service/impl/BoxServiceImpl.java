package kg.megacom.service.impl;

import kg.megacom.models.HeavyBox;
import kg.megacom.service.BoxService;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxServiceImpl implements BoxService {

    @Override
    public void changeWeight(HeavyBox box) {
        box.setWeight(box.getWeight() + 1);
    }

}

