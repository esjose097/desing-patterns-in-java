package Builder4Facetico;

/**
 * Builder de personas con trabajo.
 *
 * @author jose casal
 */
public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.annualInCome = annualIncome;
        return this;
    }
}
