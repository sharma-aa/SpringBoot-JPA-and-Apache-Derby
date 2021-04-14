package Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@ComponentScan
@RestController
public class Controller {
    @Autowired
    public Service service;

    @RequestMapping("/Player")
    public List<Player> get_all_players(){
        return service.getAllplayers();
    }

    @RequestMapping("Player/{id}")
    public Optional<Player> get_one_player(@PathVariable Integer id){
        return service.get_one_player(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Player")
    public void add_player(@RequestBody Player newplayer){
        service.add_player(newplayer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "Player/{id}")
    public void update_player(@RequestBody Player old_player, @PathVariable Integer id){
        service.update_player(old_player, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Player/{id}")
    public void delete_player(@PathVariable Integer id){
        service.delete_player(id);
    }
}
