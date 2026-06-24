package io.github.gautamKodes.vocabulary_webapp.users;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    private String username;

    private String provider;

    @Column(name = "provider_id")
    private String providerId;

    private String role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
        if (this.role == null){
            this.role = "ROLE_USER";
        }
    }

    //getters
    public Long getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public String getProvider(){
        return provider;
    }
    public String getProviderId(){
        return providerId;
    }
    public String getRole(){
        return role;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public User(){}

    public User(String email, String username, String provider, String providerId){
        this.email = email;
        this.username = username;
        this.provider = provider;
        this.providerId = providerId;
    }


}
