package com.newsun.web.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.entity
 * User: diyaguang
 * Date: 2017-09-07 4:23 PM
 */
@Entity
@Table(name = "Todo_Attachment_Link", schema = "dygstudio", catalog = "")
public class TodoAttachmentLinkEntity {
    private String id;
    private String todoId;
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
    @Column(name = "TodoID", nullable = true, length = 40)
    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
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

        TodoAttachmentLinkEntity that = (TodoAttachmentLinkEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (todoId != null ? !todoId.equals(that.todoId) : that.todoId != null) return false;
        if (attachmentId != null ? !attachmentId.equals(that.attachmentId) : that.attachmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (todoId != null ? todoId.hashCode() : 0);
        result = 31 * result + (attachmentId != null ? attachmentId.hashCode() : 0);
        return result;
    }
}
