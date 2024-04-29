/*
    גמאל מגאדלה
207513722
------------
אן גאנם
314627951

*/
import java.util.Random;
import java.util.Scanner;
public class MathQ
{
    private static int ansTT;
    
    public MathQ(int t)//בנאי שמאתחל את התשובה הנכונה לכל תרגיל דרך המתודה setter
    {
     setAnswer(t);    
    }
    
    public static void main (String [] args)//הפונקציה הראשית שממנה קוראים ומבצעים קליטה רנדומלית וקוראים דרכה למתודות אחרות
    {
        
        Random dice = new Random();
        Scanner scaner = new Scanner( System.in );
        int num1=0,num2 , arith ,i,j, CountT=0;
        
            System.out.println("\t\tWELCOME TO MATH QUIZ \n\n");
            
            
                for(i=0;i<10;i++)
            {
                System.out.println(i+1 + ")");
                    num1=dice.nextInt(11);//קליטת מספר 1 רנדומלי מ 0 עד 10 
                    num2=dice.nextInt(11);//קליטת מספר 2 רנדומלי מ 0 עד 10
                    arith=dice.nextInt(3);//קליטת מספר רנדומלי לטובת המרה לאופרטור מ 0 עד 3
                            
                    if ( Equation(num1,num2,arith) == 1 )//תנאי ששולח את המספרים שנקלטו למתודה ובודק אם מחזיר 1 
                    {
                    System.out.println("CORRECT !\n");
                    CountT++;
                    }
            
                    else // במקרה והתנאי הראשון לא מתקיים ( מתקבל 0 , תשובה לא נכונה) מבצעת את הבא
                    {   
                    System.out.println("TRY AGAIN...\n"); 
        
                    for (j=0;j<1;j++)//לולאה לטובת נתינה עוד נסיון אחד לפתור את המשוואה 
                    {
                        if (Equation ( num1, num2,arith )==1)
                        {
                        System.out.println("CORRECT !\n");
                        CountT++;//לספירת תשובות נכונות 
                        }
        
                        else
                        {
                        System.out.println("FALSE " + "Right Answer =" + ansTT +"\n");//הדפסת את התשובה הנכונה אחרי נסיון שני 
            
                        }
                    }
            
                }
                
                
            }
        
            System.out.println("\n\t\tYou've Answered " + CountT + " Questions Right \n" );// הדפסה סופית שנתונת כמה שאלות נענו נכון
            
                                                //תנאים לתת הודעה בהתאם לציון שהתקבל                           
            if (CountT >=0 && CountT <=6 )
            System.out.println ("\t\t\t   YOU NEED TO PRACTICE MORE!");
        
            else if (CountT >=7 && CountT <=8 )
            System.out.println ("\t\t\t   GOOD!");
        
            else if (CountT ==9 )
            System.out.println ("\t\t\t   VERY WELL !");
        
            else if (CountT ==10 )
            System.out.println ("\t\t\t   EXCELLENT !");
        
        }
    
    
    
    
    static int Equation (int num1,int num2,int arith)//מתודה שממירה את המספר השלישי שהתקבל לאופרטורים לפי SWITCH
    {
         int ansT=0 , ansS=0 ;
         boolean TorF;
         Scanner input = new Scanner( System.in );
        
        
         switch (arith)
        {
            case 0 :
            
            System.out.println(num1 + "+" + num2 );//הדפסת התרגיל שהתקבל
            ansS=input.nextInt();//קבלת תשובה מהתלמיד
            ansT=num1+num2;//ביצוע הפעולה ( חישוב התשובה הנכונה )
            setAnswer(ansT);//קריאה למתודה ושליחת התשובה הנכונה אליה
            break;
            
            case 1 :
            // שני תנאים בשביל בדיקה המספר הגבוה מבין השנים לביצוע פעולת החיסור                           
            
            if (num1>num2)
            {
            System.out.println(num1 + "-" + num2 );//הדפסת התרגיל שהתקבל
            ansS=input.nextInt();//קבלת תשובה מהתלמיד
            ansT=num1-num2;//ביצוע הפעולה ( חישוב התשובה הנכונה )
            setAnswer(ansT);//קריאה למתודה ושליחת התשובה הנכונה אליה
            }
            
            else
            {
            System.out.println(num2 + "-" + num1 );//הדפסת התרגיל שהתקבל
            ansS=input.nextInt();//קבלת תשובה מהתלמיד
            ansT=num2-num1;//ביצוע הפעולה ( חישוב התשובה הנכונה )
            setAnswer(ansT);//קריאה למתודה ושליחת התשובה הנכונה אליה
            }
            break;
            
            case 2:
            System.out.println(num1 + "*" + num2 );//הדפסת התרגיל שהתקבל
            ansS=input.nextInt();//קבלת תשובה מהתלמיד
            ansT=num1*num2;//ביצוע הפעולה ( חישוב התשובה הנכונה )
            setAnswer(ansT);//קריאה למתודה ושליחת התשובה הנכונה אליה
            break;
            
            
        }
        
        
        TorF=checkanswer( ansT,ansS);//קריאה למתודה
        
        if (TorF==true)
        return 1;
        
        else 
        return 0;
        
    }
    
    static int setAnswer(int T)//מתודת SETTER לטובת שמירת התשובה התקינה
    {
     ansTT=T; 
     return ansTT;
    }
    
    
    
    static boolean checkanswer(int ansT , int ansS)//מתודה שבודקת התאמת התשובה שהתקבלה מהתלמיד לתשובה הנכונה 
    {
        if ( ansS == ansT)
        return true;
        
        else
        return false;
    }
    
    
}

