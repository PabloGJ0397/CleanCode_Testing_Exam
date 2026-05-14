package main.com.pablogj0397.app;

import main.com.pablogj0397.app.features.tren.domain.Train;
import main.com.pablogj0397.app.features.tren.presentation.TrainView;

public class Main {
    static void main(String[] args) {
        //Feature 1: SaveTrain and show changes
        TrainView.printAll();
        TrainView.saveTrain(new Train("MD5-001","630", "111A","Avlo","AVE"));
        TrainView.printAll();

        //Feature 2: PrintAll
        TrainView.printAll();




    }

}
