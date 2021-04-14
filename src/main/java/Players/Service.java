package Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ComponentScan
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private PlayerRepository player_repo;

    public List<Player> getAllplayers() {
        List<Player> allplayers = new ArrayList<>();
        player_repo.findAll().forEach(allplayers::add);
        return allplayers;
    }

    public void add_player(Player newplayer){
        player_repo.save(newplayer);
    }

    public Optional<Player> get_one_player(Integer id) {
        return player_repo.findById(id);
    }


    public void update_player(Player old_player, Integer id) {
        player_repo.save(old_player);
    }

    public void delete_player(Integer id) {
        player_repo.deleteById(id);
    }
}
