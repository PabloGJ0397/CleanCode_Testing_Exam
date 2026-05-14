package com.pablogj0397.app.features.tren.data; //cambiar por la ruta correcta

import com.pablogj0397.app.features.tren.domain.Train;
import java.util.ArrayList;
import java.util.Objects;

public class TrainMemLocalDataSource {
    private static TrainMemLocalDataSource instance;

    private ArrayList<Train> storage = new ArrayList<>();

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void save(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }

    public TrainMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new TrainMemLocalDataSource();
        }
        return instance;
    }
}
