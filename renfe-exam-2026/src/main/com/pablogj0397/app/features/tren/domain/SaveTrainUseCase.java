package main.com.pablogj0397.app.features.tren.domain;

public class SaveTrainUseCase {
    private TrainRepository trainRepository;

    public SaveTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(main.com.pablogj0397.app.features.tren.domain.Train train){
        trainRepository.saveTrain(train);
    }
}
