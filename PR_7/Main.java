public class Main {

    public static void main(String[] args) {
        IpAnalyzer analyzer = new IpAnalyzer();

        analyzer.analyze("Сервер знаходиться за адресою 172.16.3.1");
        analyzer.analyze("Підключення до 192.168.0.1");
        analyzer.analyze("Адреса: 0.0.0.0");
        analyzer.analyze("Текст без адреси");
    }
}
