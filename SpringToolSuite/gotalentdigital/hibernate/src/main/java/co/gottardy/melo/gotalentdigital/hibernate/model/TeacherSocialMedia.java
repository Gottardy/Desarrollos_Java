package co.gottardy.melo.gotalentdigital.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_social_media")
public class TeacherSocialMedia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_teacher_social_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_teacher_social_media;

	@Column(name="nickname")
	private String nickname;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_social_media")
	private SocialMedia social_media;
	
	
	
	public TeacherSocialMedia(Teacher teacher, SocialMedia social_media, String nickname) {
		super();
		this.teacher = teacher;
		this.social_media = social_media;
		this.nickname = nickname;
	}


	public TeacherSocialMedia() {
		super();
	}


	public Long getId_teacher_social_media() {
		return id_teacher_social_media;
	}


	public void setId_teacher_social_media(Long id_teacher_social_media) {
		this.id_teacher_social_media = id_teacher_social_media;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public SocialMedia getSocial_media() {
		return social_media;
	}


	public void setSocial_media(SocialMedia social_media) {
		this.social_media = social_media;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	
}
