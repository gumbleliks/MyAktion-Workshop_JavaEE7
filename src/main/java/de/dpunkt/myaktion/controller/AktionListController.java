package de.dpunkt.myaktion.controller;


import de.dpunkt.myaktion.model.Aktion;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author gumbleliks
 */
@SessionScoped
@Named
public class AktionListController implements Serializable {

    private static final long serialVersionUID = 25875238972L;

    public String doAddAktion() {
        System.out.println("Add Aktion");
        return Pages.AKTION_EDIT;
    }

    public String doEditAktion(Aktion aktion) {
        System.out.println("Edit Aktion" + aktion);
        return Pages.AKTION_EDIT;
    }

    public String doEditSpendeForm(Aktion aktion) {
        System.out.println("Edit SPende Form" + aktion);
        return Pages.AKTION_EDIT;
    }

    public String doListSpende(Aktion aktion) {
        System.out.println("List Spende" + aktion);
        return Pages.AKTION_EDIT;
    }

    public void doDeleteAktion(Aktion aktion) {
        System.out.println("Aktion löschen noch nicht implementiert");
    }
}
