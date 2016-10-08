package com.example.dllo.homemycar.entity;

import java.util.List;

/**
 * Created by Risky57 on 2016/10/8.
 */

public class VideoEntity {

    private ResultBean result;

    private int returncode;
    private String message;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class ResultBean {
        private boolean isloadmore;
        private int rowcount;
        private int pagecount;
        private int pageindex;

        private List<ListBean> list;

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
        }

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private int id;
            private String title;
            private String type;
            private String time;
            private String indexdetail;
            private String smallimg;
            private int replycount;
            private int playcount;
            private String nickname;
            private String videoaddress;
            private String shareaddress;
            private String updatetime;
            private String lastid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getIndexdetail() {
                return indexdetail;
            }

            public void setIndexdetail(String indexdetail) {
                this.indexdetail = indexdetail;
            }

            public String getSmallimg() {
                return smallimg;
            }

            public void setSmallimg(String smallimg) {
                this.smallimg = smallimg;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getVideoaddress() {
                return videoaddress;
            }

            public void setVideoaddress(String videoaddress) {
                this.videoaddress = videoaddress;
            }

            public String getShareaddress() {
                return shareaddress;
            }

            public void setShareaddress(String shareaddress) {
                this.shareaddress = shareaddress;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getLastid() {
                return lastid;
            }

            public void setLastid(String lastid) {
                this.lastid = lastid;
            }
        }
    }
}
