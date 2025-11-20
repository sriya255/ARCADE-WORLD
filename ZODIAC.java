//MAKING ZODIAC GAME
 import java.util.Scanner;
public class ZODIAC{
static void aquarius(){
System.out.println("ZODIAC: AQUARIUS");
System.out.println("Positive: Innovative, visionary, intelligent");
System.out.println("Negative: Detached, rebellious, emotionally distant");
System.out.println("Element: AIR");
System.out.println("Lucky Color: Blue");
System.out.println("Lucky Number: 4");
System.out.println("Lucky Day: Saturday");
}
static void pisces(){
System.out.println("Zodiac: PISCES");
System.out.println("Positive: Compassionate, intuitive, artistic");
System.out.println("Negative: Overly sensitive, escapist, indecisive");
System.out.println("Element: WATER");
System.out.println("Lucky Color: Sea Green");
System.out.println("Lucky Number: 7");
System.out.println("Lucky Day: Thursday");
}

static void aries(){
System.out.println("Zodiac: ARIES");
System.out.println("Positive: Courageous, confident, energetic");
System.out.println("Negative: Impulsive, impatient, short-tempered");
System.out.println("Element: FIRE");
System.out.println("Lucky Color: Red");
System.out.println("Lucky Number: 9");
System.out.println("Lucky Day: Tuesday");
    }

static void taurus(){
System.out.println("Zodiac: TAURUS");
System.out.println("Positive: Reliable, practical, stable");
System.out.println("Negative: Stubborn, possessive, jealous");
System.out.println("Element: EARTH");
System.out.println("Lucky Color: Green");
System.out.println("Lucky Number: 6");
System.out.println("Lucky Day: Friday");
    }
static void gemini(){
System.out.println("Zodiac: GEMINI");
System.out.println("Positive: Adaptable, curious, intelligent");
System.out.println("Negative: Indecisive, inconsistent, anxious");
System.out.println("Element: AIR");
System.out.println("Lucky Color: Yellow");
System.out.println("Lucky Number: 5");
System.out.println("Lucky Day: Wednesday");
    }
static void cancer() {
 System.out.println("Zodiac: CANCER");
System.out.println("Positive: Loyal, nurturing, imaginative");
 System.out.println("Negative: Moody, sensitive, clingy");
 System.out.println("Element: WATER");
 System.out.println("Lucky Color: Silver");
 System.out.println("Lucky Number: 2");
 System.out.println("Lucky Day: Monday");
    }
 static void leo() {
System.out.println("Zodiac: LEO");
System.out.println("Positive: Confident, generous, creative");
System.out.println("Negative: Arrogant, stubborn, attention-seeking");
System.out.println("Element: FIRE");
System.out.println("Lucky Color: Gold");
System.out.println("Lucky Number: 1");
System.out.println("Lucky Day: Sunday");
    }

 static void virgo() {
 System.out.println("Zodiac: VIRGO");
 System.out.println("Positive: Hardworking, analytical, practical");
System.out.println("Negative: Critical, perfectionist, overthinking");
System.out.println("Element: EARTH");
System.out.println("Lucky Color: Brown");
System.out.println("Lucky Number: 5");
System.out.println("Lucky Day: Wednesday");
    }
static void libra(){
System.out.println("Zodiac: LIBRA");
System.out.println("Positive: Diplomatic, fair, harmonious");
System.out.println("Negative: Indecisive, people-pleaser");
System.out.println("Element: AIR");
 System.out.println("Lucky Color: Pink");
 System.out.println("Lucky Number: 6");
System.out.println("Lucky Day: Friday");
    }

 static void scorpio() {
System.out.println("Zodiac: SCORPIO");
System.out.println("Positive: Passionate, determined, resourceful");
System.out.println("Negative: Jealous, vengeful, controlling");
System.out.println("Element: WATER");
System.out.println("Lucky Color: Black");
System.out.println("Lucky Number: 8");
System.out.println("Lucky Day: Tuesday");
    }

 static void sagittarius() {
System.out.println("Zodiac: SAGITTARIUS");
System.out.println("Positive: Adventurous, optimistic, independent");
System.out.println("Negative: Blunt, restless, careless");
System.out.println("Element: FIRE");
System.out.println("Lucky Color: Purple");
System.out.println("Lucky Number: 3");
System.out.println("Lucky Day: Thursday");
    }
static void capricorn() {
System.out.println("Zodiac: CAPRICORN");
System.out.println("Positive: Disciplined, responsible, ambitious");
System.out.println("Negative: Workaholic, rigid, serious");
System.out.println("Element: EARTH");
System.out.println("Lucky Color: Dark Brown");
System.out.println("Lucky Number: 8");
System.out.println("Lucky Day: Saturday");
    }







 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter your birth day (1 to 31): ");
int day = sc.nextInt();
System.out.print("Enter your birth month (1 to 12): ");
int month = sc.nextInt();

if ((month == 1 && day >= 20) || (month == 2 && day <= 18))aquarius();
else if ((month == 2 && day >= 19) || (month == 3 && day <= 20))pisces();
else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) aries();
else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) taurus();
else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) gemini();
else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) cancer();
else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) leo();
else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) virgo();
else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) libra();
else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) scorpio();
else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) sagittarius();
else if ((month == 12 && day >= 22) || (month == 1 && day <= 19))capricorn();
else System.out.println("Invalid date!");
sc.close();
    }
}