package at.htl.dogschool.entity;

import jdk.jfr.Name;

import javax.persistence.*;

/**
 * abbreviation:
 * - bg1 ... Begleithunde1
 * - bg2 ... Begleithunde2
 * - w ... Welpenkurs
 */
@NamedQueries({

        @NamedQuery(
        name = "CourseType.findByAbbr",
        query = "select c from CourseType c where c.abbr = :ABBR"
        ),

        @NamedQuery(
                name = "CourseType.findById",
                query = "select c from CourseType c where c.id = :ID"
        ),

        @NamedQuery(
                name = "CourseType.deleteById",
                query = "delete from CourseType c where c.id = :ID"
        ),
        /*
        @NamedQuery(
                name = "CourseType.updateById",
                query = "update CourseType SET CourseType.id = 1 where CourseType.id = :ID"
        )
        Fehlerhaftes Statement
        */

})
@Entity
public class CourseType {

    @Id
    private Long id;

    private String name;
    private String abbr; // abbreviation

    //region Constructors
    public CourseType() {
    }

    public CourseType(String name, String abbr) {
        this.name = name;
        this.abbr = abbr;
    }

//endregion

    //region Getter and Setter
    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
    //endregion

    @Override
    public String toString() {
        return String.format("%s (%s)", name, abbr);
    }


}
