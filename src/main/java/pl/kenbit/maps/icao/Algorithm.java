package pl.kenbit.maps.icao;

public class Algorithm {


    String generateCode = "";
    Data data = new Data();
    char[] letters = data.letter();
    String[] alphabetICAO = data.alphabetICAO();

    public String calculation(String[] finalWord, char[] swapStringToArary, String word) {
        for (int i = 0; i <= swapStringToArary.length - 1; i++) {
            for (int j = 0; j <= letters.length - 1; j++) {
                if (swapStringToArary[i] == letters[j]) {
                    finalWord[i] = alphabetICAO[j];
                    break;
                } else {

                }
            }
        }

        for (int k = 0; k <= finalWord.length - 1; k++) {
            generateCode = generateCode + " - " + finalWord[k];
        }
    return generateCode;
    }
}
