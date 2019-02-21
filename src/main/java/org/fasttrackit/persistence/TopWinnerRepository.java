package org.fasttrackit.persistence;

import org.fasttrackit.domain.TopWinner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TopWinnerRepository {

    public void createTopWinner(TopWinner topWinner) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = DatabaseConfiguration.getConnection();

        String insertSql = "INSERT INTO top_winners (`name`,wonRaces) VALUES (?, ?);"; //aici e tilda, nu ghilimele

        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
        preparedStatement.setString(1,topWinner.getName());
        preparedStatement.setInt(2,topWinner.getWonRaces());

        preparedStatement.executeUpdate();

    }
}
