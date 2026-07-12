class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean vowel=false;
        boolean consonant=false;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }if(Character.isLetter(ch)){
                char c=Character.toLowerCase(ch);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowel=true;
                }
                else{
                    consonant=true;
                }
            }
        }
        return vowel && consonant;
    }
}