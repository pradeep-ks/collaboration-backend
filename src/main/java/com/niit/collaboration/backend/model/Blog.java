/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * The <code>Blog</code> class represents a Blog model, which acts as an Entity in the database.
 * This class contains basic information about a blog namely:-
 * <ul>
 * 	<li><code><strong>Blog's Title</strong></code></li>
 * 	<li><code><strong>Blog's Contents</strong></code></li>
 * 	<li><code><strong>Blog's Creation Date</strong></code></li>
 * 	<li><code><strong>Blog's Creator (User)</strong></code></li>
 * 	<li><code><strong>Blog's Status</strong></code></li>
 * </ul>
 * 
 * The blog's <code>status</code> can contain only one of the following values:-
 * <ul>
 * 	<li><strong>NEW</strong> When a blog is created.</li>
 * 	<li><strong>APPROVED</strong> When a blog is approved by Admin.</li>
 * 	<li><strong>REJECTED</strong> When a blog is rejected by Admin.</li>
 * </ul>
 */
package com.niit.collaboration.backend.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CP_BLOG", schema = "test")
public class Blog {

	/**
	 * This field represents auto-generated id of a blog.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long blogId;
	/**
	 * This field represents title of a blog.
	 */
	private String title;
	/**
	 * This field represents content of the blog.
	 */
	private String content;
	/**
	 * This field represents date of creation of a blog.
	 */
	private Date dateCreated;
	/**
	 * This field represents the blog creator. <code>@ManyToOne</code>
	 * annotation means <strong><em>ONE</em></strong> <code>User</code> 
	 * can create <strong><em>MANY</em></strong> blogs.
	 * <br>
	 * The <code>@JoinColumn</code> annotation represents the field in
	 * the {@code User} to establish relationship between a {@code Blog}
	 * and a {@code User}.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	/**
	 * This field represents a blog status.
	 */
	private String status;

	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
