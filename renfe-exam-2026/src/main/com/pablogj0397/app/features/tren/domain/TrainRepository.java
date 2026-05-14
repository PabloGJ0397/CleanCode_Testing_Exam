package main.com.pablogj0397.app.features.tren.domain;

import java.util.ArrayList;

public interface TrainRepository {
    public ArrayList<main.com.pablogj0397.app.features.tren.domain.Train> getTrains();
    public void saveTrain(main.com.pablogj0397.app.features.tren.domain.Train train);
    public void deleteTrain(String id);

}
