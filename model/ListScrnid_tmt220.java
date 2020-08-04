package model;

public class ListScrnid_tmt220 {
	private String funcid;
	private String lang;
	private String pchhtkbn;
	private String jobkbn;
	private String scrnid;
	private String menushwflg;
	private String authflg;
	public ListScrnid_tmt220(String funcid, String lang, String scrnid) {
		this.funcid = funcid;
		this.lang = lang;
		this.scrnid = scrnid;
	}
	public String getFuncid() {
		return funcid;
	}
	public void setFuncid(String funcid) {
		this.funcid = funcid;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPchhtkbn() {
		return pchhtkbn;
	}
	public void setPchhtkbn(String pchhtkbn) {
		this.pchhtkbn = pchhtkbn;
	}
	public String getJobkbn() {
		return jobkbn;
	}
	public void setJobkbn(String jobkbn) {
		this.jobkbn = jobkbn;
	}
	public String getScrnid() {
		return scrnid;
	}
	public void setScrnid(String scrnid) {
		this.scrnid = scrnid;
	}
	public String getMenushwflg() {
		return menushwflg;
	}
	public void setMenushwflg(String menushwflg) {
		this.menushwflg = menushwflg;
	}
	public String getAuthflg() {
		return authflg;
	}
	public void setAuthflg(String authflg) {
		this.authflg = authflg;
	}
	
}
