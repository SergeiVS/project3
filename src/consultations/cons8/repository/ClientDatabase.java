package repository;

import entity.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ClientDatabase implements ClientRepository {

    private final ArrayList<Client> database;
    private int id = 0;

    public ClientDatabase() {
        this.database = new ArrayList<>();
    }

    @Override
    public Client add(Client client) {
        id++;
        Client newClient = new Client(id, client.getName(), client.getDescription());
        database.add(newClient);
        return newClient;
    }

    @Override
    public Optional<Client> findById(int id) {

        for (Client client : database) {

            if (client.getId() == id) {

                return Optional.of(client);
            }
        }

        return Optional.empty();
    }

//    @Override
//    public Optional<Client> findByName(String name) {
//        for (int i = 0; i < database.size(); i++) {
//            if (database.get(i).getName().contains(name)) {
//                Optional<Client> optionalReturn = Optional.of(database.get(i));
//                return optionalReturn;
//            }
//        }
//        return Optional.empty();
//    }

    @Override
    public Optional<Client> findByName(String name) {
        Predicate<Client> namePredicate = client -> client.getName().contains(name);

        for (Client client : database) {
            if (namePredicate.test(client)) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }


    @Override
    public boolean update(Client client) {

        int idSearch = client.getId();

        Optional<Client> clientFromDatabaseOpt = findById(idSearch);

        if (clientFromDatabaseOpt.isPresent()) {

            Client clientUpdate = clientFromDatabaseOpt.get();
            clientUpdate.setDescription(clientUpdate.getDescription());
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Client clientForDelete) {

        return database.remove(clientForDelete);
    }

    @Override
    public List<Client> findAll() {
        return database;
    }
}
