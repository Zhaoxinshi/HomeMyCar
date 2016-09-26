package com.example.dllo.homemycar.custom; /*
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
 * Created by dllo on 16/9/23.
 */
public class Entity {
    private String sortLetters;

    public String getSortLetters() {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters) {
        this.sortLetters = sortLetters;
    }

    /**
     * returncode : 0
     * message : ok
     * result : {"timestamp":636099041294807770,"brandlist":[{"letter":"A","list":[{"id":117,"name":"AC Schnitzer","imgurl":"http://x.autoimg.cn/app/image/brands/117.png"},{"id":35,"name":"阿斯顿·马丁","imgurl":"http://x.autoimg.cn/app/image/brands/35.png"},{"id":221,"name":"安凯客车","imgurl":"http://x.autoimg.cn/app/image/brands/221.png"},{"id":33,"name":"奥迪","imgurl":"http://x.autoimg.cn/app/image/brands/33.png"}]},{"letter":"B","list":[{"id":140,"name":"巴博斯","imgurl":"http://x.autoimg.cn/app/image/brands/140.png"},{"id":120,"name":"宝骏","imgurl":"http://x.autoimg.cn/app/image/brands/120.png"},{"id":15,"name":"宝马","imgurl":"http://x.autoimg.cn/app/image/brands/15.png"},{"id":231,"name":"宝沃","imgurl":"http://x.autoimg.cn/app/image/brands/231.png"},{"id":40,"name":"保时捷","imgurl":"http://x.autoimg.cn/app/image/brands/40.png"},{"id":27,"name":"北京","imgurl":"http://x.autoimg.cn/app/image/brands/27.png"},{"id":203,"name":"北汽幻速","imgurl":"http://x.autoimg.cn/app/image/brands/203.png"},{"id":173,"name":"北汽绅宝","imgurl":"http://x.autoimg.cn/app/image/brands/27.png"},{"id":143,"name":"北汽威旺","imgurl":"http://x.autoimg.cn/app/image/brands/143.png"},{"id":208,"name":"北汽新能源","imgurl":"http://x.autoimg.cn/app/image/brands/208.png"},{"id":154,"name":"北汽制造","imgurl":"http://x.autoimg.cn/app/image/brands/154.png"},{"id":36,"name":"奔驰","imgurl":"http://x.autoimg.cn/app/image/brands/36.png"},{"id":95,"name":"奔腾","imgurl":"http://x.autoimg.cn/app/image/brands/95.png"},{"id":14,"name":"本田","imgurl":"http://x.autoimg.cn/app/image/brands/14.png"},{"id":75,"name":"比亚迪","imgurl":"http://x.autoimg.cn/app/image/brands/75.png?r=20150701?r=20150702"},{"id":13,"name":"标致","imgurl":"http://x.autoimg.cn/app/image/brands/13.png"},{"id":38,"name":"别克","imgurl":"http://x.autoimg.cn/app/image/brands/38.png?r=38"},{"id":39,"name":"宾利","imgurl":"http://x.autoimg.cn/app/image/brands/39.png"},{"id":37,"name":"布加迪","imgurl":"http://x.autoimg.cn/app/image/brands/37.png"}]},{"letter":"C","list":[{"id":79,"name":"昌河","imgurl":"http://x.autoimg.cn/app/image/brands/79.png?r=20150701?r=20150702"},{"id":76,"name":"长安","imgurl":"http://x.autoimg.cn/app/image/brands/76.png?r=20150701?r=20150702"},{"id":163,"name":"长安商用","imgurl":"http://x.autoimg.cn/app/image/brands/163.png"},{"id":77,"name":"长城","imgurl":"http://x.autoimg.cn/app/image/brands/77.png?r=20150701?r=20150702"},{"id":196,"name":"成功汽车","imgurl":"http://x.autoimg.cn/app/image/brands/196.png"}]},{"letter":"D","list":[{"id":169,"name":"DS","imgurl":"http://x.autoimg.cn/app/image/brands/169.png?r=20150515"},{"id":1,"name":"大众","imgurl":"http://x.autoimg.cn/app/image/brands/1.png"},{"id":41,"name":"道奇","imgurl":"http://x.autoimg.cn/app/image/brands/41.png"},{"id":32,"name":"东风","imgurl":"http://x.autoimg.cn/app/image/brands/32.png"},{"id":187,"name":"东风风度","imgurl":"http://x.autoimg.cn/app/image/brands/187.png"},{"id":259,"name":"东风风光","imgurl":"http://x.autoimg.cn/app/image/brands/259.png"},{"id":113,"name":"东风风神","imgurl":"http://x.autoimg.cn/app/image/brands/113.png"},{"id":165,"name":"东风风行","imgurl":"http://x.autoimg.cn/app/image/brands/165.png"},{"id":142,"name":"东风小康","imgurl":"http://x.autoimg.cn/app/image/brands/142.png?r=20150515"},{"id":81,"name":"东南","imgurl":"http://x.autoimg.cn/app/image/brands/81.png?r=20150701?r=20150702"}]},{"letter":"F","list":[{"id":42,"name":"法拉利","imgurl":"http://x.autoimg.cn/app/image/brands/42.png"},{"id":11,"name":"菲亚特","imgurl":"http://x.autoimg.cn/app/image/brands/11.png"},{"id":3,"name":"丰田","imgurl":"http://x.autoimg.cn/app/image/brands/3.png"},{"id":141,"name":"福迪","imgurl":"http://x.autoimg.cn/app/image/brands/141.png"},{"id":197,"name":"福汽启腾","imgurl":"http://x.autoimg.cn/app/image/brands/197.png"},{"id":8,"name":"福特","imgurl":"http://x.autoimg.cn/app/image/brands/8.png"},{"id":96,"name":"福田","imgurl":"http://x.autoimg.cn/app/image/brands/96.png"}]},{"letter":"G","list":[{"id":112,"name":"GMC","imgurl":"http://x.autoimg.cn/app/image/brands/112.png"},{"id":152,"name":"观致","imgurl":"http://x.autoimg.cn/app/image/brands/152.png"},{"id":116,"name":"光冈","imgurl":"http://x.autoimg.cn/app/image/brands/116.png"},{"id":82,"name":"广汽传祺","imgurl":"http://x.autoimg.cn/app/image/brands/82.png?r=20150701?r=20150702"},{"id":108,"name":"广汽吉奥","imgurl":"http://x.autoimg.cn/app/image/brands/108.png"}]},{"letter":"H","list":[{"id":24,"name":"哈飞","imgurl":"http://x.autoimg.cn/app/image/brands/24.png"},{"id":181,"name":"哈弗","imgurl":"http://x.autoimg.cn/app/image/brands/181.png"},{"id":150,"name":"海格","imgurl":"http://x.autoimg.cn/app/image/brands/150.png"},{"id":86,"name":"海马","imgurl":"http://x.autoimg.cn/app/image/brands/86.png"},{"id":267,"name":"汉腾汽车","imgurl":"http://x.autoimg.cn/app/image/brands/267.png"},{"id":43,"name":"悍马","imgurl":"http://x.autoimg.cn/app/image/brands/43.png"},{"id":164,"name":"恒天","imgurl":"http://x.autoimg.cn/app/image/brands/164.png"},{"id":91,"name":"红旗","imgurl":"http://x.autoimg.cn/app/image/brands/91.png"},{"id":245,"name":"华凯","imgurl":"http://x.autoimg.cn/app/image/brands/245.png"},{"id":237,"name":"华利","imgurl":"http://x.autoimg.cn/app/image/brands/237.png"},{"id":85,"name":"华普","imgurl":"http://x.autoimg.cn/app/image/brands/85.png"},{"id":220,"name":"华颂","imgurl":"http://x.autoimg.cn/app/image/brands/220_1.png"},{"id":87,"name":"华泰","imgurl":"http://x.autoimg.cn/app/image/brands/87.png?r=20150519"},{"id":260,"name":"华泰新能源","imgurl":"http://x.autoimg.cn/app/image/brands/260.png"},{"id":97,"name":"黄海","imgurl":"http://x.autoimg.cn/app/image/brands/97.png"}]},{"letter":"J","list":[{"id":46,"name":"Jeep","imgurl":"http://x.autoimg.cn/app/image/brands/46.png"},{"id":25,"name":"吉利汽车","imgurl":"http://x.autoimg.cn/app/image/brands/25.png"},{"id":84,"name":"江淮","imgurl":"http://x.autoimg.cn/app/image/brands/84.png?r=20160919"},{"id":119,"name":"江铃","imgurl":"http://x.autoimg.cn/app/image/brands/119.png"},{"id":210,"name":"江铃集团轻汽","imgurl":"http://x.autoimg.cn/app/image/brands/210.png"},{"id":270,"name":"江铃集团新能源","imgurl":"http://x.autoimg.cn/app/image/brands/270.png"},{"id":44,"name":"捷豹","imgurl":"http://x.autoimg.cn/app/image/brands/44.png"},{"id":83,"name":"金杯","imgurl":"http://x.autoimg.cn/app/image/brands/83.png?r=20150701?r=20150702"},{"id":145,"name":"金龙","imgurl":"http://x.autoimg.cn/app/image/brands/145.png"},{"id":175,"name":"金旅","imgurl":"http://x.autoimg.cn/app/image/brands/175.png"},{"id":151,"name":"九龙","imgurl":"http://x.autoimg.cn/app/image/brands/151.png"}]},{"letter":"K","list":[{"id":109,"name":"KTM","imgurl":"http://x.autoimg.cn/app/image/brands/109.png"},{"id":156,"name":"卡尔森","imgurl":"http://x.autoimg.cn/app/image/brands/156.png"},{"id":224,"name":"卡升","imgurl":"http://x.autoimg.cn/app/image/brands/224.png?636099041294807770"},{"id":199,"name":"卡威","imgurl":"http://x.autoimg.cn/app/image/brands/199_1.png"},{"id":101,"name":"开瑞","imgurl":"http://x.autoimg.cn/app/image/brands/101.png"},{"id":47,"name":"凯迪拉克","imgurl":"http://x.autoimg.cn/app/image/brands/47.png"},{"id":214,"name":"凯翼","imgurl":"http://x.autoimg.cn/app/image/brands/214_1.png"},{"id":219,"name":"康迪全球鹰","imgurl":"http://x.autoimg.cn/app/image/brands/219.png"},{"id":100,"name":"科尼赛克","imgurl":"http://x.autoimg.cn/app/image/brands/100.png"},{"id":9,"name":"克莱斯勒","imgurl":"http://x.autoimg.cn/app/image/brands/9.png"}]},{"letter":"L","list":[{"id":241,"name":"LOCAL MOTORS","imgurl":"http://x.autoimg.cn/app/image/brands/241.png"},{"id":48,"name":"兰博基尼","imgurl":"http://x.autoimg.cn/app/image/brands/48.png"},{"id":118,"name":"劳伦士","imgurl":"http://x.autoimg.cn/app/image/brands/118.png"},{"id":54,"name":"劳斯莱斯","imgurl":"http://x.autoimg.cn/app/image/brands/54.png"},{"id":215,"name":"雷丁","imgurl":"http://x.autoimg.cn/app/image/brands/215_1.png"},{"id":52,"name":"雷克萨斯","imgurl":"http://x.autoimg.cn/app/image/brands/52.png"},{"id":10,"name":"雷诺","imgurl":"http://x.autoimg.cn/app/image/brands/10.png?r=20150406"},{"id":124,"name":"理念","imgurl":"http://x.autoimg.cn/app/image/brands/124.png"},{"id":80,"name":"力帆汽车","imgurl":"http://x.autoimg.cn/app/image/brands/80.png?r=20150701?r=20150702"},{"id":89,"name":"莲花汽车","imgurl":"http://x.autoimg.cn/app/image/brands/89.png"},{"id":78,"name":"猎豹汽车","imgurl":"http://x.autoimg.cn/app/image/brands/78.png"},{"id":51,"name":"林肯","imgurl":"http://x.autoimg.cn/app/image/brands/51.png"},{"id":53,"name":"铃木","imgurl":"http://x.autoimg.cn/app/image/brands/53.png"},{"id":204,"name":"陆地方舟","imgurl":"http://x.autoimg.cn/app/image/brands/204.png"},{"id":88,"name":"陆风","imgurl":"http://x.autoimg.cn/app/image/brands/88.png?r=20150701?r=20150702"},{"id":49,"name":"路虎","imgurl":"http://x.autoimg.cn/app/image/brands/49.png"},{"id":50,"name":"路特斯","imgurl":"http://x.autoimg.cn/app/image/brands/50.png"}]},{"letter":"M","list":[{"id":20,"name":"MG","imgurl":"http://x.autoimg.cn/app/image/brands/20.png"},{"id":56,"name":"MINI","imgurl":"http://x.autoimg.cn/app/image/brands/56.png"},{"id":58,"name":"马自达","imgurl":"http://x.autoimg.cn/app/image/brands/58.png"},{"id":57,"name":"玛莎拉蒂","imgurl":"http://x.autoimg.cn/app/image/brands/57.png"},{"id":55,"name":"迈巴赫","imgurl":"http://x.autoimg.cn/app/image/brands/55.png"},{"id":129,"name":"迈凯伦","imgurl":"http://x.autoimg.cn/app/image/brands/129.png"},{"id":168,"name":"摩根","imgurl":"http://x.autoimg.cn/app/image/brands/168.png"}]},{"letter":"N","list":[{"id":130,"name":"纳智捷","imgurl":"http://x.autoimg.cn/app/image/brands/130.png"},{"id":213,"name":"南京金龙","imgurl":"http://x.autoimg.cn/app/image/brands/213.png"}]},{"letter":"O","list":[{"id":60,"name":"讴歌","imgurl":"http://x.autoimg.cn/app/image/brands/60.png"},{"id":59,"name":"欧宝","imgurl":"http://x.autoimg.cn/app/image/brands/59.png"},{"id":146,"name":"欧朗","imgurl":"http://x.autoimg.cn/app/image/brands/146.png"}]},{"letter":"P","list":[{"id":61,"name":"帕加尼","imgurl":"http://x.autoimg.cn/app/image/brands/61.png"}]},{"letter":"Q","list":[{"id":26,"name":"奇瑞","imgurl":"http://x.autoimg.cn/app/image/brands/26.png"},{"id":122,"name":"启辰","imgurl":"http://x.autoimg.cn/app/image/brands/122.png"},{"id":62,"name":"起亚","imgurl":"http://x.autoimg.cn/app/image/brands/62.png"},{"id":235,"name":"前途","imgurl":"http://x.autoimg.cn/app/image/brands/235.png?r=20150515"}]},{"letter":"R","list":[{"id":63,"name":"日产","imgurl":"http://x.autoimg.cn/app/image/brands/63.png"},{"id":19,"name":"荣威","imgurl":"http://x.autoimg.cn/app/image/brands/19.png"},{"id":174,"name":"如虎","imgurl":"http://x.autoimg.cn/app/image/brands/174.png"},{"id":103,"name":"瑞麒","imgurl":"http://x.autoimg.cn/app/image/brands/103.png"}]},{"letter":"S","list":[{"id":45,"name":"smart","imgurl":"http://x.autoimg.cn/app/image/brands/45.png"},{"id":205,"name":"赛麟","imgurl":"http://x.autoimg.cn/app/image/brands/205.png"},{"id":68,"name":"三菱","imgurl":"http://x.autoimg.cn/app/image/brands/68.png"},{"id":149,"name":"陕汽通家","imgurl":"http://x.autoimg.cn/app/image/brands/149.png"},{"id":155,"name":"上汽大通","imgurl":"http://x.autoimg.cn/app/image/brands/155.png"},{"id":66,"name":"世爵","imgurl":"http://x.autoimg.cn/app/image/brands/66.png"},{"id":90,"name":"双环","imgurl":"http://x.autoimg.cn/app/image/brands/90.png"},{"id":69,"name":"双龙","imgurl":"http://x.autoimg.cn/app/image/brands/69.png"},{"id":162,"name":"思铭","imgurl":"http://x.autoimg.cn/app/image/brands/162.png"},{"id":65,"name":"斯巴鲁","imgurl":"http://x.autoimg.cn/app/image/brands/65.png"},{"id":238,"name":"斯达泰克","imgurl":"http://x.autoimg.cn/app/image/brands/238.png"},{"id":67,"name":"斯柯达","imgurl":"http://x.autoimg.cn/app/image/brands/67.png"},{"id":269,"name":"斯威汽车","imgurl":"http://x.autoimg.cn/app/image/brands/269.png"}]},{"letter":"T","list":[{"id":202,"name":"泰卡特","imgurl":"http://x.autoimg.cn/app/image/brands/202.png"},{"id":133,"name":"特斯拉","imgurl":"http://x.autoimg.cn/app/image/brands/133.png"},{"id":161,"name":"腾势","imgurl":"http://x.autoimg.cn/app/image/brands/161.png"}]},{"letter":"W","list":[{"id":102,"name":"威麟","imgurl":"http://x.autoimg.cn/app/image/brands/102.png"},{"id":99,"name":"威兹曼","imgurl":"http://x.autoimg.cn/app/image/brands/99.png"},{"id":192,"name":"潍柴英致","imgurl":"http://x.autoimg.cn/app/image/brands/192.png"},{"id":70,"name":"沃尔沃","imgurl":"http://x.autoimg.cn/app/image/brands/70.png"},{"id":114,"name":"五菱汽车","imgurl":"http://x.autoimg.cn/app/image/brands/114.png"},{"id":167,"name":"五十铃","imgurl":"http://x.autoimg.cn/app/image/brands/167.png"}]},{"letter":"X","list":[{"id":98,"name":"西雅特","imgurl":"http://x.autoimg.cn/app/image/brands/98.png"},{"id":12,"name":"现代","imgurl":"http://x.autoimg.cn/app/image/brands/12.png"},{"id":185,"name":"新凯","imgurl":"http://x.autoimg.cn/app/image/brands/185.png"},{"id":71,"name":"雪佛兰","imgurl":"http://x.autoimg.cn/app/image/brands/71.png?2015100915"},{"id":72,"name":"雪铁龙","imgurl":"http://x.autoimg.cn/app/image/brands/72.png"}]},{"letter":"Y","list":[{"id":111,"name":"野马汽车","imgurl":"http://x.autoimg.cn/app/image/brands/111_1.png"},{"id":110,"name":"一汽","imgurl":"http://x.autoimg.cn/app/image/brands/110.png"},{"id":144,"name":"依维柯","imgurl":"http://x.autoimg.cn/app/image/brands/144.png"},{"id":73,"name":"英菲尼迪","imgurl":"http://x.autoimg.cn/app/image/brands/73.png"},{"id":93,"name":"永源","imgurl":"http://x.autoimg.cn/app/image/brands/93.png"},{"id":263,"name":"驭胜","imgurl":"http://x.autoimg.cn/app/image/brands/263.png"}]},{"letter":"Z","list":[{"id":206,"name":"知豆","imgurl":"http://x.autoimg.cn/app/image/brands/206.png"},{"id":22,"name":"中华","imgurl":"http://x.autoimg.cn/app/image/brands/22.png"},{"id":74,"name":"中兴","imgurl":"http://x.autoimg.cn/app/image/brands/74.png?r=20150701?r=20150702"},{"id":94,"name":"众泰","imgurl":"http://x.autoimg.cn/app/image/brands/94.png"}]}]}
     */

    private int returncode;
    private String message;
    /**
     * timestamp : 636099041294807770
     * brandlist : [{"letter":"A","list":[{"id":117,"name":"AC Schnitzer","imgurl":"http://x.autoimg.cn/app/image/brands/117.png"},{"id":35,"name":"阿斯顿·马丁","imgurl":"http://x.autoimg.cn/app/image/brands/35.png"},{"id":221,"name":"安凯客车","imgurl":"http://x.autoimg.cn/app/image/brands/221.png"},{"id":33,"name":"奥迪","imgurl":"http://x.autoimg.cn/app/image/brands/33.png"}]},{"letter":"B","list":[{"id":140,"name":"巴博斯","imgurl":"http://x.autoimg.cn/app/image/brands/140.png"},{"id":120,"name":"宝骏","imgurl":"http://x.autoimg.cn/app/image/brands/120.png"},{"id":15,"name":"宝马","imgurl":"http://x.autoimg.cn/app/image/brands/15.png"},{"id":231,"name":"宝沃","imgurl":"http://x.autoimg.cn/app/image/brands/231.png"},{"id":40,"name":"保时捷","imgurl":"http://x.autoimg.cn/app/image/brands/40.png"},{"id":27,"name":"北京","imgurl":"http://x.autoimg.cn/app/image/brands/27.png"},{"id":203,"name":"北汽幻速","imgurl":"http://x.autoimg.cn/app/image/brands/203.png"},{"id":173,"name":"北汽绅宝","imgurl":"http://x.autoimg.cn/app/image/brands/27.png"},{"id":143,"name":"北汽威旺","imgurl":"http://x.autoimg.cn/app/image/brands/143.png"},{"id":208,"name":"北汽新能源","imgurl":"http://x.autoimg.cn/app/image/brands/208.png"},{"id":154,"name":"北汽制造","imgurl":"http://x.autoimg.cn/app/image/brands/154.png"},{"id":36,"name":"奔驰","imgurl":"http://x.autoimg.cn/app/image/brands/36.png"},{"id":95,"name":"奔腾","imgurl":"http://x.autoimg.cn/app/image/brands/95.png"},{"id":14,"name":"本田","imgurl":"http://x.autoimg.cn/app/image/brands/14.png"},{"id":75,"name":"比亚迪","imgurl":"http://x.autoimg.cn/app/image/brands/75.png?r=20150701?r=20150702"},{"id":13,"name":"标致","imgurl":"http://x.autoimg.cn/app/image/brands/13.png"},{"id":38,"name":"别克","imgurl":"http://x.autoimg.cn/app/image/brands/38.png?r=38"},{"id":39,"name":"宾利","imgurl":"http://x.autoimg.cn/app/image/brands/39.png"},{"id":37,"name":"布加迪","imgurl":"http://x.autoimg.cn/app/image/brands/37.png"}]},{"letter":"C","list":[{"id":79,"name":"昌河","imgurl":"http://x.autoimg.cn/app/image/brands/79.png?r=20150701?r=20150702"},{"id":76,"name":"长安","imgurl":"http://x.autoimg.cn/app/image/brands/76.png?r=20150701?r=20150702"},{"id":163,"name":"长安商用","imgurl":"http://x.autoimg.cn/app/image/brands/163.png"},{"id":77,"name":"长城","imgurl":"http://x.autoimg.cn/app/image/brands/77.png?r=20150701?r=20150702"},{"id":196,"name":"成功汽车","imgurl":"http://x.autoimg.cn/app/image/brands/196.png"}]},{"letter":"D","list":[{"id":169,"name":"DS","imgurl":"http://x.autoimg.cn/app/image/brands/169.png?r=20150515"},{"id":1,"name":"大众","imgurl":"http://x.autoimg.cn/app/image/brands/1.png"},{"id":41,"name":"道奇","imgurl":"http://x.autoimg.cn/app/image/brands/41.png"},{"id":32,"name":"东风","imgurl":"http://x.autoimg.cn/app/image/brands/32.png"},{"id":187,"name":"东风风度","imgurl":"http://x.autoimg.cn/app/image/brands/187.png"},{"id":259,"name":"东风风光","imgurl":"http://x.autoimg.cn/app/image/brands/259.png"},{"id":113,"name":"东风风神","imgurl":"http://x.autoimg.cn/app/image/brands/113.png"},{"id":165,"name":"东风风行","imgurl":"http://x.autoimg.cn/app/image/brands/165.png"},{"id":142,"name":"东风小康","imgurl":"http://x.autoimg.cn/app/image/brands/142.png?r=20150515"},{"id":81,"name":"东南","imgurl":"http://x.autoimg.cn/app/image/brands/81.png?r=20150701?r=20150702"}]},{"letter":"F","list":[{"id":42,"name":"法拉利","imgurl":"http://x.autoimg.cn/app/image/brands/42.png"},{"id":11,"name":"菲亚特","imgurl":"http://x.autoimg.cn/app/image/brands/11.png"},{"id":3,"name":"丰田","imgurl":"http://x.autoimg.cn/app/image/brands/3.png"},{"id":141,"name":"福迪","imgurl":"http://x.autoimg.cn/app/image/brands/141.png"},{"id":197,"name":"福汽启腾","imgurl":"http://x.autoimg.cn/app/image/brands/197.png"},{"id":8,"name":"福特","imgurl":"http://x.autoimg.cn/app/image/brands/8.png"},{"id":96,"name":"福田","imgurl":"http://x.autoimg.cn/app/image/brands/96.png"}]},{"letter":"G","list":[{"id":112,"name":"GMC","imgurl":"http://x.autoimg.cn/app/image/brands/112.png"},{"id":152,"name":"观致","imgurl":"http://x.autoimg.cn/app/image/brands/152.png"},{"id":116,"name":"光冈","imgurl":"http://x.autoimg.cn/app/image/brands/116.png"},{"id":82,"name":"广汽传祺","imgurl":"http://x.autoimg.cn/app/image/brands/82.png?r=20150701?r=20150702"},{"id":108,"name":"广汽吉奥","imgurl":"http://x.autoimg.cn/app/image/brands/108.png"}]},{"letter":"H","list":[{"id":24,"name":"哈飞","imgurl":"http://x.autoimg.cn/app/image/brands/24.png"},{"id":181,"name":"哈弗","imgurl":"http://x.autoimg.cn/app/image/brands/181.png"},{"id":150,"name":"海格","imgurl":"http://x.autoimg.cn/app/image/brands/150.png"},{"id":86,"name":"海马","imgurl":"http://x.autoimg.cn/app/image/brands/86.png"},{"id":267,"name":"汉腾汽车","imgurl":"http://x.autoimg.cn/app/image/brands/267.png"},{"id":43,"name":"悍马","imgurl":"http://x.autoimg.cn/app/image/brands/43.png"},{"id":164,"name":"恒天","imgurl":"http://x.autoimg.cn/app/image/brands/164.png"},{"id":91,"name":"红旗","imgurl":"http://x.autoimg.cn/app/image/brands/91.png"},{"id":245,"name":"华凯","imgurl":"http://x.autoimg.cn/app/image/brands/245.png"},{"id":237,"name":"华利","imgurl":"http://x.autoimg.cn/app/image/brands/237.png"},{"id":85,"name":"华普","imgurl":"http://x.autoimg.cn/app/image/brands/85.png"},{"id":220,"name":"华颂","imgurl":"http://x.autoimg.cn/app/image/brands/220_1.png"},{"id":87,"name":"华泰","imgurl":"http://x.autoimg.cn/app/image/brands/87.png?r=20150519"},{"id":260,"name":"华泰新能源","imgurl":"http://x.autoimg.cn/app/image/brands/260.png"},{"id":97,"name":"黄海","imgurl":"http://x.autoimg.cn/app/image/brands/97.png"}]},{"letter":"J","list":[{"id":46,"name":"Jeep","imgurl":"http://x.autoimg.cn/app/image/brands/46.png"},{"id":25,"name":"吉利汽车","imgurl":"http://x.autoimg.cn/app/image/brands/25.png"},{"id":84,"name":"江淮","imgurl":"http://x.autoimg.cn/app/image/brands/84.png?r=20160919"},{"id":119,"name":"江铃","imgurl":"http://x.autoimg.cn/app/image/brands/119.png"},{"id":210,"name":"江铃集团轻汽","imgurl":"http://x.autoimg.cn/app/image/brands/210.png"},{"id":270,"name":"江铃集团新能源","imgurl":"http://x.autoimg.cn/app/image/brands/270.png"},{"id":44,"name":"捷豹","imgurl":"http://x.autoimg.cn/app/image/brands/44.png"},{"id":83,"name":"金杯","imgurl":"http://x.autoimg.cn/app/image/brands/83.png?r=20150701?r=20150702"},{"id":145,"name":"金龙","imgurl":"http://x.autoimg.cn/app/image/brands/145.png"},{"id":175,"name":"金旅","imgurl":"http://x.autoimg.cn/app/image/brands/175.png"},{"id":151,"name":"九龙","imgurl":"http://x.autoimg.cn/app/image/brands/151.png"}]},{"letter":"K","list":[{"id":109,"name":"KTM","imgurl":"http://x.autoimg.cn/app/image/brands/109.png"},{"id":156,"name":"卡尔森","imgurl":"http://x.autoimg.cn/app/image/brands/156.png"},{"id":224,"name":"卡升","imgurl":"http://x.autoimg.cn/app/image/brands/224.png?636099041294807770"},{"id":199,"name":"卡威","imgurl":"http://x.autoimg.cn/app/image/brands/199_1.png"},{"id":101,"name":"开瑞","imgurl":"http://x.autoimg.cn/app/image/brands/101.png"},{"id":47,"name":"凯迪拉克","imgurl":"http://x.autoimg.cn/app/image/brands/47.png"},{"id":214,"name":"凯翼","imgurl":"http://x.autoimg.cn/app/image/brands/214_1.png"},{"id":219,"name":"康迪全球鹰","imgurl":"http://x.autoimg.cn/app/image/brands/219.png"},{"id":100,"name":"科尼赛克","imgurl":"http://x.autoimg.cn/app/image/brands/100.png"},{"id":9,"name":"克莱斯勒","imgurl":"http://x.autoimg.cn/app/image/brands/9.png"}]},{"letter":"L","list":[{"id":241,"name":"LOCAL MOTORS","imgurl":"http://x.autoimg.cn/app/image/brands/241.png"},{"id":48,"name":"兰博基尼","imgurl":"http://x.autoimg.cn/app/image/brands/48.png"},{"id":118,"name":"劳伦士","imgurl":"http://x.autoimg.cn/app/image/brands/118.png"},{"id":54,"name":"劳斯莱斯","imgurl":"http://x.autoimg.cn/app/image/brands/54.png"},{"id":215,"name":"雷丁","imgurl":"http://x.autoimg.cn/app/image/brands/215_1.png"},{"id":52,"name":"雷克萨斯","imgurl":"http://x.autoimg.cn/app/image/brands/52.png"},{"id":10,"name":"雷诺","imgurl":"http://x.autoimg.cn/app/image/brands/10.png?r=20150406"},{"id":124,"name":"理念","imgurl":"http://x.autoimg.cn/app/image/brands/124.png"},{"id":80,"name":"力帆汽车","imgurl":"http://x.autoimg.cn/app/image/brands/80.png?r=20150701?r=20150702"},{"id":89,"name":"莲花汽车","imgurl":"http://x.autoimg.cn/app/image/brands/89.png"},{"id":78,"name":"猎豹汽车","imgurl":"http://x.autoimg.cn/app/image/brands/78.png"},{"id":51,"name":"林肯","imgurl":"http://x.autoimg.cn/app/image/brands/51.png"},{"id":53,"name":"铃木","imgurl":"http://x.autoimg.cn/app/image/brands/53.png"},{"id":204,"name":"陆地方舟","imgurl":"http://x.autoimg.cn/app/image/brands/204.png"},{"id":88,"name":"陆风","imgurl":"http://x.autoimg.cn/app/image/brands/88.png?r=20150701?r=20150702"},{"id":49,"name":"路虎","imgurl":"http://x.autoimg.cn/app/image/brands/49.png"},{"id":50,"name":"路特斯","imgurl":"http://x.autoimg.cn/app/image/brands/50.png"}]},{"letter":"M","list":[{"id":20,"name":"MG","imgurl":"http://x.autoimg.cn/app/image/brands/20.png"},{"id":56,"name":"MINI","imgurl":"http://x.autoimg.cn/app/image/brands/56.png"},{"id":58,"name":"马自达","imgurl":"http://x.autoimg.cn/app/image/brands/58.png"},{"id":57,"name":"玛莎拉蒂","imgurl":"http://x.autoimg.cn/app/image/brands/57.png"},{"id":55,"name":"迈巴赫","imgurl":"http://x.autoimg.cn/app/image/brands/55.png"},{"id":129,"name":"迈凯伦","imgurl":"http://x.autoimg.cn/app/image/brands/129.png"},{"id":168,"name":"摩根","imgurl":"http://x.autoimg.cn/app/image/brands/168.png"}]},{"letter":"N","list":[{"id":130,"name":"纳智捷","imgurl":"http://x.autoimg.cn/app/image/brands/130.png"},{"id":213,"name":"南京金龙","imgurl":"http://x.autoimg.cn/app/image/brands/213.png"}]},{"letter":"O","list":[{"id":60,"name":"讴歌","imgurl":"http://x.autoimg.cn/app/image/brands/60.png"},{"id":59,"name":"欧宝","imgurl":"http://x.autoimg.cn/app/image/brands/59.png"},{"id":146,"name":"欧朗","imgurl":"http://x.autoimg.cn/app/image/brands/146.png"}]},{"letter":"P","list":[{"id":61,"name":"帕加尼","imgurl":"http://x.autoimg.cn/app/image/brands/61.png"}]},{"letter":"Q","list":[{"id":26,"name":"奇瑞","imgurl":"http://x.autoimg.cn/app/image/brands/26.png"},{"id":122,"name":"启辰","imgurl":"http://x.autoimg.cn/app/image/brands/122.png"},{"id":62,"name":"起亚","imgurl":"http://x.autoimg.cn/app/image/brands/62.png"},{"id":235,"name":"前途","imgurl":"http://x.autoimg.cn/app/image/brands/235.png?r=20150515"}]},{"letter":"R","list":[{"id":63,"name":"日产","imgurl":"http://x.autoimg.cn/app/image/brands/63.png"},{"id":19,"name":"荣威","imgurl":"http://x.autoimg.cn/app/image/brands/19.png"},{"id":174,"name":"如虎","imgurl":"http://x.autoimg.cn/app/image/brands/174.png"},{"id":103,"name":"瑞麒","imgurl":"http://x.autoimg.cn/app/image/brands/103.png"}]},{"letter":"S","list":[{"id":45,"name":"smart","imgurl":"http://x.autoimg.cn/app/image/brands/45.png"},{"id":205,"name":"赛麟","imgurl":"http://x.autoimg.cn/app/image/brands/205.png"},{"id":68,"name":"三菱","imgurl":"http://x.autoimg.cn/app/image/brands/68.png"},{"id":149,"name":"陕汽通家","imgurl":"http://x.autoimg.cn/app/image/brands/149.png"},{"id":155,"name":"上汽大通","imgurl":"http://x.autoimg.cn/app/image/brands/155.png"},{"id":66,"name":"世爵","imgurl":"http://x.autoimg.cn/app/image/brands/66.png"},{"id":90,"name":"双环","imgurl":"http://x.autoimg.cn/app/image/brands/90.png"},{"id":69,"name":"双龙","imgurl":"http://x.autoimg.cn/app/image/brands/69.png"},{"id":162,"name":"思铭","imgurl":"http://x.autoimg.cn/app/image/brands/162.png"},{"id":65,"name":"斯巴鲁","imgurl":"http://x.autoimg.cn/app/image/brands/65.png"},{"id":238,"name":"斯达泰克","imgurl":"http://x.autoimg.cn/app/image/brands/238.png"},{"id":67,"name":"斯柯达","imgurl":"http://x.autoimg.cn/app/image/brands/67.png"},{"id":269,"name":"斯威汽车","imgurl":"http://x.autoimg.cn/app/image/brands/269.png"}]},{"letter":"T","list":[{"id":202,"name":"泰卡特","imgurl":"http://x.autoimg.cn/app/image/brands/202.png"},{"id":133,"name":"特斯拉","imgurl":"http://x.autoimg.cn/app/image/brands/133.png"},{"id":161,"name":"腾势","imgurl":"http://x.autoimg.cn/app/image/brands/161.png"}]},{"letter":"W","list":[{"id":102,"name":"威麟","imgurl":"http://x.autoimg.cn/app/image/brands/102.png"},{"id":99,"name":"威兹曼","imgurl":"http://x.autoimg.cn/app/image/brands/99.png"},{"id":192,"name":"潍柴英致","imgurl":"http://x.autoimg.cn/app/image/brands/192.png"},{"id":70,"name":"沃尔沃","imgurl":"http://x.autoimg.cn/app/image/brands/70.png"},{"id":114,"name":"五菱汽车","imgurl":"http://x.autoimg.cn/app/image/brands/114.png"},{"id":167,"name":"五十铃","imgurl":"http://x.autoimg.cn/app/image/brands/167.png"}]},{"letter":"X","list":[{"id":98,"name":"西雅特","imgurl":"http://x.autoimg.cn/app/image/brands/98.png"},{"id":12,"name":"现代","imgurl":"http://x.autoimg.cn/app/image/brands/12.png"},{"id":185,"name":"新凯","imgurl":"http://x.autoimg.cn/app/image/brands/185.png"},{"id":71,"name":"雪佛兰","imgurl":"http://x.autoimg.cn/app/image/brands/71.png?2015100915"},{"id":72,"name":"雪铁龙","imgurl":"http://x.autoimg.cn/app/image/brands/72.png"}]},{"letter":"Y","list":[{"id":111,"name":"野马汽车","imgurl":"http://x.autoimg.cn/app/image/brands/111_1.png"},{"id":110,"name":"一汽","imgurl":"http://x.autoimg.cn/app/image/brands/110.png"},{"id":144,"name":"依维柯","imgurl":"http://x.autoimg.cn/app/image/brands/144.png"},{"id":73,"name":"英菲尼迪","imgurl":"http://x.autoimg.cn/app/image/brands/73.png"},{"id":93,"name":"永源","imgurl":"http://x.autoimg.cn/app/image/brands/93.png"},{"id":263,"name":"驭胜","imgurl":"http://x.autoimg.cn/app/image/brands/263.png"}]},{"letter":"Z","list":[{"id":206,"name":"知豆","imgurl":"http://x.autoimg.cn/app/image/brands/206.png"},{"id":22,"name":"中华","imgurl":"http://x.autoimg.cn/app/image/brands/22.png"},{"id":74,"name":"中兴","imgurl":"http://x.autoimg.cn/app/image/brands/74.png?r=20150701?r=20150702"},{"id":94,"name":"众泰","imgurl":"http://x.autoimg.cn/app/image/brands/94.png"}]}]
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
        private long timestamp;
        /**
         * letter : A
         * list : [{"id":117,"name":"AC Schnitzer","imgurl":"http://x.autoimg.cn/app/image/brands/117.png"},{"id":35,"name":"阿斯顿·马丁","imgurl":"http://x.autoimg.cn/app/image/brands/35.png"},{"id":221,"name":"安凯客车","imgurl":"http://x.autoimg.cn/app/image/brands/221.png"},{"id":33,"name":"奥迪","imgurl":"http://x.autoimg.cn/app/image/brands/33.png"}]
         */

        private List<BrandlistBean> brandlist;

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public List<BrandlistBean> getBrandlist() {
            return brandlist;
        }

        public void setBrandlist(List<BrandlistBean> brandlist) {
            this.brandlist = brandlist;
        }

        public static class BrandlistBean {
            private String letter;
            /**
             * id : 117
             * name : AC Schnitzer
             * imgurl : http://x.autoimg.cn/app/image/brands/117.png
             */

            private List<ListBean> list;

            public String getLetter() {
                return letter;
            }

            public void setLetter(String letter) {
                this.letter = letter;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private int id;
                private String name;
                private String imgurl;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }
            }
        }
    }
}
