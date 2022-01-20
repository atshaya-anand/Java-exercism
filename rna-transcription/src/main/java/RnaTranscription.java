import java.util.HashMap;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap <Character, Character> hashmap = new HashMap <>();
        
        hashmap.put('G','C');
        hashmap.put('C','G');
        hashmap.put('T','A');
        hashmap.put('A','U');
        
        String rnaStrand = "";

        for (int i=0; i<dnaStrand.length(); i++){
            Character temp = dnaStrand.charAt(i);
            rnaStrand += hashmap.get(temp);
        }
        System.out.println(rnaStrand);
        return rnaStrand;
    }

}
