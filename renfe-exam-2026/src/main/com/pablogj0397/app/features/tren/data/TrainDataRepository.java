package com.pablogj0397.app.features.tren.data;

import com.pablogj0397.app.features.tren.domain.Train;
import com.pablogj0397.app.features.tren.domain.TrainRepository;
import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {
    private TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void saveTrain(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public ArrayList<Train> getTrains() {
        return null;
    }
}
