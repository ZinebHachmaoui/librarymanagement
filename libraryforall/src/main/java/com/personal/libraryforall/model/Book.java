package com.personal.libraryforall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String bookCode;
    private String title;
    private String description;
    private String author;
    private String publishingCompany;
    private String imageUrl;
    private String downloadLink;
    private String numberOfPages;
    private String language;
    private String publicationDate;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", downloadLink='" + downloadLink + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", language='" + language + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
