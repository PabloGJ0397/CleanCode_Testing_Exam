package java.com.pablogj0397.app.features.tren.data;

import java.com.pablogj0397.app.features.tren.domain.Train;
import java.com.pablogj0397.app.features.tren.domain.TrainRepository;
import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {
    private TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public ArrayList<Train> getTrains() {
        return null;
    }
}
