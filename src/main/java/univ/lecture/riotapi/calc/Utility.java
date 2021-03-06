package univ.lecture.riotapi.calc;

import java.util.regex.Pattern;

/**
 * Created by KimDongha on 2017-04-03.
 */
public class Utility {

    public static boolean isNumber(String s) {
        String numRegex = "\\d+(\\.\\d*)?|\\.\\d+";
        Pattern p = Pattern.compile(numRegex);
        return p.matcher(s).matches();
    }

    public static boolean isOperator(String s) {
        return Operator.findOperator(s) != null;
    }

    public static String deleteUrlLastEqual(String url) {
        char last = url.charAt(url.length() - 1);
        if (last == '=')
            return url.substring(0, url.length() - 1);
        return url;
    }

    public static boolean isHigherPrirorty(String op1, String op2) {
        if ("+".equals(op1) || "-".equals(op1)) {
            if ("/".equals(op2) || "*".equals(op2)) {
                return false;
            }
        }
        return true;
    }

    private Utility() {

    }
}
