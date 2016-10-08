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
 * Created by dllo on 16/9/30.
 */
public class HeadHotNewCarEntity {

    /**
     * returncode : 0
     * message :
     * result : {"rowcount":0,"pagecount":10,"pageindex":1,"list":[{"firstletter":"D","id":1,"img":"http://x.autoimg.cn/app/image/brands/1.png","name":"大众","ordercount":797209},{"firstletter":"B","id":14,"img":"http://x.autoimg.cn/app/image/brands/14.png","name":"本田","ordercount":397520},{"firstletter":"F","id":3,"img":"http://x.autoimg.cn/app/image/brands/3.png","name":"丰田","ordercount":280297},{"firstletter":"X","id":12,"img":"http://x.autoimg.cn/app/image/brands/12.png","name":"现代","ordercount":260112},{"firstletter":"J","id":25,"img":"http://x.autoimg.cn/app/image/brands/25.png","name":"吉利汽车","ordercount":257001},{"firstletter":"H","id":181,"img":"http://x.autoimg.cn/app/image/brands/181.png","name":"哈弗","ordercount":212724},{"firstletter":"A","id":33,"img":"http://x.autoimg.cn/app/image/brands/33.png","name":"奥迪","ordercount":209051},{"firstletter":"F","id":8,"img":"http://x.autoimg.cn/app/image/brands/8.png","name":"福特","ordercount":197940},{"firstletter":"R","id":63,"img":"http://x.autoimg.cn/app/image/brands/63.png","name":"日产","ordercount":177640},{"firstletter":"B","id":38,"img":"http://x.autoimg.cn/app/image/brands/38.png?r=38","name":"别克","ordercount":166530}]}
     */

    private int returncode;
    private String message;
    /**
     * rowcount : 0
     * pagecount : 10
     * pageindex : 1
     * list : [{"firstletter":"D","id":1,"img":"http://x.autoimg.cn/app/image/brands/1.png","name":"大众","ordercount":797209},{"firstletter":"B","id":14,"img":"http://x.autoimg.cn/app/image/brands/14.png","name":"本田","ordercount":397520},{"firstletter":"F","id":3,"img":"http://x.autoimg.cn/app/image/brands/3.png","name":"丰田","ordercount":280297},{"firstletter":"X","id":12,"img":"http://x.autoimg.cn/app/image/brands/12.png","name":"现代","ordercount":260112},{"firstletter":"J","id":25,"img":"http://x.autoimg.cn/app/image/brands/25.png","name":"吉利汽车","ordercount":257001},{"firstletter":"H","id":181,"img":"http://x.autoimg.cn/app/image/brands/181.png","name":"哈弗","ordercount":212724},{"firstletter":"A","id":33,"img":"http://x.autoimg.cn/app/image/brands/33.png","name":"奥迪","ordercount":209051},{"firstletter":"F","id":8,"img":"http://x.autoimg.cn/app/image/brands/8.png","name":"福特","ordercount":197940},{"firstletter":"R","id":63,"img":"http://x.autoimg.cn/app/image/brands/63.png","name":"日产","ordercount":177640},{"firstletter":"B","id":38,"img":"http://x.autoimg.cn/app/image/brands/38.png?r=38","name":"别克","ordercount":166530}]
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
        private int rowcount;
        private int pagecount;
        private int pageindex;
        /**
         * firstletter : D
         * id : 1
         * img : http://x.autoimg.cn/app/image/brands/1.png
         * name : 大众
         * ordercount : 797209
         */

        private List<ListBean> list;

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
            private String firstletter;
            private int id;
            private String img;
            private String name;
            private int ordercount;

            public String getFirstletter() {
                return firstletter;
            }

            public void setFirstletter(String firstletter) {
                this.firstletter = firstletter;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOrdercount() {
                return ordercount;
            }

            public void setOrdercount(int ordercount) {
                this.ordercount = ordercount;
            }
        }
    }
}
