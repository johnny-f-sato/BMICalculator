import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

/**
 * Created by Fumiya on 2016/03/26.
 */
public class BMITopView {
    public static void main(String[] args) throws IOException{
        User user = new User();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        show("------BMIを計算するやつ-------");
        show("身長と体重を入力してね");

        showOneLine("身長: ");
        user.height = parseInput(reader.readLine());

        showOneLine("体重: ");
        user.weight = parseInput(reader.readLine());

        show("あなたのBMIは" + format(calculateBMI(user)) +"でございます。");
        show("適正体重は" + format(calculateOptimizeWeight(user)) +"kg ですねぇ。どうでしょうか！ｗ");
        show("-----------おわり------------");
    }

    static void show(String message) {
        System.out.println(message);
    }

    static void showOneLine(String message) {
        System.out.print(message);
    }

    static float parseInput(String input) {
        return Float.parseFloat(input);
    }

    static float calculateBMI(User user) {
        float meterHeight = user.height / 100;
        return user.weight / (meterHeight * meterHeight);
    }

    static float calculateOptimizeWeight(User user) {
        float meterHeight = user.height / 100;
        return meterHeight * meterHeight * 22;
    }

    static String format(float input) {
        return new Formatter().format("%.1f", input).toString();
    }

}
