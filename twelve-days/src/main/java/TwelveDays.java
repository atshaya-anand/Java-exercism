import java.util.HashMap;
class TwelveDays {
    static final HashMap <Integer, String> hashmap;
    static {
        hashmap = new HashMap <Integer, String> ();
        hashmap.put(1,"On the first day of Christmas my true love gave to me: " +
            "a Partridge in a Pear Tree.\n");
        hashmap.put(2, "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n");
        hashmap.put(3, "On the third day of Christmas my true love gave to me: three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(4, "On the fourth day of Christmas my true love gave to me: four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(5, "On the fifth day of Christmas my true love gave to me: five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(6, "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n");
        hashmap.put(7, "On the seventh day of Christmas my true love gave to me: " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " + "two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(8, "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," + " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(9, "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(10, "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n");
        hashmap.put(11, "On the eleventh day of Christmas my true love gave to me: " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        hashmap.put(12, "On the twelfth day of Christmas my true love gave to me: " +
                "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    }
    
    String verse(int verseNumber) {
        return hashmap.get(verseNumber);
    }

    String verses(int startVerse, int endVerse) {
        String message = "";
        for (int i=startVerse; i<=endVerse; i++){
            if (i != endVerse){
                message += hashmap.get(i) + "\n";
            }else{
                message += hashmap.get(i);
            }
        }
        return message;
    }
    
    String sing() {
        String song = "";
        for (Integer i : hashmap.keySet()) {
          if (i != 12){
              song += hashmap.get(i) + "\n";
          }else{
              song += hashmap.get(i);
          }
        }
        return song;
    }
}
