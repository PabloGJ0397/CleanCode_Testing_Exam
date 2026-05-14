package com.pablogj0397.app.features.tren.presentation;

import com.pablogj0397.app.features.tren.data.TrainDataRepository;
import com.pablogj0397.app.features.tren.data.TrainMemLocalDataSource;
import com.pablogj0397.app.features.tren.domain.GetTrainsUseCase;
import com.pablogj0397.app.features.tren.domain.SaveTrainUseCase;
import com.pablogj0397.app.features.tren.domain.Train;

import java.util.ArrayList;

public class TrainView {

    public static void printAll(){
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        ArrayList<Train> trains = getTrainsUseCase.execute();

    }
    public static void saveTrain(Train train){
        SaveTrainUseCase saveTrainUseCase = new SaveTrainUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        saveTrainUseCase.SaveTrain(train);
        System.out.println("Successfull entity insert: ");
        printAll();
    }


}
