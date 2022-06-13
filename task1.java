/*+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000
*/



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt")); // считывание из файла
        String str;

        String[] tempStr = new String[2];
        int count = 0;

        while ((str = br.readLine()) != null) {
            tempStr[count] = str;
            count++;

        }
        br.close();

        int countSec = 0;
        String substr = "a";

        String tempB = "";
        String tempA = "";

        while (countSec != tempStr.length) {            // конвектор
            if (tempStr[countSec].contains(substr)) {
                tempA = tempStr[countSec].chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else {
                tempB = tempStr[countSec].chars()
                        .filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            }
            countSec++;
        }
        int value = Integer.parseInt(tempA);
        int valuePow= Integer.parseInt(tempB);

        var res = Math.pow(value, valuePow);   // возведене в степень

        String answer = "%d в степени %d = %f";

        try (FileWriter fw = new FileWriter("output.txt", false)) { // запись в файл
            fw.write(String.format(answer, value, valuePow, res));
            fw.close();
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
 
