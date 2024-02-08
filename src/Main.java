import tuples.UnitTuple;
import tuples.PairTuple;
import tuples.TripletTuple;
import tuples.QuartetTuple;
import tuples.QuintetTuple;
import tuples.SextetTuple;
import tuples.SeptetTuple;
import tuples.OctetTuple;
import tuples.EnneadTuple;
import tuples.DecadeTuple;

import extended.tuples.ExtendedUnitTuple;
import extended.tuples.ExtendedPairTuple;
import extended.tuples.ExtendedTripletTuple;
import extended.tuples.ExtendedQuartetTuple;
import extended.tuples.ExtendedQuintetTuple;
import extended.tuples.ExtendedSextetTuple;
import extended.tuples.ExtendedSeptetTuple;
import extended.tuples.ExtendedOctetTuple;
import extended.tuples.ExtendedEnneadTuple;
import extended.tuples.ExtendedDecadeTuple;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simple tuples:");
        testSimpleTuples();

        System.out.println("\n\nExtended tuples:");
        testExtendedTuples();

        System.out.println("\n\nVariable number of arguments tuples:");
        testGenericTuples();
    }

    public static void testSimpleTuples() {
        // Unit Tuples: 1 element
        UnitTuple<Integer> unitTuple1 = new UnitTuple<>(1);
        System.out.println("Unit tuple: " + unitTuple1.getFirst());

        UnitTuple<Double> unitTuple2 = UnitTuple.with((Double) 3.14);
        System.out.println(unitTuple2);         // calling `toString` method


        // Pair Tuples: 2 elements
        PairTuple<String, Integer> pairTuple1 = new PairTuple<>("good", 1);
        System.out.println(pairTuple1);

        PairTuple<ArrayList<Integer>, Double> pairTuple2 = PairTuple.with(new ArrayList<Integer>(), 3.14);
        ArrayList<Integer> integers = pairTuple2.getFirst();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        pairTuple2.setFirst(integers);
        System.out.println(pairTuple2);         // calling `toString` method


        // Triplet Tuple: 3 elements
        TripletTuple<Integer, String, Integer> tripletTuple1 = new TripletTuple<>(1, "good", 1);
        System.out.println(tripletTuple1);      // calling `toString` method

        TripletTuple<Integer, Double, Float> tripletTuple2 = TripletTuple.with(1, 1, 1);
        System.out.println(tripletTuple2);      // calling `toString` method

        // Quartet Tuples: 4 elements
        QuartetTuple<Integer, Double, Integer, Double> quartetTuple1 =
                new QuartetTuple<>(1, 1.0, 1, 1.0);
        System.out.println(quartetTuple1);      // calling `toString` method

        QuartetTuple<Integer, Double, Double, Integer> quartetTuple2 =
                QuartetTuple.with(1, 1.0, 1.0, 1);
        System.out.println(quartetTuple2);      // calling `toString` method

        // Quintet Tuple: 5 elements
        QuintetTuple<Integer, Double, Integer, Double, Integer> quintetTuple1 =
                new QuintetTuple<>(1, 1.0, 1, 1.0, 1);
        System.out.println(quintetTuple1);      // calling `toString` method

        QuintetTuple<Integer, Double, Double, Integer, Float> quintetTuple2 =
                QuintetTuple.with(1, 1.0, 1.0, 1, 1.0);
        System.out.println(quintetTuple2);      // calling `toString` method

        // Sextet Tuples: 6 elements
        SextetTuple<Integer, Double, Integer, Double, Integer, Integer> sextetTuple1 =
                new SextetTuple<>(1, 1.0, 1, 1.0, 1, 1);
        System.out.println(sextetTuple1);       // calling `toString` method

        SextetTuple<Integer, Double, Double, Integer, Float, Double> sextetTuple2 =
                SextetTuple.with(1, 1.0, 1.0, 1, 1.0, 1);
        System.out.println(sextetTuple2);       // calling `toString` method


        // Septet Tuples: 7 elements
        SeptetTuple<Integer, Double, Integer, Double, Integer, Double, Integer> septetTuple1 =
                new SeptetTuple<>(1, 1.0, 1, 1.0, 1, 1.0, 1);
        System.out.println(septetTuple1);       // calling `toString` method

        SeptetTuple<Integer, Double, Double, Integer, Float, Double, Integer> septetTuple2 =
                SeptetTuple.with(1, 1.0, 1.0, 1, 1.0, 1, 1);
        System.out.println(septetTuple2);       // calling `toString` method


        // Octet Tuples: 8 elements
        OctetTuple<Integer, Double, Integer, Double, Integer, Double, Integer, Double> octetTuple1 =
                new OctetTuple<>(1, 1.0, 1, 1.0, 1, 1.0, 1, 1.0);
        System.out.println(octetTuple1);        // calling `toString` method

        OctetTuple<Integer, Double, Double, Integer, Float, Double, Integer, Double> octetTuple2 =
                OctetTuple.with(1, 1.0, 1.0, 1, 1.0, 1, 1, 1.0);
        System.out.println(octetTuple2);        // calling `toString` method
    }

    public static void testExtendedTuples() {
        // Unit Tuples: 1 element
        ExtendedUnitTuple<Integer> unitTuple1 = new ExtendedUnitTuple<>(1);
        System.out.println("Unit tuple: " + unitTuple1.getFirst());

        ExtendedUnitTuple<Double> unitTuple2 = ExtendedUnitTuple.with((Double) 3.14);
        System.out.println(unitTuple2);         // calling `toString` method


        // Pair Tuples: 2 elements
        ExtendedPairTuple<String, Integer> pairTuple1 = new ExtendedPairTuple<>("good", 1);
        System.out.println(pairTuple1);         // calling `toString` method

        ExtendedPairTuple<ArrayList<Integer>, Double> pairTuple2 = ExtendedPairTuple.with(new ArrayList<Integer>(), 3.14);
        ArrayList<Integer> integers = pairTuple2.getFirst();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        pairTuple2.setFirst(integers);
        System.out.println(pairTuple2);         // calling `toString` method


        // Triplet Tuple: 3 elements
        ExtendedTripletTuple<Integer, String, Integer> tripletTuple1 = new ExtendedTripletTuple<>(1, "good", 1);
        System.out.println(tripletTuple1);      // calling `toString` method

        ExtendedTripletTuple<Integer, Double, Float> tripletTuple2 = ExtendedTripletTuple.with(1, 1, 1);
        System.out.println(tripletTuple2);      // calling `toString` method

        // Quartet Tuples: 4 elements
        ExtendedQuartetTuple<Integer, Double, Integer, Double> quartetTuple1 =
                new ExtendedQuartetTuple<>(1, 1.0, 1, 1.0);
        System.out.println(quartetTuple1);      // calling `toString` method

        ExtendedQuartetTuple<Integer, Double, Double, Integer> quartetTuple2 =
                ExtendedQuartetTuple.with(1, 1.0, 1.0, 1);
        System.out.println(quartetTuple2);      // calling `toString` method

        // Quintet Tuple: 5 elements
        ExtendedQuintetTuple<Integer, Double, Integer, Double, Integer> quintetTuple1 =
                new ExtendedQuintetTuple<>(1, 1.0, 1, 1.0, 1);
        System.out.println(quintetTuple1);      // calling `toString` method


        ExtendedQuintetTuple<Integer, Double, Integer, Double, Integer> quintetTuple2 =
                ExtendedQuintetTuple.with(1, 1.0, 1, 1.0, 1);
        System.out.println(quintetTuple2.toString());



        // Sextet Tuples: 6 elements
        ExtendedSextetTuple<Integer, Double, Integer, Double, Integer, Integer> sextetTuple1 =
                new ExtendedSextetTuple<>(1, 1.0, 1, 1.0, 1, 1);
        System.out.println(sextetTuple1.toString());

        ExtendedSextetTuple<Integer, Double, Double, Integer, Float, Double> sextetTuple2 =
                ExtendedSextetTuple.with(1, 1.0, 1.0, 1, 1.0, 1);
        System.out.println(sextetTuple2.toString());


        // Septet Tuples: 7 elements
        ExtendedSeptetTuple<Integer, Double, Integer, Double, Integer, Double, Integer> septetTuple1 =
                new ExtendedSeptetTuple<>(1, 1.0, 1, 1.0, 1, 1.0, 1);
        System.out.println(septetTuple1);       // calling `toString` method

        ExtendedSeptetTuple<Integer, Double, Double, Integer, Float, Double, Integer> septetTuple2 =
                ExtendedSeptetTuple.with(1, 1.0, 1.0, 1, 1.0, 1, 1);
        System.out.println(septetTuple2);       // calling `toString` method


        // Octet Tuples: 8 elements
        ExtendedOctetTuple<Integer, Double, Integer, Double, Integer, Double, Integer, Double> octetTuple1 =
                new ExtendedOctetTuple<>(1, 1.0, 1, 1.0, 1, 1.0, 1, 1.0);
        System.out.println(octetTuple1.toString());

        ExtendedOctetTuple<Integer, Double, Double, Integer, Float, Double, Integer, Double> octetTuple2 =
                ExtendedOctetTuple.with(1, 1.0, 1.0, 1, 1.0, 1, 1, 1.0);
        System.out.println(octetTuple2);    // calling `toString` method

        octetTuple2.setFirst(101);
        octetTuple2.setSecond(10.1);
        octetTuple2.setThird(1.01);
        octetTuple2.setForth(101);
        octetTuple2.setFifth(10.1f);        // using `10.1f` to match the `Float` type
        octetTuple2.setSixth(101.0);
        octetTuple2.setSeventh(101);
        octetTuple2.setEighth(10.1);

        System.out.println(octetTuple2);    // calling `toString` method

    }



    public static void testGenericTuples() {
        // Unit Tuple: 1 element
        GenericTuple unit1 = new GenericTuple( "good");
        System.out.println(unit1);
    }

}
