package com.chatbot.web.passenger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// https://bezkoder.com/spring-boot-upload-csv-file/
import java.io.*;

interface PassengerService{
    public void readCsv();
}
@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired PassengerRepository passengerRepository;

    @Override
    public void readCsv() {
        InputStream is = getClass().getResourceAsStream("/static/train.csv");

        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for(CSVRecord csvRecord : csvRecords){
                // PassengerId,Survived,Pclass,Name,Sex,Age,SibSp,
                // Parch,Ticket,Fare,Cabin,Embarked
                passengerRepository.save(new Passenger(
                        Integer.parseInt(csvRecord.get(0)),
                        Integer.parseInt(csvRecord.get(1)),
                        Integer.parseInt(csvRecord.get(2)),
                        csvRecord.get(3),
                        csvRecord.get(4),
                        csvRecord.get(5),
                        csvRecord.get(6),
                        csvRecord.get(7),
                        csvRecord.get(8),
                        csvRecord.get(9),
                        csvRecord.get(10),
                        csvRecord.get(11)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
