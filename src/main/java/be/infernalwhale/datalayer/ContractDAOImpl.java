package be.infernalwhale.datalayer;

import be.infernalwhale.model.Contract;

import java.sql.Connection;

public class ContractDAOImpl implements ContractDAO {
    private Connection connection;

    public ContractDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public Contract saveContract(Contract contract) {
        return null;
    }

    public Contract findContract(int id) {
        return null;
    }

    public Contract deleteContract(int id) {
        return null;
    }
}
