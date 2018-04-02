package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.UUID;

/**
 * The type University.
 */
@Entity
@Table(name = "university")
public class University extends BaseModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	private City city;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "cover_image_path")
	private String coverImagePath;

	@Column(name = "profile_image_path")
	private String profileImagePath;

	@Column(name = "description")
	private String description;

	@Column(name = "email")
	private String email;

	@Column(name = "latitude")
	private Float latitude;

	@Column(name = "longitude")
	private Float longitude;

	@Column(name = "starRating")
	private Integer starRating;

	@OneToMany(mappedBy = "universityId", fetch=FetchType.EAGER)
	private Set<UniversityPhoto> photos;

	@OneToMany(mappedBy = "universityId", fetch=FetchType.EAGER)
	private Set<UniversityReview> reviews;

	@OneToMany(mappedBy = "universityId", orphanRemoval = true, cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<StudyProgram> studyPrograms;

	@Transient
	private Integer numberOfRatings = 0;

	@Transient
	private Double averageRating;



	/**
	 * Instantiates a new University.
	 */
	public University() { }

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets city.
	 *
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * Sets city.
	 *
	 * @param city the city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets phone.
	 *
	 * @param phone the phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets cover image path.
	 *
	 * @return the cover image path
	 */
	public String getCoverImagePath() {
		return coverImagePath;
	}

	/**
	 * Sets cover image path.
	 *
	 * @param coverImagePath the cover image path
	 */
	public void setCoverImagePath(String coverImagePath) {
		this.coverImagePath = coverImagePath;
	}

	/**
	 * Gets profile image path.
	 *
	 * @return the profile image path
	 */
	public String getProfileImagePath() {
		return profileImagePath;
	}

	/**
	 * Sets profile image path.
	 *
	 * @param profileImagePath the profile image path
	 */
	public void setProfileImagePath(String profileImagePath) {
		this.profileImagePath = profileImagePath;
	}

	/**
	 * Gets description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email.
	 *
	 * @param email the email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets photos.
	 *
	 * @return the photos
	 */
	public Set<UniversityPhoto> getPhotos() {
		return photos;
	}

	/**
	 * Sets photos.
	 *
	 * @param photos the photos
	 */
	public void setPhotos(Set<UniversityPhoto> photos) {
		this.photos = photos;
	}

	/**
	 * Gets reviews.
	 *
	 * @return the reviews
	 */
	public Set<UniversityReview> getReviews() {
		return this.reviews;
	}

	/**
	 * Sets reviews.
	 *
	 * @param reviews the reviews
	 */
	public void setReviews(Set<UniversityReview> reviews) {
		this.reviews = reviews;
	}

	/**
	 * Gets studyPrograms.
	 *
	 * @return the studyPrograms
	 */
	public Set<StudyProgram> getStudyPrograms() {
		return studyPrograms;
	}

	/**
	 * Sets studyPrograms.
	 *
	 * @param studyPrograms the studyPrograms
	 */
	public void setStudyPrograms(Set<StudyProgram> studyPrograms) {
		this.studyPrograms=studyPrograms;
	}

	/**
	 * Gets number of ratings.
	 *
	 * @return the number of ratings
	 */
	public Integer getNumberOfRatings() {
		return this.reviews.size();
	}

	/**
	 * Gets average rating.
	 *
	 * @return the average rating
	 */
	public Double getAverageRating() {
		OptionalDouble average = this.reviews.stream().mapToInt(UniversityReview::getRating).average();
		return average.isPresent() ? average.getAsDouble() : 0D;
	}

	/**
	 * Gets latitude.
	 *
	 * @return the latitude
	 */
	public Float getLatitude() {
		return latitude;
	}

	/**
	 * Sets latitude.
	 *
	 * @param latitude the latitude
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets longitude.
	 *
	 * @return the longitude
	 */
	public Float getLongitude() {
		return longitude;
	}

	/**
	 * Sets longitude.
	 *
	 * @param longitude the longitude
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	/**
	 * Sets average rating.
	 *
	 * @param averageRating the average rating
	 */
	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 *  set star rating
	 * @return the star rating
	 */
	public Integer getStarRating() {
		return starRating;
	}

	/**
	 *
	 * @param starRating the star rating
	 */
	public void setStarRating(Integer starRating) {
		this.starRating = starRating;
	}
}
