package main.com.pablogj0397.app.features.tren.presentation;

import main.com.pablogj0397.app.features.tren.data.TrainDataRepository;
import main.com.pablogj0397.app.features.tren.data.TrainMemLocalDataSource;
import main.com.pablogj0397.app.features.tren.domain.DeleteTrainUseCase;
import main.com.pablogj0397.app.features.tren.domain.GetTrainsUseCase;
import main.com.pablogj0397.app.features.tren.domain.SaveTrainUseCase;
import main.com.pablogj0397.app.features.tren.domain.Train;

import java.util.ArrayList;

public class TrainView {

    public static void printAll(){
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        ArrayList<Train> trains = getTrainsUseCase.execute();

    }
    public static void saveTrain(Train train){
        SaveTrainUseCase saveTrainUseCase = new SaveTrainUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        saveTrainUseCase.execute(train);
        System.out.println("Successfull entity insert: ");
        printAll();
    }
    public static void deleteTrain(){
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        String id = "MD5-001";
        deleteTrainUseCase.execute();

    }


}
