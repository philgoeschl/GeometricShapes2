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
 * Created by Philipp Göschl on 09.11.2016.
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

    private void doItTwoDim() {

        List<TwoDim> twoDimList = new ArrayList<>();
        fillList2(twoDimList);
        printList2(twoDimList);
    }

    private void printList2(List<TwoDim> twoDimList) {
        System.out.println("\n---------- Two Dimensional Shapes ----------\n");

        double sumArea=0;
        double sumPerimeter=0;
        for (TwoDim twoDim : twoDimList) {
            System.out.println(twoDim);
            sumArea += twoDim.calcArea();
            sumPerimeter += twoDim.calcPerimeter();

        }
        System.out.println("\nSum of Area: "+sumArea);
        System.out.println("\nSum of Perimeter: "+sumPerimeter);

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

    private void doItThreeDim() {

        List<ThreeDim> threeDimList = new ArrayList<>();
        fillList3(threeDimList);
        printList3(threeDimList);


    }


    private void printList3(List<ThreeDim> threeDimList) {
        System.out.println("\n---------- Three Dimensional Shapes ----------\n");

        double sumVolume=0;
        double sumSurfaceArea=0;
        for (ThreeDim threeDim : threeDimList) {
            System.out.println(threeDim);
            sumVolume += threeDim.calcVolume();
            sumSurfaceArea += threeDim.calcSurfaceArea();
        }
        System.out.println("\nSum of Volume: "+sumVolume);
        System.out.println("\nSum of Surface Area: "+sumSurfaceArea);

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


}
