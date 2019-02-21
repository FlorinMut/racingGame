package org.fasttrackit.service;

import org.fasttrackit.domain.TopWinner;
import org.fasttrackit.persistence.TopWinnerRepository;

import java.io.IOException;
import java.sql.SQLException;

public class TopWinnerService {

    private TopWinnerRepository topWinnerRepository =
            new TopWinnerRepository();

    public void createTopWinner (TopWinner topWinner) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Creating top winner entry: " + topWinner);
        topWinnerRepository.createTopWinner(topWinner);


    }


}
