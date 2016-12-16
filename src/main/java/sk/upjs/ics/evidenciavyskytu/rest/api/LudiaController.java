package sk.upjs.ics.evidenciavyskytu.rest.api;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.upjs.ics.evidenciavyskytu.Clovek;
import sk.upjs.ics.evidenciavyskytu.ClovekDao;
import sk.upjs.ics.evidenciavyskytu.DaoFactory;

@RestController
public class LudiaController {

    ClovekDao clovekDao = DaoFactory.INSTANCE.getClvekDao();

    @RequestMapping("/ludia")
    public List<Clovek> getLudia() {
        return clovekDao.dajVsetkych();
    }

    @PostMapping("/ludia")
    public void addClovek(@RequestBody Clovek clovek) {
        clovekDao.uloz(clovek);
    }

    @PutMapping("/ludia/{idClovek}")
    public void updateClovek(@PathVariable int idClovek, @RequestBody Clovek clovek) {
        if (idClovek == clovek.getId()) {
            clovekDao.uloz(clovek);
        } else {
            throw new UserHasDifferentIdException();
        }
    }

}
