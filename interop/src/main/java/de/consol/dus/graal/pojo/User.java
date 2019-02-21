package de.consol.dus.graal.pojo;

import java.util.Date;
import java.util.Optional;

public class User {

  public static final String FMT = "User{name=%s, email=%s}";

  private String name;
  private String email;
  private Date creationDate;

  public static User of(String name, String email) {
    return of(name, email, new Date());
  }

  public static User of(String name, String email, Date creationDate) {
    return new User(name, email, creationDate);
  }

  public User(String name, String email) {
    this(name, email, new Date());
  }

  private User(String name, String email, Date creationDate) {
    Optional.of(name).ifPresent(this::setName);
    Optional.of(email).ifPresent(this::setEmail);
    Optional.of(creationDate).ifPresent(this::setCreationDate);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  private void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  @Override
  public String toString() {
    return String.format(FMT, this.getName(), this.getEmail());
  }
}
