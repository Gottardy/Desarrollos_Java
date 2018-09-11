package co.gottardy.melo.gotalentdigital.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="social_media")
public class SocialMedia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_socila_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_social_media;
	
	@Column(name="name")
	private String name;
	
	@Column(name="icon")
	private String icon;
	
	private Set<TeacherSocialMedia> teacherSocialMedia;
	
	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}
	
	
	public SocialMedia() {
		super();
	}


	public Long getId_social_media() {
		return id_social_media;
	}

	public void setId_social_media(Long id_social_media) {
		this.id_social_media = id_social_media;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Set<TeacherSocialMedia> getTeacherSocialMedia() {
		return teacherSocialMedia;
	}


	public void setTeacherSocialMedia(Set<TeacherSocialMedia> teacherSocialMedia) {
		this.teacherSocialMedia = teacherSocialMedia;
	}
	
	

}
