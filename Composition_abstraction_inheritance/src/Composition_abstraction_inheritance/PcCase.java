package Composition_abstraction_inheritance;

public class PcCase {
    
    private String casemodel;
    private String casematerial;
    private String casesize;

    public PcCase(String casemodel, String casematerial, String casesize) {
        this.casemodel = casemodel;
        this.casematerial = casematerial;
        this.casesize = casesize;
    }

    public String getCasemodel() {
        return casemodel;
    }
    public void setCasemodel(String casemodel) {
        this.casemodel = casemodel;
    }
    public String getCasematerial() {
        return casematerial;
    }
    public void setCasematerial(String casematerial) {
        this.casematerial = casematerial;
    }
    public String getCasesize() {
        return casesize;
    }
    public void setCasesize(String casesize) {
        this.casesize = casesize;
    }
}



