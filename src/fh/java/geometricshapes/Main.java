package fh.java.geometricshapes;

import fh.java.geometricshapes.model.threedim.Kugel;
import fh.java.geometricshapes.model.threedim.Pyramide;
import fh.java.geometricshapes.model.threedim.ThreeDim;
import fh.java.geometricshapes.model.threedim.Zylinder;
import fh.java.geometricshapes.model.twodim.Dreieck;
import fh.java.geometricshapes.model.twodim.Kreis;
import fh.java.geometricshapes.model.twodim.Raute;
import fh.java.geometricshapes.model.twodim.TwoDim;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;


/**
 * Created by Philipp Goeschl on 09.11.2016.
 */
public class Main {


    public static void main(String[] args) {

        /*
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
        */
        Main main = new Main();
        main.doItTwoDim();
        main.doItThreeDim();

    }

    private void doItThreeDim() {

        List<ThreeDim> threeDimList = new ArrayList<>();

        fillList3(threeDimList);

        printList3(threeDimList);

    }

    private void printList3(List<ThreeDim> threeDimList) {
        for (ThreeDim threeDim : threeDimList) {
            System.out.println(threeDim);
        }

    }

    private void fillList3(List<ThreeDim> threeDimList) {
        threeDimList.add(new Kugel(0,0,0,5));
        threeDimList.add(new Kugel(0,0,0,4));
        threeDimList.add(new Kugel(0,0,0,1));
        threeDimList.add(new Zylinder(0,0,0,4,5));
        threeDimList.add(new Zylinder(0,0,0,2,4));
        threeDimList.add(new Zylinder(0,0,0,4,4));
        threeDimList.add(new Pyramide(0,0,0,5,5,5,5,5));
        threeDimList.add(new Pyramide(0,0,0,4,2,5,3,5));
        threeDimList.add(new Pyramide(0,0,0,1,1,1,1,1));
    }

    private void doItTwoDim() {

        List<TwoDim> twoDimList = new ArrayList<>();

        fillList2(twoDimList);

        printList2(twoDimList);


    }

    private void printList2(List<TwoDim> twoDimList) {
        for (TwoDim twoDim : twoDimList) {
            System.out.println(twoDim);
        }         

    }

    private void fillList2(List<TwoDim> twoDimList) {
        twoDimList.add(new Kreis(0,0,5));
        twoDimList.add(new Kreis(0,0,2));
        twoDimList.add(new Kreis(0,0,1));
        twoDimList.add(new Dreieck(0,0,4,5,6,7));
        twoDimList.add(new Dreieck(0,0,1,2,1,3));
        twoDimList.add(new Dreieck(0,0,4,3,6,3));
        twoDimList.add(new Raute(0,0,5,5,5));
        twoDimList.add(new Raute(0,0,5,5,10));
        twoDimList.add(new Raute(0,0,5,2,5));

    }


}
