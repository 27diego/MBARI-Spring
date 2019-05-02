package edu.csumb.sp19.cst438.mbari.model;

import edu.csumb.sp19.cst438.mbari.model.diveLog;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

public class User {
  @Id
  private String id;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private String birthday;
  private String mobile;
  private String secondMobile;
  private String comments;
  private Boolean isContractor;
  private Boolean isIntern;
  private Boolean isStaff;
  private Boolean isVolunteer;
  private Boolean isUser;
  private Boolean isAdministrator;
  private Boolean isPowerUser;
  private Boolean isActive;
  private Boolean isDiver;
  private Boolean isTrainer;
  private Boolean isTechnician;
  private String eFirstName;
  private String eLastName;
  private String eRelationship;
  private String eContactMobile;
  private String eSecondMobile;
  
  private diveLog divelog;
  //diego, might be broken

  public User() {

  }

  public User(diveLog divelog, String username, String password, String firstName, String lastName, String email, String birthday, String mobile, String secondMobile, String comments, Boolean isContractor, Boolean isIntern, Boolean isStaff, Boolean isVolunteer, Boolean isUser, Boolean isAdministrator, Boolean isPowerUser, Boolean isActive,Boolean isDiver, Boolean isTrainer, Boolean isTechnician,  String eFirstName, String eLastName, String eRelationship, String eContactMobile, String eSecondMobile) {
    this.divelog = divelog;
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthday = birthday;
    this.mobile = mobile;
    this.secondMobile = secondMobile;
    this.comments = comments;
    this.isContractor = isContractor;
    this.isIntern = isIntern;
    this.isStaff = isStaff;
    this.isVolunteer = isVolunteer;
    this.isUser = isUser;
    this.isAdministrator = isAdministrator;
    this.isPowerUser = isPowerUser;
    this.isActive = isActive;
    this.isDiver = isDiver;
    this.isTrainer = isTrainer;
    this.isTechnician = isTechnician;
    this.eFirstName = eFirstName;
    this.eLastName = eLastName;
    this.eRelationship = eRelationship;
    this.eContactMobile = eContactMobile;
    this.eSecondMobile = eSecondMobile;
  }

  public User(String id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the birthday
   */
  public String getBirthday() {
    return birthday;
  }

  /**
   * @param birthday the birthday to set
   */
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  /**
   * @return the comments
   */
  public String getComments() {
    return comments;
  }

  /**
   * @param comments the comments to set
   */
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the isDiver
   */
  public Boolean getIsDiver() {
    return isDiver;
  }

  /**
   * @param isDiver the isDiver to set
   */
  public void setIsDiver(Boolean isDiver) {
    this.isDiver = isDiver;
  }

  /**
   * @return the isTechnician
   */
  public Boolean getIsTechnician() {
    return isTechnician;
  }

  /**
   * @param isTechnician the isTechnician to set
   */
  public void setIsTechnician(Boolean isTechnician) {
    this.isTechnician = isTechnician;
  }

  /**
   * @return the isTrainer
   */
  public Boolean getIsTrainer() {
    return isTrainer;
  }

  /**
   * @param isTrainer the isTrainer to set
   */
  public void setIsTrainer(Boolean isTrainer) {
    this.isTrainer = isTrainer;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @return the secondMobile
   */
  public String getSecondMobile() {
    return secondMobile;
  }

  /**
   * @param secondMobile the secondMobile to set
   */
  public void setSecondMobile(String secondMobile) {
    this.secondMobile = secondMobile;
  }

  /**
   * @return the eContactMobile
   */
  public String geteContactMobile() {
    return eContactMobile;
  }

  /**
   * @param eContactMobile the eContactMobile to set
   */
  public void seteContactMobile(String eContactMobile) {
    this.eContactMobile = eContactMobile;
  }

  /**
   * @return the eFirstName
   */
  public String geteFirstName() {
    return eFirstName;
  }

  /**
   * @param eFirstName the eFirstName to set
   */
  public void seteFirstName(String eFirstName) {
    this.eFirstName = eFirstName;
  }

  /**
   * @return the eLastName
   */
  public String geteLastName() {
    return eLastName;
  }

  /**
   * @param eLastName the eLastName to set
   */
  public void seteLastName(String eLastName) {
    this.eLastName = eLastName;
  }

  /**
   * @return the eRelationship
   */
  public String geteRelationship() {
    return eRelationship;
  }

  /**
   * @param eRelationship the eRelationship to set
   */
  public void seteRelationship(String eRelationship) {
    this.eRelationship = eRelationship;
  }

  /**
   * @return the eSecondMobile
   */
  public String geteSecondMobile() {
    return eSecondMobile;
  }

  /**
   * @param eSecondMobile the eSecondMobile to set
   */
  public void seteSecondMobile(String eSecondMobile) {
    this.eSecondMobile = eSecondMobile;
  }

  /**
   * @return the isActive
   */
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * @param isActive the isActive to set
   */
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * @return the isAdministrator
   */
  public Boolean getIsAdministrator() {
    return isAdministrator;
  }

  /**
   * @param isAdministrator the isAdministrator to set
   */
  public void setIsAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
  }

  /**
   * @return the isContractor
   */
  public Boolean getIsContractor() {
    return isContractor;
  }

  /**
   * @param isContractor the isContractor to set
   */
  public void setIsContractor(Boolean isContractor) {
    this.isContractor = isContractor;
  }

  /**
   * @return the isIntern
   */
  public Boolean getIsIntern() {
    return isIntern;
  }

  /**
   * @param isIntern the isIntern to set
   */
  public void setIsIntern(Boolean isIntern) {
    this.isIntern = isIntern;
  }

  /**
   * @return the isPowerUser
   */
  public Boolean getIsPowerUser() {
    return isPowerUser;
  }

  /**
   * @param isPowerUser the isPowerUser to set
   */
  public void setIsPowerUser(Boolean isPowerUser) {
    this.isPowerUser = isPowerUser;
  }

  /**
   * @return the isStaff
   */
  public Boolean getIsStaff() {
    return isStaff;
  }

  /**
   * @param isStaff the isStaff to set
   */
  public void setIsStaff(Boolean isStaff) {
    this.isStaff = isStaff;
  }

  /**
   * @return the isUser
   */
  public Boolean getIsUser() {
    return isUser;
  }

  /**
   * @param isUser the isUser to set
   */
  public void setIsUser(Boolean isUser) {
    this.isUser = isUser;
  }

  /**
   * @return the isVolunteer
   */
  public Boolean getIsVolunteer() {
    return isVolunteer;
  }

  /**
   * @param isVolunteer the isVolunteer to set
   */
  public void setIsVolunteer(Boolean isVolunteer) {
    this.isVolunteer = isVolunteer;
  }

  
}