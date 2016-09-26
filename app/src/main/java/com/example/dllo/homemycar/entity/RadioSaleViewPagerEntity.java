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
 * Created by dllo on 16/9/21.
 */
public class RadioSaleViewPagerEntity  {

    /**
     * returncode : 0
     * message :
     * result : {"list":[{"id":9348,"url":"http://m.mall.autohome.com.cn/topic/2016/9/gcj/?isapp=1#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g14/M08/4C/2B/autohomecar__wKgH1Vfg55mAeFfCAAJ6WLXTx94140.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9344,"url":"http://m.1111.autohome.com.cn/#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g4/M10/50/05/autohomecar__wKgH2lfg8ZqAHpI_AAIwQFHA0CQ234.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9361,"url":"http://hd.j.autohome.com.cn/loan/loan/sqty#pvareaid=106574","imgurl":"http://app2.autoimg.cn/appdfs/g11/M0D/4F/C0/autohomecar__wKgH4VfhAHWAVvvAAAKRGlfYsiQ430.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9340,"url":"http://m.mall.autohome.com.cn/detail/142049-0-0.html#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g7/M10/50/26/autohomecar__wKgH3VfgoAGAb_7BAAJGaZ3s70s837.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9346,"url":"http://m.mall.autohome.com.cn/detail/89561-0-0.html#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g5/M04/4E/4E/autohomecar__wKjB0lfgzqyAZfTKAAKS9VNXLgY443.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0}],"charad":{"duration":0,"list":[]}}
     */

    private int returncode;
    private String message;
    /**
     * list : [{"id":9348,"url":"http://m.mall.autohome.com.cn/topic/2016/9/gcj/?isapp=1#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g14/M08/4C/2B/autohomecar__wKgH1Vfg55mAeFfCAAJ6WLXTx94140.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9344,"url":"http://m.1111.autohome.com.cn/#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g4/M10/50/05/autohomecar__wKgH2lfg8ZqAHpI_AAIwQFHA0CQ234.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9361,"url":"http://hd.j.autohome.com.cn/loan/loan/sqty#pvareaid=106574","imgurl":"http://app2.autoimg.cn/appdfs/g11/M0D/4F/C0/autohomecar__wKgH4VfhAHWAVvvAAAKRGlfYsiQ430.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9340,"url":"http://m.mall.autohome.com.cn/detail/142049-0-0.html#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g7/M10/50/26/autohomecar__wKgH3VfgoAGAb_7BAAJGaZ3s70s837.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0},{"id":9346,"url":"http://m.mall.autohome.com.cn/detail/89561-0-0.html#pvareaid=104735","imgurl":"http://app2.autoimg.cn/appdfs/g5/M04/4E/4E/autohomecar__wKjB0lfgzqyAZfTKAAKS9VNXLgY443.jpg","urlscheme":"","type":2,"appicon":"","siteindex":0}]
     * charad : {"duration":0,"list":[]}
     */

    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * duration : 0
         * list : []
         */

        private CharadBean charad;
        /**
         * id : 9348
         * url : http://m.mall.autohome.com.cn/topic/2016/9/gcj/?isapp=1#pvareaid=104735
         * imgurl : http://app2.autoimg.cn/appdfs/g14/M08/4C/2B/autohomecar__wKgH1Vfg55mAeFfCAAJ6WLXTx94140.jpg
         * urlscheme :
         * type : 2
         * appicon :
         * siteindex : 0
         */

        private List<ListBean> list;

        public CharadBean getCharad() {
            return charad;
        }

        public void setCharad(CharadBean charad) {
            this.charad = charad;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class CharadBean {
            private int duration;
            private List<?> list;

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }

        public static class ListBean {
            private int id;
            private String url;
            private String imgurl;
            private String urlscheme;
            private int type;
            private String appicon;
            private int siteindex;

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

            public String getUrlscheme() {
                return urlscheme;
            }

            public void setUrlscheme(String urlscheme) {
                this.urlscheme = urlscheme;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getAppicon() {
                return appicon;
            }

            public void setAppicon(String appicon) {
                this.appicon = appicon;
            }

            public int getSiteindex() {
                return siteindex;
            }

            public void setSiteindex(int siteindex) {
                this.siteindex = siteindex;
            }
        }
    }
}
