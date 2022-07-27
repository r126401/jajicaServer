package net.jajicaiot.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Devices")
public class Device implements Serializable{
	
	private static final long serialVersionUID = -8552708335379409480L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 150, nullable = false)
	private String email;
	@Column(length = 150, nullable = false)
	private String deviceName;
	@Column(length = 12, nullable = false)
	private String idDevice;
	@Column(length = 50, nullable = false)
	private String publishTopic;
	@Column(length = 50, nullable = false)
	private String subscribeTopic;
	@Column(nullable = false)
	private int deviceType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getIdDevice() {
		return idDevice;
	}
	public void setIdDevice(String idDevice) {
		this.idDevice = idDevice;
	}
	public String getPublishTopic() {
		return publishTopic;
	}
	public void setPublishTopic(String publishTopic) {
		this.publishTopic = publishTopic;
	}
	public String getSubscribeTopic() {
		return subscribeTopic;
	}
	public void setSubscribeTopic(String subscribeTopic) {
		this.subscribeTopic = subscribeTopic;
	}
	public int getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}
	


	
}
