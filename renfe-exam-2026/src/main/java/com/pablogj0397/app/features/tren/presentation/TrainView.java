package java.com.pablogj0397.app.features.tren.presentation;

import java.com.pablogj0397.app.features.tren.data.TrainDataRepository;
import java.com.pablogj0397.app.features.tren.data.TrainMemLocalDataSource;
import java.com.pablogj0397.app.features.tren.domain.GetTrainsUseCase;
import java.com.pablogj0397.app.features.tren.domain.Train;
import java.com.pablogj0397.app.features.tren.domain.TrainRepository;
import java.util.ArrayList;

public class TrainView {

    public static void printAll(){
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository(new TrainMemLocalDataSource().getInstance()));
        ArrayList<Train> trains = getTrainsUseCase.execute();

    }
}
