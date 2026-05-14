package main.com.pablogj0397.app.features.tren.domain;

public class DeleteTrainUseCase {
    private TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
    public void deleteTrain(String id){
        trainRepository.deleteTrain(id);
    }
    public void execute(String id){
        trainRepository.deleteTrain(id);
    }
}
