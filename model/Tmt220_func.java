package model;
import java.time.LocalDate;
public class Tmt220_func{
       private  String funcid;
       private  String lang;
       private  String funcnm;
       private  String funcrnm;
       private  String jobkbn;
       private  String pchhtkbn;
       private  String scrnid;
       private  String menushwflg;
       private  String authflg;
       private  String funcremark;
       private  String hhtmenuno;
       private  String strrsrv1;
       private  String strrsrv2;
       private  String strrsrv3;
       private  String strrsrv4;
       private  String strrsrv5;
       private  String delflg;
       private  String entusrcd;
       private  String entprg;
       private  String updusrcd;
       private  String updprg;
       public Tmt220_func() {}
      public Tmt220_func(String funcid , String lang , String funcnm , String funcrnm , String jobkbn , String pchhtkbn , String scrnid , String menushwflg , String authflg , String funcremark , String hhtmenuno , String strrsrv1 , String strrsrv2 , String strrsrv3 , String strrsrv4 , String strrsrv5 , String delflg , String entusrcd , String entprg , String updusrcd , String updprg ){
          this.funcid = funcid;
          this.lang = lang;
          this.funcnm = funcnm;
          this.funcrnm = funcrnm;
          this.jobkbn = jobkbn;
          this.pchhtkbn = pchhtkbn;
          this.scrnid = scrnid;
          this.menushwflg = menushwflg;
          this.authflg = authflg;
          this.funcremark = funcremark;
          this.hhtmenuno = hhtmenuno;
          this.strrsrv1 = strrsrv1;
          this.strrsrv2 = strrsrv2;
          this.strrsrv3 = strrsrv3;
          this.strrsrv4 = strrsrv4;
          this.strrsrv5 = strrsrv5;
          this.delflg = delflg;
          this.entusrcd = entusrcd;
          this.entprg = entprg;
          this.updusrcd = updusrcd;
          this.updprg = updprg;
        }
       public Tmt220_func(String lang , String funcnm , String funcrnm , String jobkbn , String pchhtkbn , String scrnid , String menushwflg , String authflg , String funcremark , String hhtmenuno , String strrsrv1 , String strrsrv2 , String strrsrv3 , String strrsrv4 , String strrsrv5 , String delflg , String entusrcd , String entprg , String updusrcd , String updprg ){
          this.lang = lang;
          this.funcnm = funcnm;
          this.funcrnm = funcrnm;
          this.jobkbn = jobkbn;
          this.pchhtkbn = pchhtkbn;
          this.scrnid = scrnid;
          this.menushwflg = menushwflg;
          this.authflg = authflg;
          this.funcremark = funcremark;
          this.hhtmenuno = hhtmenuno;
          this.strrsrv1 = strrsrv1;
          this.strrsrv2 = strrsrv2;
          this.strrsrv3 = strrsrv3;
          this.strrsrv4 = strrsrv4;
          this.strrsrv5 = strrsrv5;
          this.delflg = delflg;
          this.entusrcd = entusrcd;
          this.entprg = entprg;
          this.updusrcd = updusrcd;
          this.updprg = updprg;
        }
     public void setFUNCID(String funcid) {
           this.funcid = funcid;
     }
     public String getFUNCID(){       
          return funcid;
     }
     public void setLANG(String lang) {
           this.lang = lang;
     }
     public String getLANG(){       
          return lang;
     }
     public void setFUNCNM(String funcnm) {
           this.funcnm = funcnm;
     }
     public String getFUNCNM(){       
          return funcnm;
     }
     public void setFUNCRNM(String funcrnm) {
           this.funcrnm = funcrnm;
     }
     public String getFUNCRNM(){       
          return funcrnm;
     }
     public void setJOBKBN(String jobkbn) {
           this.jobkbn = jobkbn;
     }
     public String getJOBKBN(){       
          return jobkbn;
     }
     public void setPCHHTKBN(String pchhtkbn) {
           this.pchhtkbn = pchhtkbn;
     }
     public String getPCHHTKBN(){       
          return pchhtkbn;
     }
     public void setSCRNID(String scrnid) {
           this.scrnid = scrnid;
     }
     public String getSCRNID(){       
          return scrnid;
     }
     public void setMENUSHWFLG(String menushwflg) {
           this.menushwflg = menushwflg;
     }
     public String getMENUSHWFLG(){       
          return menushwflg;
     }
     public void setAUTHFLG(String authflg) {
           this.authflg = authflg;
     }
     public String getAUTHFLG(){       
          return authflg;
     }
     public void setFUNCREMARK(String funcremark) {
           this.funcremark = funcremark;
     }
     public String getFUNCREMARK(){       
          return funcremark;
     }
     public void setHHTMENUNO(String hhtmenuno) {
           this.hhtmenuno = hhtmenuno;
     }
     public String getHHTMENUNO(){       
          return hhtmenuno;
     }
     public void setSTRRSRV1(String strrsrv1) {
           this.strrsrv1 = strrsrv1;
     }
     public String getSTRRSRV1(){       
          return strrsrv1;
     }
     public void setSTRRSRV2(String strrsrv2) {
           this.strrsrv2 = strrsrv2;
     }
     public String getSTRRSRV2(){       
          return strrsrv2;
     }
     public void setSTRRSRV3(String strrsrv3) {
           this.strrsrv3 = strrsrv3;
     }
     public String getSTRRSRV3(){       
          return strrsrv3;
     }
     public void setSTRRSRV4(String strrsrv4) {
           this.strrsrv4 = strrsrv4;
     }
     public String getSTRRSRV4(){       
          return strrsrv4;
     }
     public void setSTRRSRV5(String strrsrv5) {
           this.strrsrv5 = strrsrv5;
     }
     public String getSTRRSRV5(){       
          return strrsrv5;
     }
     public void setDELFLG(String delflg) {
           this.delflg = delflg;
     }
     public String getDELFLG(){       
          return delflg;
     }
     public void setENTUSRCD(String entusrcd) {
           this.entusrcd = entusrcd;
     }
     public String getENTUSRCD(){       
          return entusrcd;
     }
     public void setENTPRG(String entprg) {
           this.entprg = entprg;
     }
     public String getENTPRG(){       
          return entprg;
     }
     public void setUPDUSRCD(String updusrcd) {
           this.updusrcd = updusrcd;
     }
     public String getUPDUSRCD(){       
          return updusrcd;
     }
     public void setUPDPRG(String updprg) {
           this.updprg = updprg;
     }
     public String getUPDPRG(){       
          return updprg;
     }
}