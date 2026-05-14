package main.com.pablogj0397.app.features.tren.domain;

import java.util.ArrayList;

public class GetTrainsUseCase {
    private com.pablogj0397.app.features.tren.domain.TrainRepository trainRepository;

    public GetTrainsUseCase(com.pablogj0397.app.features.tren.domain.TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<com.pablogj0397.app.features.tren.domain.Train> execute(){
        ArrayList<com.pablogj0397.app.features.tren.domain.Train> trains = trainRepository.getTrains();
        return trains;
    }
}
