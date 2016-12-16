package sk.upjs.ics.evidenciavyskytu.rest.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.upjs.ics.evidenciavyskytu.DaoFactory;
import sk.upjs.ics.evidenciavyskytu.Vyskyt;
import sk.upjs.ics.evidenciavyskytu.VyskytDao;

@RestController
public class VyskytController {

    VyskytDao vyskytDao = DaoFactory.INSTANCE.getVyskytDao();

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/vyskyty")
    public List<Vyskyt> getVyskyty() {
        return vyskytDao.dajVyskyty();
    }

}
