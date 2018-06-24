package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Wataha {
    List<Pies> czlonkowie = new ArrayList<>();

    public void AddPies(Pies p) {
        czlonkowie.add(p);
    }

    public String ktoWStadzie() {
        StringBuilder out = new StringBuilder();
        for(Pies a : czlonkowie) {
            out.append(a.getImie());
            out.append(",");

        }
        return out.toString();
    }



}
