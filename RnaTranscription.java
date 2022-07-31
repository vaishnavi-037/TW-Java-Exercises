class RnaTranscription {
    String transcribe(String d) {
        int length = d.length();
         StringBuilder RNAtranscription = new StringBuilder();
        for(int i=0;i<length;i++){
            char strand = d.charAt(i);
            if(strand == 'G') RNAtranscription.append("C");
            else if(strand == 'C') RNAtranscription.append("G");
            else if(strand == 'T') RNAtranscription.append("A");
            else if(strand == 'A') RNAtranscription.append("U");
        }
        return String.valueOf(RNAtranscription);
    }
}
