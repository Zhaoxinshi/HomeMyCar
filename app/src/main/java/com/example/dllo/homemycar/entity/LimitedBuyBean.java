package com.example.dllo.homemycar.entity;
//                .-~~~~~~~~~-._       _.-~~~~~~~~~-.
//            __.'              ~.   .~              `.__
//          .'//                  \./                   \\`.
//        .'//            为什么坚持  想一想当初             \\`.
//      .'// .-~"""""""~~~~-._     |     _,-~~~~"""""""~-.  \\`.
//    .'//.-"                 `-.  |  .-'                 "-. \\`.
//  .'//______.============-..   \ | /   ..-============._______\\`.
//.'//____________________________\|/_____________________________\\`.
// 
//                             

import java.util.List;

/**
 * Created by 7 on 16/8/22.
 */
public class LimitedBuyBean {

    /**
     * limitedbuy : {"starttime":"2016-08-20 00:00:00","endtime":"2016-08-23 00:00:00","limitedbuyinfo":[{"id":151,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=102958#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g16/M0C/07/96/autohomecar__wKgH11e2r2SAKsJWAAFfUNV8IiI727.jpg","type":1},{"id":152,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104668#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/06/AC/autohomecar__wKjB0le2r76ANk5SAAFqpOlMsBg752.jpg","type":1},{"id":153,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104688#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g4/M06/07/07/autohomecar__wKgHy1e2r9-AZ4S0AAFaHkx11NQ253.jpg","type":1},{"id":154,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=101778#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g11/M03/06/C2/autohomecar__wKjBzFe2sA6AXE-cAAEe16BNoM4719.jpg","type":1},{"id":155,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104440#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g23/M06/E8/C5/autohomecar__wKgFXFe2sCaAORTjAAGqSDsb_Fs161.jpg","type":1}]}
     */

    private ResultBean result;
    /**
     * result : {"limitedbuy":{"starttime":"2016-08-20 00:00:00","endtime":"2016-08-23 00:00:00","limitedbuyinfo":[{"id":151,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=102958#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g16/M0C/07/96/autohomecar__wKgH11e2r2SAKsJWAAFfUNV8IiI727.jpg","type":1},{"id":152,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104668#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/06/AC/autohomecar__wKjB0le2r76ANk5SAAFqpOlMsBg752.jpg","type":1},{"id":153,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104688#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g4/M06/07/07/autohomecar__wKgHy1e2r9-AZ4S0AAFaHkx11NQ253.jpg","type":1},{"id":154,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=101778#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g11/M03/06/C2/autohomecar__wKjBzFe2sA6AXE-cAAEe16BNoM4719.jpg","type":1},{"id":155,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104440#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g23/M06/E8/C5/autohomecar__wKgFXFe2sCaAORTjAAGqSDsb_Fs161.jpg","type":1}]}}
     * returncode : 0
     * message :
     */

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
        /**
         * starttime : 2016-08-20 00:00:00
         * endtime : 2016-08-23 00:00:00
         * limitedbuyinfo : [{"id":151,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=102958#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g16/M0C/07/96/autohomecar__wKgH11e2r2SAKsJWAAFfUNV8IiI727.jpg","type":1},{"id":152,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104668#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/06/AC/autohomecar__wKjB0le2r76ANk5SAAFqpOlMsBg752.jpg","type":1},{"id":153,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104688#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g4/M06/07/07/autohomecar__wKgHy1e2r9-AZ4S0AAFaHkx11NQ253.jpg","type":1},{"id":154,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=101778#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g11/M03/06/C2/autohomecar__wKjBzFe2sA6AXE-cAAEe16BNoM4719.jpg","type":1},{"id":155,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104440#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g23/M06/E8/C5/autohomecar__wKgFXFe2sCaAORTjAAGqSDsb_Fs161.jpg","type":1}]
         */

        private LimitedbuyBean limitedbuy;

        public LimitedbuyBean getLimitedbuy() {
            return limitedbuy;
        }

        public void setLimitedbuy(LimitedbuyBean limitedbuy) {
            this.limitedbuy = limitedbuy;
        }

        public static class LimitedbuyBean {
            private String starttime;
            private String endtime;
            /**
             * id : 151
             * url : http://java.jia.autohome.com.cn/mappweb/item/detail?spu=102958#pvareaid=2031179
             * imgurl : http://app2.autoimg.cn/appdfs/g16/M0C/07/96/autohomecar__wKgH11e2r2SAKsJWAAFfUNV8IiI727.jpg
             * type : 1
             */

            private List<LimitedbuyinfoBean> limitedbuyinfo;

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public String getEndtime() {
                return endtime;
            }

            public void setEndtime(String endtime) {
                this.endtime = endtime;
            }

            public List<LimitedbuyinfoBean> getLimitedbuyinfo() {
                return limitedbuyinfo;
            }

            public void setLimitedbuyinfo(List<LimitedbuyinfoBean> limitedbuyinfo) {
                this.limitedbuyinfo = limitedbuyinfo;
            }

            public static class LimitedbuyinfoBean {
                private int id;
                private String url;
                private String imgurl;
                private int type;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
            }
        }
    }
}
