package fh.java.geometricshapes;

import fh.java.geometricshapes.model.threedim.Kugel;
import fh.java.geometricshapes.model.threedim.Pyramide;
import fh.java.geometricshapes.model.threedim.Zylinder;
import fh.java.geometricshapes.model.twodim.Dreieck;
import fh.java.geometricshapes.model.twodim.Kreis;
import fh.java.geometricshapes.model.twodim.Raute;

/**
 * Created by Philipp Goeschl on 09.11.2016.
 */
public class Main {


    public static void main(String[] args) {
        Kreis kreis1 = new Kreis(2,2,5);
        System.out.println(kreis1);

        Dreieck dreieck1 = new Dreieck(0,0,1,3,4,6);
        System.out.println(dreieck1);

        Raute raute1 = new Raute(0,0,4,3,6);
        System.out.println(raute1);


        Kugel kugel1 = new Kugel(0,0,0,5);
        System.out.println(kugel1);

        Pyramide pyramide1 = new Pyramide(0,0,0,5,6,8,9,4);
        System.out.println(pyramide1);

        Zylinder zylinder1 = new Zylinder(0,0,0,5,10);
        System.out.println(zylinder1);

    }


}
