package com.example.dllo.homemycar.entity; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import java.util.List;

/**
 * Created by dllo on 16/9/22.
 */
//限时抢购
public class PurchaseEntity {

    /**
     * limitedbuy : {"starttime":"2016-09-22 00:00:00","endtime":"2016-09-27 00:00:00","limitedbuyinfo":[{"id":204,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104431#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g17/M02/4C/27/autohomecar__wKjBxlfjPpyADSzgAAEpFnH_EfI206.jpg","type":1},{"id":205,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=100102#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M05/51/C6/autohomecar__wKjBzVfjPsmALO_bAAFdTcdHzSc002.jpg","type":1},{"id":206,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104037#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M11/4F/B5/autohomecar__wKgH0VfjPumAGOhSAAF9ZQopeZk640.jpg","type":1},{"id":207,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104226#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M0F/4E/AE/autohomecar__wKgH1VfjPwqAIiuyAAFDhIyA4Wk421.jpg","type":1},{"id":208,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104810#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M10/52/3F/autohomecar__wKgH5FfjPyqAI4uyAAGEu8a4FKE936.jpg","type":1},{"id":209,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104819#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/50/58/autohomecar__wKgHzFfjP0mAbOPoAAGAm1OWKhE731.jpg","type":1}]}
     */

    private ResultBean result;
    /**
     * result : {"limitedbuy":{"starttime":"2016-09-22 00:00:00","endtime":"2016-09-27 00:00:00","limitedbuyinfo":[{"id":204,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104431#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g17/M02/4C/27/autohomecar__wKjBxlfjPpyADSzgAAEpFnH_EfI206.jpg","type":1},{"id":205,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=100102#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M05/51/C6/autohomecar__wKjBzVfjPsmALO_bAAFdTcdHzSc002.jpg","type":1},{"id":206,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104037#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M11/4F/B5/autohomecar__wKgH0VfjPumAGOhSAAF9ZQopeZk640.jpg","type":1},{"id":207,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104226#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M0F/4E/AE/autohomecar__wKgH1VfjPwqAIiuyAAFDhIyA4Wk421.jpg","type":1},{"id":208,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104810#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M10/52/3F/autohomecar__wKgH5FfjPyqAI4uyAAGEu8a4FKE936.jpg","type":1},{"id":209,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104819#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/50/58/autohomecar__wKgHzFfjP0mAbOPoAAGAm1OWKhE731.jpg","type":1}]}}
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
         * starttime : 2016-09-22 00:00:00
         * endtime : 2016-09-27 00:00:00
         * limitedbuyinfo : [{"id":204,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104431#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g17/M02/4C/27/autohomecar__wKjBxlfjPpyADSzgAAEpFnH_EfI206.jpg","type":1},{"id":205,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=100102#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M05/51/C6/autohomecar__wKjBzVfjPsmALO_bAAFdTcdHzSc002.jpg","type":1},{"id":206,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104037#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g10/M11/4F/B5/autohomecar__wKgH0VfjPumAGOhSAAF9ZQopeZk640.jpg","type":1},{"id":207,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104226#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M0F/4E/AE/autohomecar__wKgH1VfjPwqAIiuyAAFDhIyA4Wk421.jpg","type":1},{"id":208,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104810#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g14/M10/52/3F/autohomecar__wKgH5FfjPyqAI4uyAAGEu8a4FKE936.jpg","type":1},{"id":209,"url":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104819#pvareaid=2031179","imgurl":"http://app2.autoimg.cn/appdfs/g5/M0B/50/58/autohomecar__wKgHzFfjP0mAbOPoAAGAm1OWKhE731.jpg","type":1}]
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
             * id : 204
             * url : http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104431#pvareaid=2031179
             * imgurl : http://app2.autoimg.cn/appdfs/g17/M02/4C/27/autohomecar__wKjBxlfjPpyADSzgAAEpFnH_EfI206.jpg
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
