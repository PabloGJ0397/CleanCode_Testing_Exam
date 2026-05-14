package java.com.pablogj0397.app.features.tren.domain;

import java.util.ArrayList;

public class GetTrainsUseCase {
    private TrainRepository trainRepository;

    public GetTrainsUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<Train> execute(){
        ArrayList<Train> trains = trainRepository.getTrains();
        return trains;
    }
}
