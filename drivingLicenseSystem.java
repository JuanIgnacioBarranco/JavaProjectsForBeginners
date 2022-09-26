package drivingLicenseSystem;

public class drivingLicenseSystem {
    public static void main(String[] args) {
        genericDriverLicenseDrivingLicense tom = new genericDriverLicenseDrivingLicense("Tom", true);
        tom.deduct(3);
        tom.setMedicalReport();
        comercialDriver lily = new comercialDriver("Lily", false, "Inflammable", "Truck");
        lily.deduct(5);
        lily.setMedicalReport();

        genericDriverLicenseDrivingLicense[] driverArray = new genericDriverLicenseDrivingLicense[2];
        driverArray[0] = tom;
        driverArray[1] = lily; // upcast to GenericDriverLicenseDrivingLicense
        for (int i=0; i< driverArray.length; i++){
            System.out.println(driverArray[i].getName() + " 's license is provisional : " + 
                driverArray[i].getIsProvisional());
            System.out.println(driverArray[i].getName() + " has " + 
                driverArray[i].getPoints() + " points ");
            System.out.println(driverArray[i].getMedicalReport());
        }
        // run a method specific to subclass only
        System.out.println(lily.getMaterialsType());


    }
    



}
