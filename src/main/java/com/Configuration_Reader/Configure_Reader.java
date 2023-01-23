package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {
	public static Properties proper;

	public Configure_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Mediwave Digital\\eclipse-workspace\\Amity_sample\\src\\main\\java\\com\\Configuration_Properties\\Configure.properties");
		FileInputStream fi = new FileInputStream(f);

		proper = new Properties();
		proper.load(fi);

	}

	public String getURL() {

		String property = proper.getProperty("url");
		return property;

	}

	public String getCreatermail() {

		String property = proper.getProperty("CreatorUser");
		return property;

	}

	public String getCreatorPassword() {

		String property = proper.getProperty("CreatorPassword");
		return property;

	}

	public String getApprovermail() {

		String property = proper.getProperty("ApproverUser");
		return property;

	}

	public String getApproverPass() {

		String property = proper.getProperty("ApproverPass");
		return property;

	}

	public String getCaption() {

		String property = proper.getProperty("caption");
		return property;

	}

	public String getTrustmail() {

		String property = proper.getProperty("TrustUser");
		return property;

	}

	public String getTrustPassword() {

		String property = proper.getProperty("TrustPassword");
		return property;

	}

	public String getCaptionImage() {

		String property = proper.getProperty("CaptionImage");
		return property;

	}

	public String getsuperadminemail() {

		String superadminemail = proper.getProperty("superadminemail");
		return superadminemail;
	}

	public String getsuperadminpassword() {

		String superadminpassword = proper.getProperty("superadminpassword");
		return superadminpassword;
	}

	public String getSystemAdminmail() {

		String superadminpassword = proper.getProperty("systemadminemail");
		return superadminpassword;
	}

	public String getsystemadminusername() {

		String systemadminusername = proper.getProperty("systemadminusername");
		return systemadminusername;
	}

	public String getcreatedemailaddress() {

		String createdemailaddress = proper.getProperty("createdemailaddress");
		return createdemailaddress;
	}

	public String getcreatedpassword() {

		String createdpassword = proper.getProperty("createdpassword");
		return createdpassword;
	}

	public String gettrustname() {

		String trustname = proper.getProperty("trustname");
		return trustname;
	}

	public String gettrustemailaddress() {

		String trustemailaddress = proper.getProperty("trustemailaddress");
		return trustemailaddress;
	}

	public String getcontentcreatoremailaddress() {

		String contentcreatoremailaddress = proper.getProperty("contentcreatoremailaddress");
		return contentcreatoremailaddress;
	}

	public String getcontentcreatorpassword() {

		String contentcreatorpassword = proper.getProperty("contentcreatorpassword");
		return contentcreatorpassword;
	}

	public String getemail() {

		String email = proper.getProperty("Email");
		return email;
	}

	public String getpassword() {

		String pass = proper.getProperty("Password");
		return pass;

	}

	public String getuserc() {

		String userc = proper.getProperty("UserC");
		return userc;

	}

	public String getemail1() {

		String email1 = proper.getProperty("Email1");
		return email1;

	}

	public String getusera() {

		String usera = proper.getProperty("UserA");
		return usera;

	}

	public String getemail2() {

		String email2 = proper.getProperty("Email2");
		return email2;

	}

	public String getsysemail() {

		String sysemail = proper.getProperty("Sysemail");
		return sysemail;

	}

	public String getsyspass() {

		String syspass = proper.getProperty("Syspass");
		return syspass;

	}

	public String getcemail() {

		String cemail = proper.getProperty("Cemail");
		return cemail;

	}

	public String getcpass() {

		String cpass = proper.getProperty("Cpass");
		return cpass;

	}

	public String gettags() {

		String tags = proper.getProperty("Tags");
		return tags;

	}

	public String gettitle() {

		String title = proper.getProperty("Title");
		return title;

	}

	public String getaemail() {

		String aemail = proper.getProperty("Aemail");
		return aemail;

	}

	public String getapass() {

		String apass = proper.getProperty("Apass");
		return apass;

	}

	public String getResource_title() {

		String apass = proper.getProperty("resource_title");
		return apass;

	}

	public String getSource_Link() {

		String apass = proper.getProperty("Source_Link");
		return apass;

	}

	public String getTags() {

		String apass = proper.getProperty("Tags");
		return apass;

	}

	public String getNotes() {

		String apass = proper.getProperty("Notes");
		return apass;

	}

	public String getResource_title2() {

		String apass = proper.getProperty("resource_title2");
		return apass;

	}

	public String getVideo_Caption() {

		String apass = proper.getProperty("Video_Caption");
		return apass;

	}

	public String getResource_title3() {

		String apass = proper.getProperty("resource_title3");
		return apass;

	}

}