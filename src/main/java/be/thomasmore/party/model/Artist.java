package be.thomasmore.party.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
    public class Artist
    {
        @Id
        private Integer id;
        @Column (length = 1000)
        private String artistName;
        @Column (length = 1000)
        private String linkMoreInfo;
        @Column (length = 1000)
        private String genre;
        @Column (length = 1000)
        private String bio;
        @Column (length = 1000)
        private String portfolio;

        public Artist(int id, String artistName, String linkMoreInfo, String genre, String bio, String portfolio) {
            this.id = id;
            this.artistName = artistName;
            this.linkMoreInfo = linkMoreInfo;
            this.genre = genre;
            this.bio = bio;
            this.portfolio = portfolio;
        }

        public Artist() {

        }

        public Integer getId() {
            return id;
        }

        public String getArtistName() {
            return artistName;
        }

        public String getLinkMoreInfo() {
            return linkMoreInfo;
        }

        public String getGenre() {
            return genre;
        }

        public String getBio() {
            return bio;
        }

        public String getPortfolio() {
            return portfolio;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public void setLinkMoreInfo(String linkMoreInfo) {
            this.linkMoreInfo = linkMoreInfo;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public void setPortfolio(String portfolio) {
            this.portfolio = portfolio;
        }
    }
