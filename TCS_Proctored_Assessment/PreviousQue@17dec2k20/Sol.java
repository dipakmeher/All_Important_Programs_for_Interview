import java.util.Scanner;
public class Sol{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Associate[] associate = new Associate[2];
            for(int i=0;i<2;i++){
                String associateName = sc.next();
                int associateId = sc.nextInt();
                String technology = sc.next();
                int experienceInYrs = sc.nextInt();
                
                assoc   iate[i] = new Associate(associateName, associateId, technology, experienceInYrs);
            }
            String tech = sc.next();
            Associate answer[] = getanswer(associate,tech);
            for(int i=0; i<2; i++) {
                if(answer[i] != null) {
                    System.out.println(answer[i].getAssociateId());
                }
            }

    }
    public static Associate[] getanswer(Associate associate[],String tech){
        Associate temp[] = new Associate[2];
        int j=0;
        for(int i=0;i<2;i++){
            if(associate[i].getTechnology().toLowerCase().equals(tech.toLowerCase()) && associate[i].getExperienceInYrs() % 5 == 0) {
                temp[j++] = associate[i];
            }
        } 
        for(int i=0;i<j-1;i++){
            for(int k=0;k<j-1-i;k++){
                if(temp[k].getAssociateId()>temp[k+1].getAssociateId()){
                    Associate associates = temp[k];
                    temp[k]=temp[k+1];
                    temp[k+1]=associates;
                }
            }
        }
        return temp;
    }
}

class Associate {
    private String associateName;
    private int associateId;
    private String technology;
    private int experienceInYrs;

    public Associate(String associateName, int associateId, String technology, int experienceInYrs) {
        this.associateName = associateName;
        this.associateId = associateId;
        this.technology = technology;
        this.experienceInYrs = experienceInYrs;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYrs() {
        return experienceInYrs;
    }

    public void setExperienceInYrs(int experienceInYrs) {
        this.experienceInYrs = experienceInYrs;
    }
}
