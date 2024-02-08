package devmind.quiz.controller;

import devmind.quiz.service.AddService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
@RequiredArgsConstructor
public class AddController {

    private final AddService addService;

    @RequestMapping(value = "/first/{first}/second/{second}", method = RequestMethod.GET)
    public String add(@PathVariable String first, @PathVariable String second) {
        return String.valueOf(Long.parseLong(first) + Long.parseLong(second));
    }

    @RequestMapping(value = "/bonus/first/{first}/second/{second}", method = RequestMethod.GET)
    public String enhancedAdd(@PathVariable String first, @PathVariable String second) {
        return addService.add(first, second);
    }
}


//Creează un repository nou pe GitHub numit [P] Quiz 6.
//Creează un proiect folosind Spring Initializr cu dependențele necesare unei aplicații web Spring Boot.
//Creează un endpoint asociat cu metoda GET din protocolul HTTP și calea: path = /add/first/{first}/second/{second}, unde first și second sunt variabile de path (folosind @PathVariable).
//Acest endpoint returnează suma numerelor first și second, primite prin intermediul variabilelor de path, sub formă de String.
//Pentru acest task nu este nevoie să implementezi un view (pagină jsp) sau un model. Scopul este să creezi o aplicație Spring Boot care să ruleze, și să expună un endoint simplu care primește două numere și returnează rezultatul adunării acestora.
//Testează endpoint-ul definit folosind un browser sau un tool dedicat precum Postman.
//[Bonus] Modifică implementarea de mai sus astfel încât să suporte adunarea a două numere foarte mari (care depășesc Long.MAX_VALUE).