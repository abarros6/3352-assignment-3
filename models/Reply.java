package models;

public class Reply extends Comment {
    private Comment parentComment;

    public void setParent(Comment parent) {
        this.parentComment = parent;
    }

    public Comment getParent() {
        return this.parentComment;
    }
}
