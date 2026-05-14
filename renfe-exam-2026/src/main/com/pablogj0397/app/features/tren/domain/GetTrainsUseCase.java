package main.com.pablogj0397.app.features.tren.domain;

import java.util.ArrayList;

public class GetTrainsUseCase {
    private main.com.pablogj0397.app.features.tren.domain.TrainRepository trainRepository;

    public GetTrainsUseCase(main.com.pablogj0397.app.features.tren.domain.TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<main.com.pablogj0397.app.features.tren.domain.Train> execute() {
        ArrayList<main.com.pablogj0397.app.features.tren.domain.Train> trains = trainRepository.getTrains();
        return trains;
    }
}
