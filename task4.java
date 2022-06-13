// 4.Написать программу, показывающую последовательность действий для игры “Ханойская башня”


public class task4 {

    public static void main(String[] args) {
        
    }
        public static void move (char pos1, char pos2) {// Сначала рассмотрим, как двигаться, когда есть только одна пластина
            System.out.print (pos1 + "==>" + pos2 + ""); // непосредственно перемещаем пластину в целевую область
}

public static void hanio(int n,char pos1,char pos2,char pos3) {
   if(n == 1) {
       move(pos1,pos3);  
   } else {
       hanio(n-1,pos1,pos3,pos2);
       move(pos1,pos3);
       hanio(n-1,pos2,pos1,pos3);
   }
   
}
 
}

