package br.com.economize.mail;

/**
* @author Mateus Henrique Tofanello
* 
*/

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class MailJavaMessage {

	public static final String TYPE_TEXT_PLAIN = "text/plain";
	public static final String TYPE_TEXT_HTML = "text/html";

	List<String> files = new ArrayList<String>();
	public Map<String, String> map = new HashMap<String, String>();

	// Indica qual será o servidor de email (gmail, hotmail, etc.)
	private String smtpHostMail;
	// Indica a porta de acesso ao servidor
	private String smtpPortMail;
	// Indica que a necessidade de autenticação no servidor (true ou false)
	private String smtpAuth;
	// Indica ao servidor que ele está recebendo uma conexão segura
	private String smtpStarttls;
	// Nome do remetente do email
	private String fromNameMail;
	// Email do remetente
	private String userMail;
	// Senha do email do remetente
	private String passMail;
	// Projeto do email
	private String subjectMail;
	// Corpo do email
	private String bodyMail;
	// Lista com email e nome dos destinatarios
	private Map<String, String> toMailsUsers;
	// Lista contendo os arquivos anexados
	private List<String> fileMails;
	// Charset, no caso de html e necessário
	private String charsetMail;
	// Tipo do formato da mensagem, texto ou html
	private String typeTextMail;

	public MailJavaMessage(String SubjectMail) {
		// Indica qual será o servidor de email(gmail, hotmail...)
		setSmtpHostMail("smtp.gmail.com");
		// Indica a porta de acesso ao servidor
		setSmtpPortMail("587");
		// Indica a necessidade de autenticação no servidor
		setSmtpAuth("true");
		// Indica ao servidor que ele está recebendo uma conexão segura
		setSmtpStarttls("true");
		// Email do remetente
		setUserMail("contato.planged@gmail.com");
		// Nome do email remetente
		setFromNameMail("E-conomize");
		// Senha do email remetente
		setPassMail("senha");
		// Charset, no caso de HTML é necessário
		setCharsetMail("UTF-8");
		// Tipo do formato da mensagem, texto ou HTML
		setTypeTextMail(MailJavaMessage.TYPE_TEXT_HTML);
		// Anexos do Email
		setFileMails(files);
		// Assunto do email
		setSubjectMail(SubjectMail);
	}

	public String getSmtpHostMail() {
		return smtpHostMail;
	}

	public void setSmtpHostMail(String smtpHostMail) {
		this.smtpHostMail = smtpHostMail;
	}

	public String getSmtpPortMail() {
		return smtpPortMail;
	}

	public void setSmtpPortMail(String smtpPortMail) {
		this.smtpPortMail = smtpPortMail;
	}

	public String getSmtpAuth() {
		return smtpAuth;
	}

	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	public String getSmtpStarttls() {
		return smtpStarttls;
	}

	public void setSmtpStarttls(String smtpStarttls) {
		this.smtpStarttls = smtpStarttls;
	}

	public String getFromNameMail() {
		return fromNameMail;
	}

	public void setFromNameMail(String fromNameMail) {
		this.fromNameMail = fromNameMail;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassMail() {
		return passMail;
	}

	public void setPassMail(String passMail) {
		this.passMail = passMail;
	}

	public String getSubjectMail() {
		return subjectMail;
	}

	public void setSubjectMail(String subjectMail) {
		this.subjectMail = subjectMail;
	}

	public String getBodyMail() {
		return bodyMail;
	}

	public void setBodyMail(String bodyMail) {
		this.bodyMail = bodyMail;
	}

	public Map<String, String> getToMailsUsers() {
		return toMailsUsers;
	}

	public void setToMailsUsers(Map<String, String> toMailsUsers) {
		this.toMailsUsers = toMailsUsers;
	}

	public List<String> getFileMails() {
		return fileMails;
	}

	public void setFileMails(List<String> fileMails) {
		this.fileMails = fileMails;
	}

	public String getCharsetMail() {
		return charsetMail;
	}

	public void setCharsetMail(String charsetMail) {
		this.charsetMail = charsetMail;
	}

	public String getTypeTextMail() {
		return typeTextMail;
	}

	public void setTypeTextMail(String typeTextMail) {
		this.typeTextMail = typeTextMail;
	}
}