20 min
Crează un repository nou pe GitHub numit [P] Quiz 6.
Creează un proiect folosind Spring Initializr cu dependențele necesare unei aplicații web Spring Boot.
Creează un endpoint asociat cu metoda GET din protocolul HTTP și calea: path = /add/first/{first}/second/{second}, unde first și second sunt variabile de path (folosind @PathVariable).
Acest endpoint returnează suma numerelor first și second, primite prin intermediul variabilelor de path, sub formă de String.
Pentru acest task nu este nevoie să implementezi un view (pagină jsp) sau un model. Scopul este să creezi o aplicație Spring Boot care să ruleze, și să expună un endoint simplu care primește două numere și returnează rezultatul adunării acestora.
Testează endpoint-ul definit folosind un browser sau un tool dedicat precum Postman.
[Bonus] Modifică implementarea de mai sus astfel încât să suporte adunarea a două numere foarte mari (care depășesc Long.MAX_VALUE).
