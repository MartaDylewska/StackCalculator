

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculations {

    //główna metoda performCalculations(String expression)
    //- kowertuje String zadany na ekranie kalkulatora (równanie matematyczne)
    //  do postaci tablicy Stringów {liczba, operator, liczba}
    //- dodaje między elementami " " i na początku i na końcu nawias
    //- wpisuje do nowego Stringa
    public static Double performCalculations(String expression) {

        String[] expressionOrganized = convertStringToStringArray(expression);

        StringBuilder sb1 = new StringBuilder();
        //trzeba dodać nawiasy przed...
        sb1.append("( ");

        for(int i = 0; i<expressionOrganized.length;i++)
            sb1.append(expressionOrganized[i]).append(" ");

        //...i po wyrażeniu
        sb1.append(" )");

        return calculate(sb1.toString());
    }

    private static String[] convertStringToStringArray(String expression){
        StringBuilder currentNumber = new StringBuilder();
        char[] expressionChars = expression.toCharArray();

        //lista liczb i operatorów
        List<String> numsList = new ArrayList<>();
        for(Character c: expressionChars){
            if(c>47 && c<58 || c == '.')
                currentNumber.append(c);
            else{
                if(currentNumber.length()!=0)
                    numsList.add(currentNumber.toString());
                numsList.add(String.valueOf(c));
                currentNumber.setLength(0);
            }
        }
        //dodanie ostatniego wyrazu do listy
        if(currentNumber.length()!=0)
            numsList.add(currentNumber.toString());

        //lista zostaje zapisana w postaci tablicy
        String[] numsAndSigns = new String[numsList.size()];
        int i = 0;
        for(String s: numsList){
            numsAndSigns[i] = s;
            i++;
        }

        return numsAndSigns;
    }


    public static Double calculate(String expression) {
        char[] expressionElements = expression.toCharArray();

        // Stack dla operatorów: 'mathOpers'
        Stack<Character> mathOpers = new Stack<>();
        // Stack dla liczb: 'numbers'
        Stack<Double> numbers = new Stack<>();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < expressionElements.length; i++)
        {
            // spacje odpuszczamy
            if (expressionElements[i] == ' ')
                continue;
            //ponieważ z przodu jest nawias to nie ma potrzeby sprawdzać czy pierwsza liczba jest ujemna
            //jeżeli element jest liczbą to dodajemy składamy go do kupy i dodajemy go do stosu dla liczb
            if (((expressionElements[i] >= '0' && expressionElements[i] <= '9') ||(expressionElements[i] == '.')))
            {
                while (i < expressionElements.length && ((expressionElements[i] >= '0' && expressionElements[i] <= '9') || expressionElements[i] == '.')) {
                    sbuf.append(expressionElements[i]);
                    i++;
                }
                numbers.push(Double.parseDouble(sbuf.toString()));
            }
            //jeżeli element jest nawiasem to trzeba sprawdzić czy następny wyraz nie jest "-"
            // --> jeśli tak to należy na stos dorzucić "0"
            //a nawias wrzucić na stos dla operatorów
            else if(expressionElements[i] == '('){
                if(expressionElements[i+2] == '-')
                    numbers.push(0.0);
                mathOpers.push(expressionElements[i]);
            }
            else if(expressionElements[i] == ')'){
                while(mathOpers.peek()!='('){
                    numbers.push(doBasicCals(mathOpers.pop(),numbers.pop(),numbers.pop()));
                }
                mathOpers.pop();
            }
            //jeżeli jest operatorem matematycznym typu +,-,*,/
            else if (expressionElements[i] == '+' || expressionElements[i] == '-' ||
                    expressionElements[i] == '*' || expressionElements[i] == '/')
            {
                //...robi porządek w numerkach "z góry" stosu
                while (!mathOpers.empty() && goesFirst(expressionElements[i], mathOpers.peek()))
                    numbers.push(doBasicCals(mathOpers.pop(), numbers.pop(), numbers.pop()));
                //... i sam leci na stos
                mathOpers.push(expressionElements[i]);
            }
            sbuf.setLength(0);
        }

        // ostatnia operacja
        while (!mathOpers.empty())
            numbers.push(doBasicCals(mathOpers.pop(), numbers.pop(), numbers.pop()));

        // na koniec numbers zawiera tylko wynik
        return numbers.pop();
    }

    // Jeżeli mathOper2 ma wyższy priorytet niż mathOper1 to zwraca true
    public static boolean goesFirst(char mathOper1, char mathOper2)
    {
        if(mathOper2 == '(' || mathOper2 == ')')
            return false;
        if ((mathOper1 == '*' || mathOper1 == '/') && (mathOper2 == '+' || mathOper2 == '-'))
            return false;
        else
            return true;
    }

    public static double doBasicCals(char mathOper, double part2, double part1)
    {
        switch (mathOper)
        {
            case '+':
                return part1 + part2;
            case '-':
                return part1 - part2;
            case '*':
                return part1 * part2;
            case '/':
                if (part2 == 0.0)
                    throw new
                            UnsupportedOperationException("Nie można dzielić przez 0");
                return part1 / part2;
        }
        return 0.0;
    }

}
