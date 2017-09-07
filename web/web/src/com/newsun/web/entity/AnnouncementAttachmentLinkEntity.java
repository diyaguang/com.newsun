package com.newsun.web.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:20 PM
 */
@Entity
@Table(name = "Announcement_Attachment_link", schema = "dygstudio", catalog = "")
public class AnnouncementAttachmentLinkEntity {
    private String id;
    private String announcementId;
    private String attachmentId;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AnnouncementID", nullable = true, length = 40)
    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    @Basic
    @Column(name = "AttachmentID", nullable = true, length = 40)
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnnouncementAttachmentLinkEntity that = (AnnouncementAttachmentLinkEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (announcementId != null ? !announcementId.equals(that.announcementId) : that.announcementId != null)
            return false;
        if (attachmentId != null ? !attachmentId.equals(that.attachmentId) : that.attachmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (announcementId != null ? announcementId.hashCode() : 0);
        result = 31 * result + (attachmentId != null ? attachmentId.hashCode() : 0);
        return result;
    }
}
