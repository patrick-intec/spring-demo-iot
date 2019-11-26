package be.infernalwhale.datalayer;

import be.infernalwhale.model.Contract;

public interface ContractDAO {
    Contract saveContract(Contract contract);

    Contract findContract(int id);

    Contract deleteContract(int id);
}
