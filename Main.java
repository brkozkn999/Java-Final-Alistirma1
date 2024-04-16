import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String orijinalString = "  aa          bb  cccc";
        String duzeltilmisString = StringUtils.deleteWhitespace(orijinalString);
        System.out.println(orijinalString + " | Orijinal Text (" + orijinalString.length() + ")");
        System.out.println(duzeltilmisString + " | Düzeltilmiş Text (" + duzeltilmisString.length() + ")");
    }
}
