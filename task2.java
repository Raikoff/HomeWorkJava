/*+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 2, d = 1
ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: нет решения. 
*Подумать над тем, как сделать минимальное количество команд


k1( C *A)
k2(a+d)
a=b , a>b "Невозможно"
*/
public class task2 {
    
public static void main(String[] args) {
    int a = 4;
    int b = 7;
    int c = 2;
    int d = 1;
     
 
    String answer = "";
    if(a>b){
        System.out.println("Невозможно");
    }
    else{
        while(a<b){
             a = a*c; 
           
            if(a<b){
            answer = answer + " k1,";
            System.out.println(a);
            }
            if(a>b){
                a= a/c;
                a= a+d;
                answer=answer+" k2,";
                System.out.println(a);
            
            }
            
        }
        System.out.printf("Результат %d" , a);
        System.out.println(answer);
    }

    
}
    

}

