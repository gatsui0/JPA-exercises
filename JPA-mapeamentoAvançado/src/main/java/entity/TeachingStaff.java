package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue( value="TS" )
//@PrimaryKeyJoinColumn(referencedColumnName="sid")

public class TeachingStaff extends Staff {
    private String qualification;
    private String subjectexpertise;

    public TeachingStaff(int sid, String sname, String qualification, String subjectexpertise) {
        super(sid, sname);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaff() {
        super();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSubjectexpertise() {
        return subjectexpertise;
    }

    public void setSubjectexpertise(String subjectexpertise) {
        this.subjectexpertise = subjectexpertise;
    }
}
