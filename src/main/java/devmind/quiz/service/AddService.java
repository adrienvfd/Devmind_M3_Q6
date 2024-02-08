package devmind.quiz.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class AddService {

    public String add(String a, String b) {

        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            return "Invalid Input";
        }

        BigInteger aNumber = new BigInteger(a);
        BigInteger bNumber = new BigInteger(b);

        return String.valueOf(aNumber.add(bNumber));
    }

}
