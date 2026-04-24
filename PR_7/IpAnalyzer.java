import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAnalyzer {

    public String extractIp(String input) {
        Pattern pattern = Pattern.compile("(\\b(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\b)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public String convertToBinary(String ip) {
        String[] parts = ip.split("\\.");
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String bin = String.format("%8s", Integer.toBinaryString(Integer.parseInt(parts[i]))).replace(' ', '0');
            binary.append(bin);
            if (i < parts.length - 1) binary.append(".");
        }
        return binary.toString();
    }

    public void analyze(String input) {
        String ip = extractIp(input);
        if (ip == null) {
            System.out.println("IP адресу не знайдено.");
            return;
        }
        System.out.println("Знайдена IP адреса: " + ip);
        System.out.println("Двійкова форма: " + convertToBinary(ip));
    }
}
