package io.codelex.oop;

import io.codelex.oop.parcels.Parcel;

public class ParcelTest {
    public static void main(String[] args) {

        Parcel legitParcel = new Parcel(35, 45, 55, 25, false);
        System.out.println(legitParcel.validate()); // Expected: true

        Parcel heavyParcel = new Parcel(35, 45, 55, 35, false);
        System.out.println(heavyParcel.validate()); // Expected: Parcel too heavy + false

        Parcel tooHeavyForExpress = new Parcel(35, 45, 55, 25, true);
        System.out.println(tooHeavyForExpress.validate()); // Expected: Parcel too heavy for express! + false

        Parcel largeParcel = new Parcel(105, 105, 105, 20, false);
        System.out.println(largeParcel.validate()); // Expected: Parcel too large! + false

        Parcel smallXParcel= new Parcel(25, 45, 55, 25, false);
        System.out.println(smallXParcel.validate()); // Expected: xLength too small! + false

        Parcel smallYParcel= new Parcel(35, 25, 55, 25, false);
        System.out.println(smallYParcel.validate()); // Expected: yLength too small! + false

        Parcel smallZParcel= new Parcel(35, 45, 25, 25, false);
        System.out.println(smallZParcel.validate()); // Expected: zLength too small! + false

        Parcel worstParcelInTheWorld = new Parcel(25, 25, 25,35, true);
        System.out.println(worstParcelInTheWorld.validate()); // Expected: all errors except "too large"

    }

}
