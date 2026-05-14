package main.com.pablogj0397.app.features.tren.domain;

import java.util.ArrayList;

public interface TrainRepository {
    public ArrayList<com.pablogj0397.app.features.tren.domain.Train> getTrains();
    public void saveTrain(com.pablogj0397.app.features.tren.domain.Train train);

}
