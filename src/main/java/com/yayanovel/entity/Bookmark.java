package com.yayanovel.entity;

public class Bookmark {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.BOOKMARK_ID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private Long bookmarkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.BOOKMARK_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String bookmarkUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.USER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String userUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.NOVEL_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String novelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.CHAPTER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String chapterUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.CHAPTER_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String chapterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.NOVEL_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String novelUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.TEXT1
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String text1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bookmark.TEXT2
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    private String text2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.BOOKMARK_ID
     *
     * @return the value of bookmark.BOOKMARK_ID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public Long getBookmarkId() {
        return bookmarkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.BOOKMARK_ID
     *
     * @param bookmarkId the value for bookmark.BOOKMARK_ID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setBookmarkId(Long bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.BOOKMARK_UID
     *
     * @return the value of bookmark.BOOKMARK_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getBookmarkUid() {
        return bookmarkUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.BOOKMARK_UID
     *
     * @param bookmarkUid the value for bookmark.BOOKMARK_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setBookmarkUid(String bookmarkUid) {
        this.bookmarkUid = bookmarkUid == null ? null : bookmarkUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.USER_UID
     *
     * @return the value of bookmark.USER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.USER_UID
     *
     * @param userUid the value for bookmark.USER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.NOVEL_NAME
     *
     * @return the value of bookmark.NOVEL_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getNovelName() {
        return novelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.NOVEL_NAME
     *
     * @param novelName the value for bookmark.NOVEL_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setNovelName(String novelName) {
        this.novelName = novelName == null ? null : novelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.CHAPTER_UID
     *
     * @return the value of bookmark.CHAPTER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getChapterUid() {
        return chapterUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.CHAPTER_UID
     *
     * @param chapterUid the value for bookmark.CHAPTER_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setChapterUid(String chapterUid) {
        this.chapterUid = chapterUid == null ? null : chapterUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.CHAPTER_NAME
     *
     * @return the value of bookmark.CHAPTER_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.CHAPTER_NAME
     *
     * @param chapterName the value for bookmark.CHAPTER_NAME
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.NOVEL_UID
     *
     * @return the value of bookmark.NOVEL_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getNovelUid() {
        return novelUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.NOVEL_UID
     *
     * @param novelUid the value for bookmark.NOVEL_UID
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setNovelUid(String novelUid) {
        this.novelUid = novelUid == null ? null : novelUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.TEXT1
     *
     * @return the value of bookmark.TEXT1
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getText1() {
        return text1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.TEXT1
     *
     * @param text1 the value for bookmark.TEXT1
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bookmark.TEXT2
     *
     * @return the value of bookmark.TEXT2
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public String getText2() {
        return text2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bookmark.TEXT2
     *
     * @param text2 the value for bookmark.TEXT2
     *
     * @mbg.generated Thu Oct 07 14:37:34 CST 2021
     */
    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }
}