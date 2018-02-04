
public class Person {
    private int _age;
    private float _weight;
    private double _IQ;
    private boolean _isValid = false;

    // GET ACCESSOR METHOD for age
    public int getAge() {
        return _age;
    }


    // SET MUTATOR METHOD for age
    public void setAge(String ageString) {

        try {
            int age = Integer.parseInt(ageString);

            if (age < 0) {
                System.out.println("Please enter a positive number");
            } else {
                this._age = age;
                this._isValid = true;
            }

        } catch (Exception exception) {
            System.out.println("Please enter an integer value");
        }


    }

    // Empty CONSTRUCTOR
    Person() {

    }

    // CONSTRUCTOR that sets age
    Person(int age) {
        this._age = age;

    }

    // CONSTRUCTOR that sets weight
    Person(float weight) {
        this._weight = weight;
        System.out.println("Weight: " + this._weight);
    }

    // CONSTRUCTOR that sets IQ
    Person(double IQ) {
        this._IQ = IQ;
        System.out.println("Weight: " + this._IQ);
    }

    // OVERIDDING TOSTRING METHOD
    public String toString() {
        return "\nYou entered: " + this._age;

    }


    // GET ACCESSOR METHOD for isValid
    public boolean getIsValid() {
        return this._isValid;
    }


}
