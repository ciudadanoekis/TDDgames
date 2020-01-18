package com.laClinik.main;

public class Dna {

    public String checkDna(String x) {
        StringBuilder rnaComp = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'G') {
                rnaComp.append('C');
            }
            else if (x.charAt(i) == 'C') {
                rnaComp.append('G');
            }
            else if (x.charAt(i) == 'T') {
                rnaComp.append('A');
            }
            else if (x.charAt(i) == 'A') {
                rnaComp.append('T');
            }
            else {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        return rnaComp.toString();
    }

}
