package com.core.model.music;

public class SearchInfo {
    private Integer id;

    private String code;
    /** 状态 */
    private String status;
    /** 返回状态信息 */
    private String msg;
    /** 当前页数 */
    private Integer currentPage;
    /** 搜索字符 */
    private String keyword;
    /** 资源总数 */
    private Integer totalRows;
    /** 资源总页 */
    private Integer totalPage;
    /** 本页条数 */
    private Integer pagesize;
    /** 文件名称 */
    private String filename;
    /** 文件类型 */
    private String extname;
    /** m4a大小 */
    private Integer m4afilesize;
    /** 文件大小 */
    private Integer filesize;
    /** 比特率 */
    private Integer bitrate;
    /** 时候新歌 */
    private String isnew;
    /** 持续时间 */
    private Integer duration;
    /** 专辑名称 */
    private String aibumName;
    /** 歌手名称 */
    private String singername;
    /** 歌曲hash值 */
    private String hash;

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getExtname() {
        return extname;
    }

    public void setExtname(String extname) {
        this.extname = extname == null ? null : extname.trim();
    }

    public Integer getM4afilesize() {
        return m4afilesize;
    }

    public void setM4afilesize(Integer m4afilesize) {
        this.m4afilesize = m4afilesize;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew == null ? null : isnew.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getAibumName() {
        return aibumName;
    }

    public void setAibumName(String aibumName) {
        this.aibumName = aibumName == null ? null : aibumName.trim();
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername == null ? null : singername.trim();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }
}