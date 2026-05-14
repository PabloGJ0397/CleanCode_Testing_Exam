package main.com.pablogj0397.app.features.tren.data;

import main.com.pablogj0397.app.features.tren.domain.Train;
import main.com.pablogj0397.app.features.tren.domain.Train;
import main.com.pablogj0397.app.features.tren.domain.TrainRepository;
import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {
    private main.com.pablogj0397.app.features.tren.data.TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(main.com.pablogj0397.app.features.tren.data.TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void saveTrain(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public void deleteTrain(String id) {
        trainMemLocalDataSource.delete(id);

    }

    @Override
    public ArrayList<Train> getTrains() {
        return null;
    }
}
