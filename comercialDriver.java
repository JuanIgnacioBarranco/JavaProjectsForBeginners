package drivingLicenseSystem;

public class comercialDriver extends genericDriverLicenseDrivingLicense {

    private String hazardousMaterialsType;
    private String carType; //specific comercial car category
    public comercialDriver(String name, boolean isProvisional, 
            String materialType, String car) {
            /*The super keyword refers to superclass (parent) objects.

            It is used to call superclass methods, and to access the superclass constructor.

            The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

            To understand the super keyword, you should have a basic understanding of Inheritance and Polymorphism. 
            */
        super(name, isProvisional);
        hazardousMaterialsType = materialType;
        carType = car;
    }
    public String getMaterialsType(){
        return hazardousMaterialsType;
    }
    // override genericDriver's method
    public void setMedicalReport(){
        medicalReport = "Approved to drive " + carType;
    }
}
